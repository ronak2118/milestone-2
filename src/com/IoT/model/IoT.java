package com.IoT.model;

/**
 *
 * @author Prithivi
 */
public class IoT {
    private int DevId;
    private String DevName;
    private String Type;
    private String Amount;
    private short Total;

    public IoT() {
    }

    public IoT(int DevId, String DevName, String Type, String Amount, short Total) {
        this.DevId = DevId;
        this.DevName = DevName;
        this.Type = Type;
        this.Amount = Amount;
        this.Total = Total;
    }
    
    public int getDevId() {
        return DevId;
    }

    public void setDevId(int DevId) {
        this.DevId = DevId;
    }

    public String getDevName() {
        return DevName;
    }

    public void setDevName(String DevName) {
        this.DevName = DevName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public short getTotal() {
        return Total;
    }

    public void setAge(short Total) {
        this.Total = Total;
    }    

    public boolean DevId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}