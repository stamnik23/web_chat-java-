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
    
    private UUID externalId;

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

    private Long id;

    private String roomName;
    private int roomCapacity;
    
    public RoomsDto(UUID externalId, Long id,String roomName, int roomCapacity) {

        this.externalId = externalId;
        this.id = id;
        this.roomName = roomName;
        this.roomCapacity = roomCapacity;

        }
    
    
    public RoomsDto fromEntity(Rooms rooms) {

        setExternalId(rooms.getExternalId());
          setId(rooms.getId());

        setRoomName(rooms.getRoomName());
        setRoomCapacity(rooms.getRoomCapacity());
        
        return this;
    }
    
     public Rooms toEntity() {
        Rooms rooms = new Rooms();

        return this.toEntity(rooms);
    }
     
     
     public Rooms toEntity(Rooms rooms){
//        rooms.setUserId(userId);
        rooms.setExternalId(externalId);
        rooms.setId(id);
        rooms.setRoomName(roomName);
        rooms.setRoomCapacity(roomCapacity);

        
       return rooms;
    }
    
    

    
}