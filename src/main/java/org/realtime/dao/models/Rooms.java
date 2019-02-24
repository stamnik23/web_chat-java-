
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
@Table(name = "Messages")



public class Rooms implements Serializable {
    @Id
    private UUID messageId;

    
    @Id
    private UUID userId;
    
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID roomId;
 

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "Rooms")
    private Set<Messages> Messages;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "User")
    private User user;
   
    private String roomName;

    private int roomCapacity;
    
    private String roomDescription;
    
    

}