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
import lk.ijse.mygymmanagement.dao.custom.ScheduleDetailDAO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleDetailDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class ScheduleDetailDAOImpl implements ScheduleDetailDAO {

    @Override
    public boolean add(ScheduleDetailDTO scheduleDetail) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO scheduledetail VALUES (?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, scheduleDetail.getScheduleDetailID());
        pstm.setObject(2, scheduleDetail.getScheduleID());
        pstm.setObject(3, scheduleDetail.getExerciseID());
        pstm.setObject(4, scheduleDetail.getSets());
        pstm.setObject(5, scheduleDetail.getRepetetion());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(ScheduleDetailDTO scheduleDetail) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE scheduledetail SET Schedule_ID=?, Exercise_ID=?, Sets=?, Repetation=? WHERE Schedule_Detail_ID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, scheduleDetail.getScheduleID());
        pstm.setObject(2, scheduleDetail.getExerciseID());
        pstm.setObject(3, scheduleDetail.getSets());
        pstm.setObject(4, scheduleDetail.getRepetetion());
        pstm.setObject(5, scheduleDetail.getScheduleDetailID()); 
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(ScheduleDetailDTO scheduleDetail) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM scheduledetail WHERE  Schedule_Detail_ID= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, scheduleDetail.getScheduleDetailID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public ScheduleDetailDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM scheduledetail WHERE Schedule_Detail_ID='" + id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new ScheduleDetailDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
        }

        return null;
    }

    @Override
    public ArrayList<ScheduleDetailDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM scheduledetail";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<ScheduleDetailDTO> allScheduledetails = null;

        while (rst.next()) {
            if (allScheduledetails == null) {
                
                allScheduledetails = new ArrayList<>();
            }

            allScheduledetails.add(new ScheduleDetailDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            ));

        }

        return allScheduledetails;
    }
    
}
