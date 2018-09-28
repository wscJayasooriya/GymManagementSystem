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
import lk.ijse.mygymmanagement.dao.custom.InstructorDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class InstructorDAOImpl implements InstructorDAO {

    @Override
    public boolean add(InstructorDTO instructor) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO instructor VALUES (?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, instructor.getInstructorID());
        pstm.setObject(2, instructor.getInstructorName());
        pstm.setObject(3, instructor.getInstructorTeleNo());
        pstm.setObject(4, instructor.getInstructorNIC());
        pstm.setObject(5, instructor.getInstructorAddress());
        pstm.setObject(6, instructor.getGender());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(InstructorDTO instructor) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE instructor SET Instructor_Name=?, Instructor_TeleNo=?, Instructor_NIC=?, Instructor_Address=?, Gender=? WHERE Instructor_ID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, instructor.getInstructorName());
        pstm.setObject(2, instructor.getInstructorTeleNo());
        pstm.setObject(3, instructor.getInstructorNIC());
        pstm.setObject(4, instructor.getInstructorAddress());
        pstm.setObject(5, instructor.getGender());
        pstm.setObject(6, instructor.getInstructorID()); 
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(InstructorDTO instructor) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM instructor WHERE  Instructor_ID= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, instructor.getInstructorID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public InstructorDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM instructor WHERE Instructor_ID='" + id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new InstructorDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6));
        }

        return null;
    
    }

    @Override
    public ArrayList<InstructorDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM instructor";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<InstructorDTO> allInstructors = null;

        while (rst.next()) {
            if (allInstructors == null) {
                
                allInstructors = new ArrayList<>();
            }

            allInstructors.add(new InstructorDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));

        }

        return allInstructors;
    }
}
