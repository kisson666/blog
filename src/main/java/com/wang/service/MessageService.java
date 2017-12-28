package com.wang.service;

import com.wang.model.Message;

import java.util.List;

/**
 * Created by hppc on 2017/1/25.
 */
public interface MessageService {
    List<Message> getnotreadmessages(String articleauthorid);
    List<Message> allmessagesfrommyself(String id);
    List<Message> allmessagebycid(int cid);
    String deletemessageBymid(int mid);
    String addmessage(String content,String id, int cid);

}
