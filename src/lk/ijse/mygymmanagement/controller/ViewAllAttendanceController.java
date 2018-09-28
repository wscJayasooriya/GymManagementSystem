/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.InstructorDAO;
import lk.ijse.mygymmanagement.dao.custom.ViewAllAttendanceDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ViewAllAttendanceDTO;

/**
 *
 * @author Chinthaka
 */
public class ViewAllAttendanceController {
    private static ViewAllAttendanceDAO viewAllAttendanceDAO = (ViewAllAttendanceDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VIEW_ALL_ATTENDANCE);
    
    public static boolean addAttendence(ViewAllAttendanceDTO allAttendanceDTO) throws  Exception  {
        boolean result = viewAllAttendanceDAO.add(allAttendanceDTO);
        return result;
    }
    
    public static ArrayList<ViewAllAttendanceDTO> getAllAttendence()throws Exception{
        return viewAllAttendanceDAO.getAll();
    }
}
