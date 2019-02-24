/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.web.dto;

import java.io.Serializable;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.realtime.dao.models.Rooms;

/**
 *
 * @author nstamou
 */
@Getter
@Setter
public class RoomsDto implements Serializable {  
    
    private UUID roomId;
    private UUID userId;
    private UUID messageId;
    private String roomName;
    private int roomCapacity;
    
    public RoomsDto(UUID roomId,UUID userId, UUID messageId,String roomName, int roomCapacity) {
        this.roomId = roomId;
        this.userId = userId;
        this.messageId = messageId;
        this.roomName = roomName;
        this.roomCapacity = roomCapacity;

        }
    
    
    public RoomsDto fromEntity(Rooms rooms) {

        setRoomId(rooms.getRoomId());
        setUserId(rooms.getUserId());
        setMessageId(rooms.getMessageId());
        setRoomName(rooms.getRoomName());
        setRoomCapacity(rooms.getRoomCapacity());
        
        return this;
    }
    
     public Rooms toEntity() {
        Rooms rooms = new Rooms();

        return this.toEntity(rooms);
    }
     
     
     public Rooms toEntity(Rooms rooms){
        rooms.setUserId(userId);
        rooms.setRoomId(roomId);
        rooms.setMessageId(messageId);
        rooms.setRoomName(roomName);
        rooms.setRoomCapacity(roomCapacity);

        
       return rooms;
    }
    
    
    public UUID getRoomId() {
        return roomId;
    }

    public void setRoomId(UUID roomId) {
        this.roomId = roomId;
    }
    
    public UUID getMessageId() {
        return messageId;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }
    public UUID getId() {
        return userId;
    }

    public void setId(UUID userId) {
        this.userId = userId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }
        
    
    
}