/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.dao.models;

import org.hibernate.annotations.Type;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "User")
public class User implements Serializable {
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;

    @Type(type = "uuid-char")
    private UUID externalId;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user")
    Set<RoomUserTracker> roomUserTracker;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user_initialiazer")
    Set<PrivateChat> privatechat;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user_receiver")
    Set<PrivateChat> privateChat;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user_requesting")
    Set<FriendRequestTracker> friendrequesttracker;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user_requested")
    Set<FriendRequestTracker> friendrequestTracker;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user_blocking")
    Set<BlockTracker> blocktracker;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user_blocked")
    Set<BlockTracker> blockTracker;
	
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user_reporting")
    Set<ReportTracker> reporttracker;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user_reported")
    Set<ReportTracker> reporTracker;
	
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isAdmin;
    private String registrationDate;



    public User(){
        this.externalId = UUID.randomUUID();
        this.isAdmin = false;
    }

}



