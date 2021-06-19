package com.young.design.pattern.behavior.intermediary;

import java.util.Date;

/**
 * 聊天室
 *
 * @author Young
 * @Date 2021-06-19 20:22
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
