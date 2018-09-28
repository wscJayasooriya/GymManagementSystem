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
public class ExerciseDTO extends SuperDTO{
    private String exerciseID;
    private String exerciseName;

    public ExerciseDTO() {
    }

    public ExerciseDTO(String exerciseID, String exerciseName) {
        this.exerciseID = exerciseID;
        this.exerciseName = exerciseName;
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
    
    
}
