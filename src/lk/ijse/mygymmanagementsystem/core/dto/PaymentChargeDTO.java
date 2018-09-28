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
public class PaymentChargeDTO extends SuperDTO{
    private String paymentTypeID;
    private String paymentType;
    private String charge;

    public PaymentChargeDTO() {
    }

    public PaymentChargeDTO(String paymentTypeID, String paymentType, String charge) {
        this.paymentTypeID = paymentTypeID;
        this.paymentType = paymentType;
        this.charge = charge;
    }

    /**
     * @return the paymentTypeID
     */
    public String getPaymentTypeID() {
        return paymentTypeID;
    }

    /**
     * @param paymentTypeID the paymentTypeID to set
     */
    public void setPaymentTypeID(String paymentTypeID) {
        this.paymentTypeID = paymentTypeID;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * @return the charge
     */
    public String getCharge() {
        return charge;
    }

    /**
     * @param charge the charge to set
     */
    public void setCharge(String charge) {
        this.charge = charge;
    }

    
}
