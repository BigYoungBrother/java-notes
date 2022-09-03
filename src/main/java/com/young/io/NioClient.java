package com.young.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * nio客户端
 *
 * @author Young
 * @date 2022/09/03 20:31:31
 */

public class NioClient {
    public static void main(String[] args) {
        try {
            //得到一个SocketChannel
            SocketChannel socketChannel = SocketChannel.open();
            //设置非阻塞
            socketChannel.configureBlocking(false);
            //提供服务器端的ip和端口
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 9090);

            //连接服务器,非阻塞情况下，需要调用finishConnect
            /*
             * If this channel is in non-blocking mode then an invocation of this method initiates
             * a non-blocking connection operation. If the connectionis established immediately,
             * as can happen with a local connection, then this method returns true.
             * Otherwise this method returns false and the connection operation must
             * later be completed by invoking the finishConnect method.
             *
             * */
            if (!socketChannel.connect(inetSocketAddress)) {
                while (!socketChannel.finishConnect()) {
                    System.out.println("connect...");
                }
            }


            //如果连接成功，就发送数据
            String str = "hello, world";
            ByteBuffer buffer = ByteBuffer.allocate(str.length());
            buffer.put(str.getBytes());
            buffer.flip();

            //将数据写入 channel
            socketChannel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
