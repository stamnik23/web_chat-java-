
package org.realtime.dao.models;

import java.io.BufferedReader;
import org.hibernate.annotations.Type;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter



public class BlockTrackerDto implements Serializable {
	
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
  
   public Timestamp getTimeBlockStarts() {
        return block_date_time;
    }
	
	public Timestamp getTimeBlockEnds() {
        return date_block_ended;
    }
	
	
	public void setTimeBlockStarts(Timestamp block_date_time) {
        this.block_date_time = block_date_time;
    }
	
	public void setTimeBlockEnds(Timestamp date_block_ended) {
        this.date_block_ended = date_block_ended;
    }	
	
	
	private Timestamp block_date_time;
	private Timestamp date_block_ended;
	
	
	
    public MessagesDto (long id,UUID externalId, Timestamp block_date_time, Timestamp date_block_ended){
        this.id=id;
        this.externalId=externalId;
        this.block_date_time = block_date_time;
        this.date_block_ended = date_block_ended;   
    }
	
	
	 public BlockTrackerDto fromEntity(BlockTracker blocktracker) {      
       setId(blocktracker.getId());
       setExternalId(blocktracker.getExternalId());
       setTimeBlockStarts(blocktracker.getTimeBlockStarts());
       setTimeBlockEnds(blocktracker.getTimeBlockEnds()); 
       return this;
   }   
   
   
    public BlockTracker toEntity() {
        BlockTracker blocktracker = new BlockTracker();

        return this.toEntity(blocktracker);
    }
   
   
     public BlockTracker toEntity(BlockTracker blocktracker){
        blocktracker.setId(id);
        blocktracker.setExternalId(externalId);
        blocktracker.setTimeBlockStarts(block_date_time);
        blocktracker.setTimeBlockEnds(date_block_ended);
        return blocktracker;
    }
   
   
   
	
}
	