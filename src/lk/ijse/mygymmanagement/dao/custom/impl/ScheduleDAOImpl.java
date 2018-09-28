/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.custom.ScheduleDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class ScheduleDAOImpl implements ScheduleDAO {

    @Override
    public boolean add(ScheduleDTO schedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO schedule VALUES (?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, schedule.getScheduleID());
        pstm.setObject(2, schedule.getMemberRegNo());
        pstm.setObject(3, schedule.getInstructorID());
        pstm.setObject(4, schedule.getStartDate());
        pstm.setObject(5, schedule.getEndDate());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(ScheduleDTO schedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE schedule SET Member_RegNo=?, Instructor_ID=?, Start_Date=?, End_Date=? WHERE Schedule_ID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, schedule.getMemberRegNo());
        pstm.setObject(2, schedule.getInstructorID());
        pstm.setObject(3, schedule.getStartDate());
        pstm.setObject(4, schedule.getEndDate());
        pstm.setObject(5, schedule.getScheduleID()); 
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(ScheduleDTO schedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM schedule WHERE  Schedule_ID= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, schedule.getScheduleID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public ScheduleDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM schedule WHERE Schedule_ID='" + id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new ScheduleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
        }

        return null;
    }

    @Override
    public ArrayList<ScheduleDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM schedule";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<ScheduleDTO> allSchedules = null;

        while (rst.next()) {
            if (allSchedules == null) {
                
                allSchedules = new ArrayList<>();
            }

            allSchedules.add(new ScheduleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            ));

        }

        return allSchedules;
    }
    
}
