package com.young.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;

/**
 * NettyClient
 *
 * @author Young
 * @Date 2021-07-18 10:18
 */
@Slf4j
public class NettyNioClient {

    public static void main(String[] args) {
        EventLoopGroup bossGroup = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap()
                .group(bossGroup)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        // 处理来自服务端的响应信息
                        socketChannel.pipeline().addLast(new NettyNioServerHandler());
                    }
                });
        try {
            ChannelFuture channelFuture = bootstrap.connect("127.0.0.1", 8080).sync();
            // 发送客户端的请求
            channelFuture.channel().writeAndFlush(Unpooled.copiedBuffer("我是客户端请求1".getBytes(Charset.forName("utf8"))));
            Thread.sleep(300);
            channelFuture.channel().writeAndFlush(Unpooled.copiedBuffer("我是客户端请求2".getBytes(Charset.forName("utf8"))));
            Thread.sleep(300);
            channelFuture.channel().writeAndFlush(Unpooled.copiedBuffer("我是客户端请求3".getBytes(Charset.forName("utf8"))));

            // 等待直到连接中断
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }

}
