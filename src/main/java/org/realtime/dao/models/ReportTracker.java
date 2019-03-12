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
@Table(name = "ReportTracker")


public class ReportTracker implements Serializable {
	
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long friendRequestId;

    @Type(type = "uuid-char")
    private UUID externalId;
	
	private Timestamp report_date_time;
    	
	@ManyToOne(fetch = FetchType.EAGER)
    private User user_reporting;
	
    @ManyToOne(fetch = FetchType.EAGER)
    private User user_reported;
	
    public ReportTracker(){
        this.externalId = UUID.randomUUID();
    }

	
}