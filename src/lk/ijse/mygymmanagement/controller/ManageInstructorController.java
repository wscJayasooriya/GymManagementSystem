/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.InstructorDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;


/**
 *
 * @author Chinthaka
 */
public class ManageInstructorController {
    private static InstructorDAO instructorDAO = (InstructorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.INSTRUCTOR);
    
    public static boolean addInstructor(InstructorDTO instructorDTO) throws  Exception  {
        boolean result = instructorDAO.add(instructorDTO);
        return result;
    }
    
    public static boolean deleteInstructor(InstructorDTO instructorDTO)throws Exception{
        boolean result = instructorDAO.delete(instructorDTO);
        return result;
    }
    
    public static boolean updateInstructor(InstructorDTO instructorDTO)throws Exception{
        boolean result = instructorDAO.update(instructorDTO);
        return result;
    }
    
    public static InstructorDTO searchInstructor(String id) throws Exception{
        InstructorDTO searchedItem = instructorDAO.search(id);
        return searchedItem;
    }
    
    public static ArrayList<InstructorDTO> getAllInstructor()throws Exception{
        return instructorDAO.getAll();
    }
}
