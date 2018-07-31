package com.bran.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * 整个工程的全局配置
 * @author antiumbo
 * @date on 2018/7/31
 **/
public class NettyConfig {
    /**
     * 存储每一个客户端传进来的Channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
