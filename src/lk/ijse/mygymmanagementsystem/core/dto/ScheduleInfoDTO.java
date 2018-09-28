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
public class ScheduleInfoDTO {
    private String scheduleID;
    private String exerciseID;
    private String exerciseName;
    private String startDate;
    private String endDate;
    private String sets;
    private String rep;

    public ScheduleInfoDTO() {
    }

    public ScheduleInfoDTO(String scheduleID, String exerciseID, String exerciseName, String startDate, String endDate, String sets, String rep) {
        this.scheduleID = scheduleID;
        this.exerciseID = exerciseID;
        this.exerciseName = exerciseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sets = sets;
        this.rep = rep;
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
     * @return the exerciseName
     */
    public String getExerciseName() {
        return exerciseName;
    }

    /**
     * @param exerciseName the exerciseName to set
     */
    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
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
     * @return the rep
     */
    public String getRep() {
        return rep;
    }

    /**
     * @param rep the rep to set
     */
    public void setRep(String rep) {
        this.rep = rep;
    }
    
}
