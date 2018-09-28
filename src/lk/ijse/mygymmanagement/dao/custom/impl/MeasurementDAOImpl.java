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
import lk.ijse.mygymmanagement.dao.custom.MeasurementDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.core.dto.MeasurementDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class MeasurementDAOImpl implements MeasurementDAO {

    @Override
    public boolean add(MeasurementDTO measurementDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO measurement VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, measurementDTO.getMeasurementID());
        pstm.setObject(2, measurementDTO.getScheduleID());
        pstm.setObject(3, measurementDTO.getMemberID());
        pstm.setObject(4, measurementDTO.getDate());
        pstm.setObject(5, measurementDTO.getWeight());
        pstm.setObject(6, measurementDTO.getHeight());
        pstm.setObject(7, measurementDTO.getNeck());
        pstm.setObject(8, measurementDTO.getShoulders());
        pstm.setObject(9, measurementDTO.getChest());
        pstm.setObject(10, measurementDTO.getWaist());
        pstm.setObject(11, measurementDTO.getHips());
        pstm.setObject(12, measurementDTO.getUpperArmLeft());
        pstm.setObject(13, measurementDTO.getUpperArmRight());
        pstm.setObject(14, measurementDTO.getForearmLeft());
        pstm.setObject(15, measurementDTO.getForearmRight());
        pstm.setObject(16, measurementDTO.getThighLeft());
        pstm.setObject(17, measurementDTO.getThighRight());
        pstm.setObject(18, measurementDTO.getCalfLeft());
        pstm.setObject(19, measurementDTO.getCalfRight());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(MeasurementDTO measurementDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE measurement SET Schedule_ID=?, Member_ID=?, Date=?,Weight=?,Height=?,Neck=?,Shoulders=?,Chest=?,Waist=?,Hips=?,Upper_Arm_Left=?,upper_Arm_Right=?,Forearm_Left=?,Forearm_Right=?,Thigh_Left=?,Thigh_Right=?,Calf_Left=?,Calf_Right=? WHERE Measurement_ID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setObject(1, measurementDTO.getScheduleID());
        pstm.setObject(2, measurementDTO.getMemberID());
        pstm.setObject(3, measurementDTO.getDate());
        pstm.setObject(4, measurementDTO.getWeight());
        pstm.setObject(5, measurementDTO.getHeight());
        pstm.setObject(6, measurementDTO.getNeck());
        pstm.setObject(7, measurementDTO.getShoulders());
        pstm.setObject(8, measurementDTO.getChest());
        pstm.setObject(9, measurementDTO.getWaist());
        pstm.setObject(10, measurementDTO.getHips());
        pstm.setObject(11, measurementDTO.getUpperArmLeft());
        pstm.setObject(12, measurementDTO.getUpperArmRight());
        pstm.setObject(13, measurementDTO.getForearmLeft());
        pstm.setObject(14, measurementDTO.getForearmRight());
        pstm.setObject(15, measurementDTO.getThighLeft());
        pstm.setObject(16, measurementDTO.getThighRight());
        pstm.setObject(17, measurementDTO.getCalfLeft());
        pstm.setObject(18, measurementDTO.getCalfRight());
        pstm.setObject(19, measurementDTO.getMeasurementID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(MeasurementDTO measurementDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM measurement WHERE  Measurement_ID= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, measurementDTO.getMeasurementID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public MeasurementDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM measurement WHERE Measurement_ID='" +id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new MeasurementDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getDouble(6),
                    rst.getDouble(7),
                    rst.getDouble(8),
                    rst.getDouble(9),
                    rst.getDouble(10),
                    rst.getDouble(11),
                    rst.getDouble(12),
                    rst.getDouble(13),
                    rst.getDouble(14),
                    rst.getDouble(15),
                    rst.getDouble(16),
                    rst.getDouble(17),
                    rst.getDouble(18),
                    rst.getDouble(19)); 
            
        }

        return null;
    }

    @Override
    public ArrayList<MeasurementDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM measurement";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<MeasurementDTO> allMeasurements = null;

        while (rst.next()) {
            if (allMeasurements == null) {
                
                allMeasurements = new ArrayList<>();
            }

            allMeasurements.add(new MeasurementDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getDouble(6),
                    rst.getDouble(7),
                    rst.getDouble(8),
                    rst.getDouble(9),
                    rst.getDouble(10),
                    rst.getDouble(11),
                    rst.getDouble(12),
                    rst.getDouble(13),
                    rst.getDouble(14),
                    rst.getDouble(15),
                    rst.getDouble(16),
                    rst.getDouble(17),
                    rst.getDouble(18),
                    rst.getDouble(19)
                    
            ));
        }
        return allMeasurements;
    }
    
}
