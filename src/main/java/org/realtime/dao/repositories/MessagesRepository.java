/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.dao.repositories;

/**
 *
 * @author nstamou
 */
import org.springframework.data.jpa.repository.JpaRepository;


import java.sql.Timestamp;
import java.util.UUID;
import org.realtime.dao.models.Messages;

public interface MessagesRepository extends JpaRepository<Messages, Long> {

    Messages findbytime (Timestamp time);

    Messages findByExternalId(UUID id);


}