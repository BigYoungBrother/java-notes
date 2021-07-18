package com.young.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

import java.nio.charset.Charset;

/**
 * Netty Nio Client Handler
 *
 * @author Young
 * @Date 2021-07-18 10:23
 */
public class NettyNioClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            ByteBuf bb = (ByteBuf) msg;
            byte[] respByte = new byte[bb.readableBytes()];
            bb.readBytes(respByte);
            String respStr = new String(respByte, Charset.forName("utf8"));
            System.err.println("client收到响应：" + respStr);
        } finally {
            // 必须释放msg数据
            ReferenceCountUtil.release(msg);
        }
    }

    /**
     * 数据读取完毕的处理
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        System.err.println("客户端读取数据完毕");
    }

    /**
     * 出现异常的处理
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        System.err.println("client 读取数据出现异常");
        ctx.close();
    }
}
