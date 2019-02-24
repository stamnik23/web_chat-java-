/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.web.dto;

import java.io.BufferedReader;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;
import org.realtime.dao.models.Messages;


/**
 *
 * @author nstamou
 */
public class MessagesDto {
    
    private UUID userId;
    private UUID messageId;
    private Timestamp time;
    private boolean seen;
    private String content;
    
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getMessageId() {
        return messageId;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public boolean getisSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public MessagesDto (UUID userId,UUID messageId,Timestamp time, boolean seen, String Content){
        this.userId=userId;
        this.messageId=messageId;
        this.seen=seen;
        this.content=Content;
        this.time=time;
       
    }
   public MessagesDto fromEntity(Messages messages) {      
       setMessageId(messages.getMessageId());
       setUserId(messages.getUserId());
       setTime(messages.getTime());
       setContent(messages.getContent());
       setSeen(messages.isSeen());
       return this;
   }   
   
   public Messages toEntity() {
        Messages messages = new Messages();

        return this.toEntity(messages);
    }
   
   
    public Messages toEntity(Messages messages){
        messages.setUserId(userId);
        messages.setMessageId(messageId);
        messages.setTime(time);
        messages.setSeen(seen);
        messages.setContent(content);

        
       return messages;
    }
}
