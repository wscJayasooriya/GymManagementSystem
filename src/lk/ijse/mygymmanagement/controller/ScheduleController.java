/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.MemberDAO;
import lk.ijse.mygymmanagement.dao.custom.ScheduleDAO;
import lk.ijse.mygymmanagementsystem.core.dto.MemeberDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleDTO;

/**
 *
 * @author Chinthaka
 */
public class ScheduleController {
    private static ScheduleDAO scheduleDAO = (ScheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SCHEDULE);
    
    /*public static boolean addSchedule(ScheduleDTO scheduleDTO) throws  Exception  {
        boolean result = scheduleDAO.add(scheduleDTO);
        return result;
    }*/
    
    public static boolean deleteSchedule(ScheduleDTO scheduleDTO)throws Exception{
        boolean result = scheduleDAO.delete(scheduleDTO);
        return result;
    }
    
    public static ArrayList<ScheduleDTO> getAllSchedule()throws Exception{
        return scheduleDAO.getAll();
    }
    
    public static ScheduleDTO searchSchedule(String id) throws Exception{
        ScheduleDTO result=scheduleDAO.search(id);
        return result;
    }
    
    public static boolean updateSchedule(ScheduleDTO scheduleDTO)throws Exception{
        boolean result = scheduleDAO.update(scheduleDTO);
        return result;
    }
}
