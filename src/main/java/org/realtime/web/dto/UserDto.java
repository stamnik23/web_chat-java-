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
/**
 *
 * @author nstamou
 */
public class UserDto implements Serializable {
    
    private UUID externalId;
    
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isAdmin;
    private String registrationDate;


public UserDto(UUID externalId,Long Id, String username, String password, String firstName, String lastName, String email, Boolean isAdmin, String registrationDate) {
        this.externalId = externalId;
        this.id = Id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.email = email;
        this.registrationDate = registrationDate;
}


public UserDto fromEntity(User users) {

        setExternalId(users.getExternalId());
        setId(users.getId());
        setUsername(users.getUsername());
        setEmail(users.getEmail());
        setPassword(users.getPassword());
        setFirstName(users.getFirstName());
        setLastName(users.getLastName());
        setIsAdmin(users.getAdmin());
        setRegistrationDate(users.getRegistrationDate());
   
        return this;
    }

    public User toEntity() {
        User users = new User();

        return this.toEntity(users);
    }

    public User toEntity(User users){
        users.setId(id);
        users.setExternalId(externalId);
        users.setFirstName(firstName);
        users.setLastName(lastName);
        users.setUsername(username);
        users.setRegistrationDate(registrationDate);
        users.setAdmin(isAdmin);
        users.setPassword(password);
        
       return users;
    }
    public UUID getExternalId() {
        return externalId;
    }

    public void setExternalId(UUID externalId) {
        this.externalId = externalId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    
}