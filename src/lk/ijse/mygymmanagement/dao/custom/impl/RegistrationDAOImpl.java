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
import lk.ijse.mygymmanagement.dao.custom.RegistrationDAO;
import lk.ijse.mygymmanagementsystem.core.dto.MemeberDTO;
import lk.ijse.mygymmanagementsystem.core.dto.RegistrationDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class RegistrationDAOImpl implements RegistrationDAO {

    @Override
    public boolean add(RegistrationDTO registrationDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO registration VALUES (?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, registrationDTO.getMemberRegNo());
        pstm.setObject(2, registrationDTO.getRegistrationDate());        
        pstm.setObject(3, registrationDTO.getMemberID());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(RegistrationDTO registrationDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE registration SET Registration_Date=?, Member_Id=? WHERE Member_RegNo=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, registrationDTO.getRegistrationDate());
        pstm.setObject(2, registrationDTO.getMemberID());
        pstm.setObject(3, registrationDTO.getMemberRegNo());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(RegistrationDTO registrationDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM registration WHERE  Member_RegNo= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, registrationDTO.getMemberRegNo());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public RegistrationDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM registration WHERE Member_RegNo='" + id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new RegistrationDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
                    );
            
        }

        return null;
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM registration";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<RegistrationDTO> allRegistrations = null;

        while (rst.next()) {
            if (allRegistrations == null) {
                
                allRegistrations = new ArrayList<>();
            }

            allRegistrations.add(new RegistrationDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
                    
            ));
        }
        return allRegistrations;
    }

   
    

    
    
}
