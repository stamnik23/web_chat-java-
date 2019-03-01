
package org.realtime.dao.models;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Rooms")



public class Rooms implements Serializable {
 
    
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID roomId;
 
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "Rooms")
    private Set<Messages> Messages;
     
	@OneToMany(fetch = FetchType.EAGER, mappedBy="Rooms")
    private Set<RoomUserTracker> RoomUserTracker;
	
	private UUID countryId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "countryid")
    private Countries countries;
	
    private String roomName;

    private int roomCapacity;
    
    private String roomDescription;
    
    

}