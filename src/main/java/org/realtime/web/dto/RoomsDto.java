/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.web.dto;

import java.util.UUID;
import org.realtime.dao.models.Rooms;

/**
 *
 * @author nstamou
 */
public class RoomsDto {
    private UUID externalId;
    private Long id;
    private String roomName;
    private int roomCapacity;
    
    public RoomsDto(UUID externalId,Long Id, String roomName, int roomCapacity) {
        this.externalId = externalId;
        this.id = Id;
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
        rooms.setId(id);
        rooms.setExternalId(externalId);
        rooms.setRoomName(roomName);
        rooms.setRoomCapacity(roomCapacity);

        
       return rooms;
    }
    
    
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
        
    
    
}
