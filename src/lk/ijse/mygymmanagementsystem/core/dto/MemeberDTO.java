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
public class MemeberDTO extends SuperDTO{
    private String memberID;
    private String memberName;
    private String nic;
    private String occapation;
    private String address;
    private String dob;
    private int age;
    private String gender;
    private double height;
    private double weight;
    private String email;
    private String phoneNo;
    private String emergencyContact;

    public MemeberDTO() {
    }

    public MemeberDTO(String memberID, String memberName, String nic, String occapation, String address, String dob, int age, String gender, double height, double weight, String email, String phoneNo, String emergencyContact) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.nic = nic;
        this.occapation = occapation;
        this.address = address;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.email = email;
        this.phoneNo = phoneNo;
        this.emergencyContact = emergencyContact;
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
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the occapation
     */
    public String getOccapation() {
        return occapation;
    }

    /**
     * @param occapation the occapation to set
     */
    public void setOccapation(String occapation) {
        this.occapation = occapation;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the dob
     */
    

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the emergencyContact
     */
    public String getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * @param emergencyContact the emergencyContact to set
     */
    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    

}