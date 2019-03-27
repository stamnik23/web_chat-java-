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
@Table(name = "BlockTracker")


public class BlockTracker implements Serializable {
	
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long friendRequestId;

    @Type(type = "uuid-char")
    private UUID externalId;
	
	private Timestamp block_date_time;
    
	private Timestamp date_block_ended;
	
	@ManyToOne(fetch = FetchType.EAGER)
    private User user_blocking;
	
    @ManyToOne(fetch = FetchType.EAGER)
    private User user_blocked;
	
    public BlockTracker(){
        this.externalId = UUID.randomUUID();
    }

	
}
	