package com.young.io;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * BIO服务器
 *
 * @author Young
 * @date 2022/09/03 16:59:02
 */
@Slf4j
public class BioServer {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(8, 8
                , 30, TimeUnit.SECONDS
                , new LinkedBlockingQueue<>(1024)
                , Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.DiscardPolicy());

        try {
            ServerSocket ss = new ServerSocket(8080);
            log.info("服务端启动成功....");
            while (true) {
                Socket socket = ss.accept();
                log.info("接受连接...");
                executor.execute(() -> handler(socket));
            }
        } catch (IOException e) {
            log.error("服务端报错", e);
        }

    }

    private static void handler(Socket socket) {
        try {
            // 用于存放读取数据的字节数组
            byte[] bytes = new byte[512];
            // 通过socket获取输入流
            InputStream inputStream = socket.getInputStream();
            // 循环读取客户端发送端的数据
            String serverInfo = "Thread id =" + Thread.currentThread().getId() + " " + "name:" + Thread.currentThread().getName();
            log.info(serverInfo);
            log.info("read ...");
            // 输入流把数据读取到bytes中，返回读取数据的个数
            int read = inputStream.read(bytes);
            // 把客户端发送的数据从字节转化为字符串输出
            String rcvString = new String(bytes, 0, read);
            log.info("客户端数据为: \n{}", rcvString);
            socket.getOutputStream().write(serverInfo.getBytes(Charset.forName("UTF8")));
        } catch (Exception e) {
            log.error("读取数据出错", e);
        } finally {
            log.info("关闭和client的连接");
            try {
                socket.close();
            } catch (Exception e) {
                log.error("关闭和client的连接报错", e);
            }
        }
    }

}
