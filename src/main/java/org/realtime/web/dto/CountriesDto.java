/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime.web.dto;

import java.io.BufferedReader;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;
import org.realtime.dao.models.Messages;


/**
 *
 * @author atsaloukidis
 */
 
 
 public class CountriesDto {
	 
	private long id;
    private UUID externalId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getExternalId() {
        return externalId;
    }
	
    public void setExternalId(UUID externalId) {
        this.externalId = externalId;
    }	
 
    
	public CountriesList getList() {
       return countryName;
    }
	
	public void setCountryName(CountriesList countryName) {
       this.countryName = countryName;
    }

	private CountriesList countryName;
	
	
	public CountriesDto (Long id,UUID externalId, CountriesList countryName){
    
        this.id=id;
        this.externalId=externalId;
        this.countryName=countryName;
    }
	
	
	
	
	 public CountriesDto fromEntity(Countries countries) {    
	 
       setId(countries.getId());
       setExternalId(countries.getExternalId());
       setCountryName(countries.getCountryName());
       return this;
   }   
   
	
	  public Countries toEntity() {
        Countries countries = new Countries();

        return this.toEntity(countries);
    }
	
	
	
	public Countries toEntity(Countries countries){
        countries.setId(id);
        countries.setExternalId(externalId);
        countries.setCountryName(countryName);
  
        
       return countries;
    }
	
	
	
	
 }
 