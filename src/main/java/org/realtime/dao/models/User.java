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

   // @OneToMany(fetch = FetchType.EAGER,mappedBy = "user")
   // private RoomUserTracker roomUserTracker;

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



