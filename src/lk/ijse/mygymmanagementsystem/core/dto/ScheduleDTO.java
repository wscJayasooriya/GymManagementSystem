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
public class ScheduleDTO extends SuperDTO{
    private String scheduleID;
    private String memberRegNo;
    private String instructorID;
    private String startDate;
    private String endDate;

    public ScheduleDTO() {
    }

    public ScheduleDTO(String scheduleID, String memberRegNo, String instructorID, String startDate, String endDate) {
        this.scheduleID = scheduleID;
        this.memberRegNo = memberRegNo;
        this.instructorID = instructorID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * @return the scheduleID
     */
    public String getScheduleID() {
        return scheduleID;
    }

    /**
     * @param scheduleID the scheduleID to set
     */
    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
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
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    
    
}
