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
@Table(name = "Messages")



public class Messages implements Serializable {
 
    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID messageId;
    
    
    private UUID userId;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User user;
    
    
    
    private Timestamp time;
    private boolean seen;
    
    private UUID roomId;
    
    
    
   @Type(type = "text")
    private String content;

        public Messages() {
        this.messageId = UUID.randomUUID();
    }
    
}