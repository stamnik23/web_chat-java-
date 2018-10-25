/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.web.dto;

import java.sql.Timestamp;
import java.util.UUID;
import org.realtime.dao.models.Messages;

/**
 *
 * @author nstamou
 */
public class MessagesDto {
    private UUID externalId;
    private Long id;
    private Timestamp time;
    private boolean read;
    private String content;
    
    public UUID getExternalId() {
        return externalId;
    }

    public void setExternalId(UUID externalId) {
        this.externalId = externalId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public boolean getisRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public MessagesDto (UUID externalId,Long Id,Timestamp time, boolean read, String Content){
        this.externalId=externalId;
        this.id=Id;
        this.read=read;
        this.content=Content;
       
    }
   public MessagesDto fromEntity(Messages messages) {      
       setExternalId(messages.getExternalId());
       setId(messages.getId());
       setTime(messages.getTime());
       setContent(messages.getContent());
       setRead(messages.isRead());
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
        messages.setRead(read);
        messages.setContent(content);

        
       return messages;
    }
}
