/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.ExerciseDAO;
import lk.ijse.mygymmanagementsystem.core.dto.ExerciseDTO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;

/**
 *
 * @author Chinthaka
 */
public class ExerciseController {
    private static ExerciseDAO exerciseDAO = (ExerciseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EXERCISE);
    
    public static boolean addExercise(ExerciseDTO exerciseDTO) throws  Exception  {
        boolean result = exerciseDAO.add(exerciseDTO);
        return result;
    }
    
    public static boolean deleteExercise(ExerciseDTO exerciseDTO)throws Exception{
        boolean result = exerciseDAO.delete(exerciseDTO);
        return result;
    }
    
    public static ArrayList<ExerciseDTO> getAllExercise()throws Exception{
        return exerciseDAO.getAll();
    }
    
    public static ExerciseDTO searchexercise(String id) throws Exception{
        ExerciseDTO searchedExercise = exerciseDAO.search(id);
        return searchedExercise;
    }
}
