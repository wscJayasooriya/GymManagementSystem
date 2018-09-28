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
public class RegistrationDTO extends SuperDTO{
    private String memberRegNo;
    private String registrationDate;
    private String memberID;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String memberRegNo, String registrationDate, String memberID) {
        this.memberRegNo = memberRegNo;
        this.registrationDate = registrationDate;
        this.memberID = memberID;
    }
    

    
    /**
     * @return the memberRegNo
     */
    public String getMemberRegNo() {
        return memberRegNo;
    }

    /**
     * @param memberRegNo the memberRegNo to set
     */
    public void setMemberRegNo(String memberRegNo) {
        this.memberRegNo = memberRegNo;
    }

    /**
     * @return the registrationDate
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * @param registrationDate the registrationDate to set
     */
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * @return the memberID
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * @param memberID the memberID to set
     */
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
    

    
    
}
