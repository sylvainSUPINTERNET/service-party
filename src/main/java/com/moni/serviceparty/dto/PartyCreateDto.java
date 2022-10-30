package com.moni.serviceparty.dto;

import java.sql.Date;

public class PartyCreateDto {    
    
    private String itemToWinId;
    private double entryPrice;
    private int maxParticipants;
    private int currentParticipants;
    private Date startDate;
    private Date endDate;

    public String getItemToWinId() {
        return itemToWinId;
    }
    public void setItemToWinId(String itemToWinId) {
        this.itemToWinId = itemToWinId;
    }
    public double getEntryPrice() {
        return entryPrice;
    }
    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }
    public int getMaxParticipants() {
        return maxParticipants;
    }
    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }
    public int getCurrentParticipants() {
        return currentParticipants;
    }
    public void setCurrentParticipants(int currentParticipants) {
        this.currentParticipants = currentParticipants;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }    
}
