/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.AttendanceDAO;
import lk.ijse.mygymmanagement.dao.custom.RegistrationDAO;
import lk.ijse.mygymmanagementsystem.core.dto.AttendanceDTO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.core.dto.RegistrationDTO;

/**
 *
 * @author Chinthaka
 */
public class AttendanceController {
   private static AttendanceDAO attendanceDAO = (AttendanceDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ATTENDANCE);
    
    public static boolean addAttendance(AttendanceDTO attendanceDTO) throws  Exception  {
        boolean result = attendanceDAO.add(attendanceDTO);
        return result;
    }
    
    public static ArrayList<AttendanceDTO> getAllAttendance()throws Exception{
        return attendanceDAO.getAll();
    }
    
    public static boolean updateAttendance(AttendanceDTO attendanceDTO)throws Exception{
        boolean result = attendanceDAO.update(attendanceDTO);
        return result;
    }
}
