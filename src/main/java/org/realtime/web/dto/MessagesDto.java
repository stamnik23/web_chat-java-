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
    
    private long id;
    private UUID externalId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getExternalId() {
        return externalId;
    }

    public void setExternalId(UUID externalId) {
        this.externalId = externalId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public boolean isSeen() {
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

    private Timestamp time;
    private boolean seen;
    private String content;
    

    
    public MessagesDto (Long id,UUID externalId,Timestamp time, boolean seen, String Content){
        this.id=id;
        this.externalId=externalId;
        this.seen=seen;
        this.content=Content;
        this.time=time;
       
    }
   public MessagesDto fromEntity(Messages messages) {      
       setId(messages.getId());
       setExternalId(messages.getExternalId());
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
        messages.setId(id);
        messages.setExternalId(externalId);
        messages.setTime(time);
        messages.setSeen(seen);
        messages.setContent(content);

        
       return messages;
    }
}
