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
public class ScheduleDetailDTO extends SuperDTO{
    private String scheduleDetailID;
    private String scheduleID;
    private String exerciseID;
    private String sets;
    private String repetetion;

    public ScheduleDetailDTO() {
    }

    public ScheduleDetailDTO(String scheduleDetailID, String scheduleID, String exerciseID, String sets, String repetetion) {
        this.scheduleDetailID = scheduleDetailID;
        this.scheduleID = scheduleID;
        this.exerciseID = exerciseID;
        this.sets = sets;
        this.repetetion = repetetion;
    }

    /**
     * @return the scheduleDetailID
     */
    public String getScheduleDetailID() {
        return scheduleDetailID;
    }

    /**
     * @param scheduleDetailID the scheduleDetailID to set
     */
    public void setScheduleDetailID(String scheduleDetailID) {
        this.scheduleDetailID = scheduleDetailID;
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
     * @return the exerciseID
     */
    public String getExerciseID() {
        return exerciseID;
    }

    /**
     * @param exerciseID the exerciseID to set
     */
    public void setExerciseID(String exerciseID) {
        this.exerciseID = exerciseID;
    }

    /**
     * @return the sets
     */
    public String getSets() {
        return sets;
    }

    /**
     * @param sets the sets to set
     */
    public void setSets(String sets) {
        this.sets = sets;
    }

    /**
     * @return the repetetion
     */
    public String getRepetetion() {
        return repetetion;
    }

    /**
     * @param repetetion the repetetion to set
     */
    public void setRepetetion(String repetetion) {
        this.repetetion = repetetion;
    }
    
    
}
