package com.moni.serviceparty.documents;

import java.sql.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "party")
public class Party {
    
    @Id
    private String id;
    private String itemToWinId;
    private double entryPrice;
    private int maxParticipants;
    private int currentParticipants;
    private Date startDate;
    private Date endDate;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemToWinId() {
        return this.itemToWinId;
    }

    public void setItemToWinId(String itemToWinId) {
        this.itemToWinId = itemToWinId;
    }

    public double getEntryPrice() {
        return this.entryPrice;
    }

    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }

    public int getMaxParticipants() {
        return this.maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public int getCurrentParticipants() {
        return this.currentParticipants;
    }

    public void setCurrentParticipants(int currentParticipants) {
        this.currentParticipants = currentParticipants;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}   
