/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.InstructorDAO;
import lk.ijse.mygymmanagement.dao.custom.MemberHealthDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.MemberHealthDTO;

/**
 *
 * @author Chinthaka
 */
public class MemberHealthController {
    private static MemberHealthDAO instructorDAO = (MemberHealthDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEMBER_HEALTH);
    
    public static boolean addHealth(MemberHealthDTO memberHealthDTO) throws  Exception  {
        boolean result = instructorDAO.add(memberHealthDTO);
        return result;
    }
    
    /*public static boolean deleteHealth(InstructorDTO instructorDTO)throws Exception{
        boolean result = instructorDAO.delete(instructorDTO);
        return result;
    }
    
    public static boolean updateHealth(InstructorDTO instructorDTO)throws Exception{
        boolean result = instructorDAO.update(instructorDTO);
        return result;
    }
    
    public static InstructorDTO searchHealth(String id) throws Exception{
        InstructorDTO searchedItem = instructorDAO.search(id);
        return searchedItem;
    }
    
    public static ArrayList<InstructorDTO> getAllHealth()throws Exception{
        return instructorDAO.getAll();
    }*/
}
