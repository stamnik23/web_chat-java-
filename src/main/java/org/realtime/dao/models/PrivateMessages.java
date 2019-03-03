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

import java.util.List;
import java.util.Set;
import java.util.UUID;


@Entity
@Getter
@Setter
@Table(name = "PrivateMessages")



public class PrivateMessages implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp time;
    private boolean seen;

    @Type(type = "uuid-char")
    private UUID externalId;

    @Type(type = "text")
    private String content;
	
    @ManyToOne(fetch = FetchType.EAGER)
    private PrivateChat privatechat;
 
    public PrivateMessages(){
        this.externalId = UUID.randomUUID();
    }

}