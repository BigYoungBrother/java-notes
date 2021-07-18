package com.young.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Netty Nio Server
 *
 * @author Young
 * @Date 2021-07-18 09:22
 */
@Slf4j
public class NettyNioServer {

    public static void main(String[] args) {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        ServerBootstrap serverBootstrap = new ServerBootstrap()
                .group(bossGroup, workerGroup)
                // 说明一个新的Channel如何接收进来的连接
                .channel(NioServerSocketChannel.class)
                // tcp最大缓存链接个数
                .option(ChannelOption.SO_BACKLOG, 1024)
                //保持连接
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.TCP_NODELAY, true)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) {
                        // 网络超时时间
                        socketChannel.pipeline().addLast(new ReadTimeoutHandler(5));
                        // 处理接收到的请求， 这里相当于过滤器，可以配置多个
                        socketChannel.pipeline().addLast(new NettyNioServerHandler());
                    }
                });

        try {
            log.info("Netty Nio Server starting...");
            ChannelFuture cf = serverBootstrap.bind("127.0.0.1", 8080).sync();
            log.info("Netty Nio Server started...");
            // 等待服务端口的关闭；在这个例子中不会发生，但你可以优雅实现；关闭你的服务
            cf.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

}
