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
public class InstructorDTO extends SuperDTO{
    private String instructorID;
    private String instructorName;
    private String instructorTeleNo;
    private String instructorNIC;
    private String instructorAddress;
    private String gender;

    public InstructorDTO() {
    }

    public InstructorDTO(String instructorID, String instructorName, String instructorTeleNo, String instructorNIC, String instructorAddress, String gender) {
        this.instructorID = instructorID;
        this.instructorName = instructorName;
        this.instructorTeleNo = instructorTeleNo;
        this.instructorNIC = instructorNIC;
        this.instructorAddress = instructorAddress;
        this.gender = gender;
    }

    
    /**
     * @return the instructorID
     */
    public String getInstructorID() {
        return instructorID;
    }

    /**
     * @param instructorID the instructorID to set
     */
    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    /**
     * @return the instructorName
     */
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * @param instructorName the instructorName to set
     */
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    /**
     * @return the instructorTeleNo
     */
    public String getInstructorTeleNo() {
        return instructorTeleNo;
    }

    /**
     * @param instructorTeleNo the instructorTeleNo to set
     */
    public void setInstructorTeleNo(String instructorTeleNo) {
        this.instructorTeleNo = instructorTeleNo;
    }

    /**
     * @return the instructorNIC
     */
    public String getInstructorNIC() {
        return instructorNIC;
    }

    /**
     * @param instructorNIC the instructorNIC to set
     */
    public void setInstructorNIC(String instructorNIC) {
        this.instructorNIC = instructorNIC;
    }

    /**
     * @return the instructorAddress
     */
    public String getInstructorAddress() {
        return instructorAddress;
    }

    /**
     * @param instructorAddress the instructorAddress to set
     */
    public void setInstructorAddress(String instructorAddress) {
        this.instructorAddress = instructorAddress;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
