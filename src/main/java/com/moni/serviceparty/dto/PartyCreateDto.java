package com.moni.serviceparty.dto;

import java.time.LocalDateTime;

public class PartyCreateDto {    
    
    private String itemToWinId;
    private double entryPrice;
    private int maxParticipants;
    private int currentParticipants;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean status;

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

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
    public LocalDateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }    
}
