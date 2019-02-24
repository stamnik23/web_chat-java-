/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.web.dto;
import org.realtime.dao.models.User;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author nstamou
 */

@Getter
@Setter
public class UserDto implements Serializable {
    
    private UUID roomId;
    private UUID messageId;
    private UUID userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isAdmin;
    private String registrationDate;

    public UserDto() {
    }

public UserDto(UUID userId, UUID roomId, UUID messageId, String username, String password, String firstName, String lastName, String email, Boolean isAdmin, String registrationDate) {
        this.userId = userId;
        this.roomId = roomId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.email = email;
        this.registrationDate = registrationDate;
}


public UserDto fromEntity(User user) {

        setUserId(user.getUserId());
        setRoomId(user.getRoomId());
        setMessageId(user.getMessageId());
        setUsername(user.getUsername());
        setEmail(user.getEmail());
        setPassword(user.getPassword());
        setFirstName(user.getFirstName());
        setLastName(user.getLastName());
        setIsAdmin(user.getIsAdmin());
        setRegistrationDate(user.getRegistrationDate());
   
        return this;
    }

    public User toEntity() {
        User user = new User();

        return this.toEntity(user);
    }

    public User toEntity(User user){
        user.setRoomId(roomId);
        user.setMessageId(messageId);
        user.setUserId(userId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUsername(username);
        user.setRegistrationDate(registrationDate);
        user.setIsAdmin(isAdmin);
        user.setPassword(password);
        
       return user;
    }
  
}