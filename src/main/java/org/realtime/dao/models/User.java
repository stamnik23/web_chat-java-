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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Type(type = "uuid-char")
    private UUID userId;

  
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "User")
    private Set<Messages> messages;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy="User")
    private Set<RoomUserTracker> RoomUserTracker;
    

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isAdmin;
    private String registrationDate;
    private UUID messageId;
    private UUID roomId;
    
      
    public User() {
        this.userId = UUID.randomUUID();
    }

       // @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
     //   Set<Messages> messages;
}