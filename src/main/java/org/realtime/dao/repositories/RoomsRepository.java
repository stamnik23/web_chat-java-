
package org.realtime.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
import org.realtime.dao.models.Rooms;


public interface RoomsRepository extends JpaRepository<Rooms, Long> {

  //  Rooms findByroomName(String roomName);

    Rooms findByExternalId (UUID externalId);

}