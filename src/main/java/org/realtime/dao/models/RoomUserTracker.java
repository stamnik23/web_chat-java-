/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.dao.models;


import java.io.BufferedReader;
import org.hibernate.annotations.Type;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Types;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "RoomUserTracker")



public class RoomUserTracker implements Serializable {
	
	@Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private UUID externalId;
	
    @ManyToOne(fetch=FetchType.EAGER)
    private Rooms Rooms;
    
	@ManyToOne(fetch=FetchType.EAGER)
    private User User;
	
	
	private Timestamp entry_time;
	private Timestamp exit_time;
	
	
     public RoomUserTracker() {
        this.externalId = UUID.randomUUID();
    }
}
	