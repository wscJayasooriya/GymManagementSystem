/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.ScheduleDAO;
import lk.ijse.mygymmanagement.dao.custom.ScheduleDetailDAO;
import lk.ijse.mygymmanagementsystem.core.dto.MemeberDTO;
import lk.ijse.mygymmanagementsystem.core.dto.RegistrationDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleDetailDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;

/**
 *
 * @author Chinthaka
 */
public class ScheduleDetailController {
    private static ScheduleDetailDAO detailDAO = (ScheduleDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SCHEDULE_DETAIL);
    private static ScheduleDAO scheduleDAO = (ScheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SCHEDULE);
    /*public static boolean addScheduleDetail(ScheduleDetailDTO detailDTO) throws  Exception  {
        boolean result = detailDAO.add(detailDTO);
        return result;
    }*/
    
    public static boolean deleteScheduleDetail(ScheduleDetailDTO detailDTO)throws Exception{
        boolean result = detailDAO.delete(detailDTO);
        return result;
    }
    
    public static ArrayList<ScheduleDetailDTO> getAllScheduleDetail()throws Exception{
        return detailDAO.getAll();
    }
    
    public static ScheduleDetailDTO searchScheduleDetail(String id) throws Exception{
        ScheduleDetailDTO result=detailDAO.search(id);
        return result;
    }
    
    public static boolean updateScheduleDetail(ScheduleDetailDTO detailDTO)throws Exception{
        boolean result = detailDAO.update(detailDTO);
        return result;
    }
    
    public static boolean addScheduleDetail(ScheduleDetailDTO detailDTO, ScheduleDTO scheduleDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        boolean result = scheduleDAO.add(scheduleDTO);
        connection.setAutoCommit(false);
        try {
            if (result) {
                result = detailDAO.add(detailDTO);
                if (!result) {
                    connection.rollback();
                    return false;
                }
                connection.commit();
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
