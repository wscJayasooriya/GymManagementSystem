/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagementsystem.core.dto;

import java.util.Date;

/**
 *
 * @author Chinthaka
 */
public class PaymentDTO extends SuperDTO{
    private String paymentID;
    private String MemberRegNo;
    private String memberNIC;
    private String memberName;
    private String date;
    private String PaymentChargeID;
    private String PaymentType;
    private String charge;
    private String cash;
    private String balance;

    public PaymentDTO() {
    }

    public PaymentDTO(String paymentID, String MemberRegNo, String memberNIC, String memberName, String date, String PaymentChargeID, String PaymentType, String charge, String cash, String balance) {
        this.paymentID = paymentID;
        this.MemberRegNo = MemberRegNo;
        this.memberNIC = memberNIC;
        this.memberName = memberName;
        this.date = date;
        this.PaymentChargeID = PaymentChargeID;
        this.PaymentType = PaymentType;
        this.charge = charge;
        this.cash = cash;
        this.balance = balance;
    }

    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the MemberRegNo
     */
    public String getMemberRegNo() {
        return MemberRegNo;
    }

    /**
     * @param MemberRegNo the MemberRegNo to set
     */
    public void setMemberRegNo(String MemberRegNo) {
        this.MemberRegNo = MemberRegNo;
    }

    /**
     * @return the memberNIC
     */
    public String getMemberNIC() {
        return memberNIC;
    }

    /**
     * @param memberNIC the memberNIC to set
     */
    public void setMemberNIC(String memberNIC) {
        this.memberNIC = memberNIC;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the PaymentChargeID
     */
    public String getPaymentChargeID() {
        return PaymentChargeID;
    }

    /**
     * @param PaymentChargeID the PaymentChargeID to set
     */
    public void setPaymentChargeID(String PaymentChargeID) {
        this.PaymentChargeID = PaymentChargeID;
    }

    /**
     * @return the PaymentType
     */
    public String getPaymentType() {
        return PaymentType;
    }

    /**
     * @param PaymentType the PaymentType to set
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
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

    /**
     * @return the cash
     */
    public String getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(String cash) {
        this.cash = cash;
    }

    /**
     * @return the balance
     */
    public String getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    
    
}
