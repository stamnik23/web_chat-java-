
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
@Table(name = "PrivateChat")



public class PrivateChat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type = "uuid-char")
    private UUID externalId;


    //@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "privatechat")
    //Set<PrivateMessages> privatemessages;
     
	@ManyToOne(fetch=FetchType.EAGER)
    private User user_initialiazer;

    @ManyToOne(fetch=FetchType.EAGER)
    private User user_receiver;
	

   //  @OneToMany(fetch = FetchType.EAGER,mappedBy = "rooms")
   //  private RoomUserTracker roomUserTracker;
  
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "privatechat")
    Set<PrivateMessages> privatemessages;


    public PrivateChat() {
        this.externalId = UUID.randomUUID();
    }

}