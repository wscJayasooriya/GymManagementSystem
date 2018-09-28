/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagementsystem.core.dto;

/**
 *
 * @author Chinthaka
 */
public class InventoryDTO extends SuperDTO{
    private String inventoryID;
    private String inventoryName;
    private String brandName;
    private int qty;

    public InventoryDTO() {
    }

    public InventoryDTO(String inventoryID, String inventoryName, String brandName, int qty) {
        this.inventoryID = inventoryID;
        this.inventoryName = inventoryName;
        this.brandName = brandName;
        this.qty = qty;
    }

    /**
     * @return the inventoryID
     */
    public String getInventoryID() {
        return inventoryID;
    }

    /**
     * @param inventoryID the inventoryID to set
     */
    public void setInventoryID(String inventoryID) {
        this.inventoryID = inventoryID;
    }

    /**
     * @return the inventoryName
     */
    public String getInventoryName() {
        return inventoryName;
    }

    /**
     * @param inventoryName the inventoryName to set
     */
    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
}
