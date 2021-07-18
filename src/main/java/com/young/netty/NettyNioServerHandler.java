package com.young.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;

/**
 * Netty Nio Server Handler
 *
 * @author Young
 * @Date 2021-07-18 09:49
 */
public class NettyNioServerHandler extends ChannelInboundHandlerAdapter {
    /**
     * 读取数据
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf bb = (ByteBuf) msg;
        // 创建一个和buf同等长度的字节数组
        byte[] reqByte = new byte[bb.readableBytes()];
        // 将buf中的数据读取到数组中
        bb.readBytes(reqByte);
        System.err.println("server 接收到客户端的请求： " + new String(reqByte, Charset.forName("utf8")));
        // 返回给客户端响应 和客户端链接中断即短连接，当信息返回给客户端后中断 .addListener(ChannelFutureListener.CLOSE)
        ctx.writeAndFlush(Unpooled.copiedBuffer(reqByte));
    }

    /**
     * 数据读取完毕的处理
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        System.err.println("服务端读取数据完毕");
    }

    /**
     * 出现异常的处理
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        System.err.println("server 读取数据出现异常");
        ctx.close();
    }
}
