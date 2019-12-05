package com.itheima.ActiveMQ;

import javax.swing.JOptionPane;

import cn.hutool.core.util.NetUtil;
//工具类，用于判断 activemq 服务器是否启动
public class ActiveMQUtil {
	 
    public static void main(String[] args) {
        checkServer();
    }
    public static void checkServer() {
        if(NetUtil.isUsableLocalPort(8161)) {
            JOptionPane.showMessageDialog(null, "ActiveMQ 服务器未启动 ");
            System.exit(1);
        }
    }
}