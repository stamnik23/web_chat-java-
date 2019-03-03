
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type = "uuid-char")
    private UUID externalId;

    private String roomName;

    private int roomCapacity;

    private String roomDescription;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "rooms")
    Set<Messages> messages;

    @OneToOne(fetch=FetchType.EAGER)
    private Countries countries;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "rooms")
    Set<RoomUserTracker> roomUserTracker;

    public Rooms() {
        this.externalId = UUID.randomUUID();
    }

}