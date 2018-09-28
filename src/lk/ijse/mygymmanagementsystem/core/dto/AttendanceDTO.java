/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagementsystem.core.dto;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Chinthaka
 */
public class AttendanceDTO extends SuperDTO{
    private String AttendanceID;
    private String MemberRegNo;
    private String date;
    private String inTime;
    private String outTime;

    public AttendanceDTO() {
    }

    public AttendanceDTO(String AttendanceID, String MemberRegNo, String date, String inTime, String outTime) {
        this.AttendanceID = AttendanceID;
        this.MemberRegNo = MemberRegNo;
        this.date = date;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    /**
     * @return the AttendanceID
     */
    public String getAttendanceID() {
        return AttendanceID;
    }

    /**
     * @param AttendanceID the AttendanceID to set
     */
    public void setAttendanceID(String AttendanceID) {
        this.AttendanceID = AttendanceID;
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
     * @return the inTime
     */
    public String getInTime() {
        return inTime;
    }

    /**
     * @param inTime the inTime to set
     */
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    /**
     * @return the outTime
     */
    public String getOutTime() {
        return outTime;
    }

    /**
     * @param outTime the outTime to set
     */
    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    
}
