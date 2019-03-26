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
public class RoomUserTrackerDto {
    
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
        return exit_time;
    }

    public void setTime(Timestamp exit_time) {
        this.exit_time = exit_time;
    }

    private Timestamp exit_time;
   
    public RoomUserTrackerDto(UUID externalId, long id, Timestamp exit_time) {

        this.externalId = externalId;
        this.id = id;
        this.exit_time = exit_time;

    }
	
	public RoomUserTrackerDto fromEntity(RoomUserTracker roomusertracker) {      
       setId(roomusertracker.getId());
       setExternalId(roomusertracker.getExternalId());
       setTime(roomusertracker.getTime());
       return this;
   } 


    public RoomUserTracker toEntity() {
      RoomUserTracker roomusertracker = new RoomUserTracker();
      return this.toEntity(roomusertracker);
    }
	
	
	public RoomUserTracker toEntity(RoomUserTracker roomusertracker){
		
        roomusertracker.setId(id);
        roomusertracker.setExternalId(externalId);
        roomusertracker.setTime(exit_time);
        return roomusertracker;
    }
   
}
