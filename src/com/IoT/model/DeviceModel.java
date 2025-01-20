package com.IoT.model;

/**
 * Represents an IoT device with its properties.
 * 
 * @author Prithivi
 */
public class DeviceModel {
    private int devId; // Device ID
    private String serialNumber; // Serial Number
    private String devName; // Device Name
    private String type; // Device Type
    private int quantity; // Quantity
    private int amount; // Amount
    private int total; // Total calculated as quantity * amount

    // Default constructor
    public DeviceModel() {
    }

    // Parameterized constructor
    public DeviceModel(int devId, String serialNumber, String devName, String type, int quantity, int amount, int total) {
        this.devId = devId;
        this.serialNumber = serialNumber;
        this.devName = devName;
        this.type = type;
        this.quantity = quantity;
        this.amount = amount;
        this.total = calculateTotal(); // Calculate total based on quantity and amount
    }

    // Method to calculate total
    private int calculateTotal() {
        return this.amount * this.quantity;
    }

    // Getters and Setters
    public int getDevId() {
        return devId;
    }

    public void setDevId(int devId) {
        this.devId = devId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    
    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.total = calculateTotal(); // Recalculate total when quantity changes
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        this.total = calculateTotal(); // Recalculate total when amount changes
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total; // This can be used if you want to set total directly
    }
}