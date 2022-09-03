package com.young.io;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Bio客户端
 *
 * @author Young
 * @date 2022/09/03 20:19:47
 */
@Slf4j
public class BioClient {


    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(8, 8
                , 30, TimeUnit.SECONDS
                , new LinkedBlockingQueue<>(1024)
                , Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.DiscardPolicy());
        while (true) {
            executor.execute(() -> doReq());
        }

    }

    private static void doReq() {
        try {
            Socket s = new Socket("127.0.0.1", 8080);
            //构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            //向服务器端发送一条消息
            bw.write("我是客户端的消息");
            bw.flush();

            //读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println("服务器：" + mess);
        } catch (IOException e) {
            log.error("客户端错误", e);
        }
    }
}
