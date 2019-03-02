/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.dao.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.realtime.dao.Enums.CountriesList;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Countries")



public class Countries implements Serializable {
 
    
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Type(type = "uuid-char")
    private UUID externalId;

    @Enumerated(EnumType.STRING)
    private CountriesList countryName;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "countries")
    private Rooms Rooms;
     

   

    
    

}