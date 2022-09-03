package com.young.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * nio服务器
 *
 * @author Young
 * @date 2022/09/03 20:29:19
 */
public class NioServer {

    public static void main(String[] args) {
        try {
            //得到一个Selector对象（多路复用器）
            Selector selector = Selector.open();
            //Windows下: sun.nio.ch.WindowsSelectorImpl
            //Linux下:   sun.nio.ch.EPollSelectorImpl
            System.out.println(selector.getClass());
            //创建ServerSocketChannel,类似于BIO中的ServerSocket
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            //绑定端口9090
            serverSocketChannel.bind(new InetSocketAddress(9090));
            //设置为非阻塞
            serverSocketChannel.configureBlocking(false);
            //将serverSocketChannel注册到selector上，关注OP_ACCEPT
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            //循环等待客户端连接
            while (true) {
                selector.select();
                //返回selector得到的结果集
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                //遍历 Set<SelectionKey>, 使用迭代器遍历
                Iterator<SelectionKey> keyIterator = selectionKeys.iterator();

                while (keyIterator.hasNext()) {
                    //获取到SelectionKey
                    SelectionKey selectionKey = keyIterator.next();
                    //根据key 对应的channel发生的事件做相应处理
                    if (selectionKey.isValid()) {
                        // OP_ACCEPT, 有新的客户端连接
                        if (selectionKey.isAcceptable()) {
                            //客户端生成SocketChannel
                            SocketChannel socketChannel = serverSocketChannel.accept();
                            // SocketChannel 设置为非阻塞
                            socketChannel.configureBlocking(false);
                            //将socketChannel 注册到selector, 关注OP_READ，同时给socketChannel关联一个Buffer
                            socketChannel.register(selector, SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                        }
                        //OP_READ，有数据可以读
                        if (selectionKey.isReadable()) {
                            //通过selectionKey获取到对应channel
                            SocketChannel channel = (SocketChannel) selectionKey.channel();
                            //获取到该channel关联的buffer
                            ByteBuffer buffer = (ByteBuffer) selectionKey.attachment();
                            channel.read(buffer);
                            System.out.println("form Client:" + new String(buffer.array()).trim());
                        }
                    }
                    //从集合中移动当前的selectionKey
                    keyIterator.remove();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
