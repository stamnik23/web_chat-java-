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
public class FriendRequestTrackerDto {
    
	
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
	
	 public Timestamp getTimeStarted() {
        return action_date_time;
    }

    public void setTimeStarted(Timestamp action_date_time) {
        this.action_date_time = action_date_time;
    }
	

    public Timestamp getTimeEnded() {
        return date_friendship_ended;
    }

    public void setTimeEnded(Timestamp date_friendship_ended) {
        this.date_friendship_ended = date_friendship_ended;
    }

	
	public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
	
	
	private boolean accepted;
	
	
	
	public FriendRequestTrackerDto (long id,UUID externalId,Timestamp action_date_time, Timestamp date_friendship_ended ,boolean accepted){
        this.id=id;
        this.externalId=externalId;
        this.accepted=accepted;
        this.action_date_time=action_date_time;
        this.date_friendship_ended=date_friendship_ended;
    }
	
	
	public FriendRequestTrackerDto fromEntity(FriendRequestTracker friendfequesttracker) {      
       setId(friendfequesttracker.getId());
       setExternalId(friendfequesttracker.getExternalId());
       setTimeStarted(friendfequesttracker.getTimeStarted());
	   setTimeEnded(friendfequesttracker.getTimeEnded());
       setAccepted(messages.isAccepted());
       return this;
   }   
	
	
	public FriendRequestTracker toEntity() {
        FriendRequestTracker friendfequesttracker = new FriendRequestTracker();

        return this.toEntity(friendfequesttracker);
    }
    
	  public FriendRequestTracker toEntity(FriendRequestTracker friendfequesttracker){
        friendfequesttracker.setId(id);
        friendfequesttracker.setExternalId(externalId);
        friendfequesttracker.setTimeStarted(action_date_time);
	    friendfequesttracker.setTimeEnded(date_friendship_ended);
        friendfequesttracker.setAccepted(Accepted);
        return friendfequesttracker;
    }
	
	
}
