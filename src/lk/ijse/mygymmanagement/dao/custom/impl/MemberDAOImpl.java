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
import lk.ijse.mygymmanagement.dao.custom.MemberDAO;
import lk.ijse.mygymmanagementsystem.core.dto.MemeberDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class MemberDAOImpl implements MemberDAO {

    @Override
    public boolean add(MemeberDTO member) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO member VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, member.getMemberID());
        pstm.setObject(2, member.getMemberName());
        pstm.setObject(3, member.getNic());
        pstm.setObject(4, member.getOccapation());
        pstm.setObject(5, member.getAddress());
        pstm.setObject(6, member.getDob());
        pstm.setObject(7, member.getAge());
        pstm.setObject(8, member.getGender());
        pstm.setObject(9, member.getHeight());
        pstm.setObject(10, member.getWeight());
        pstm.setObject(11, member.getEmail());
        pstm.setObject(12, member.getPhoneNo());
        pstm.setObject(13, member.getEmergencyContact());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(MemeberDTO member) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE member SET Member_Name=?, NIC=?, Occupation=?,Address=?,DOB=?,Age=?,Gender=?,Height=?,Weight=?,Email=?,PhoneNo=?,Emergency_Contact=? WHERE Member_ID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, member.getMemberName());
        pstm.setObject(2, member.getNic());
        pstm.setObject(3, member.getOccapation());
        pstm.setObject(4, member.getAddress());
        pstm.setObject(5, member.getDob());
        pstm.setObject(6, member.getAge());
        pstm.setObject(7, member.getGender());
        pstm.setObject(8, member.getHeight());
        pstm.setObject(9, member.getWeight());
        pstm.setObject(10, member.getEmail());
        pstm.setObject(11, member.getPhoneNo());
        pstm.setObject(12, member.getEmergencyContact());
        pstm.setObject(13, member.getMemberID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(MemeberDTO member) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM member WHERE  Member_ID= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, member.getMemberID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public MemeberDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM member WHERE Member_ID='" + id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new MemeberDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getInt(7),
                    rst.getString(8),
                    rst.getDouble(9),
                    rst.getDouble(10),
                    rst.getString(11),
                    rst.getString(12),
                    rst.getString(13));
            
        }

        return null;
    }

    @Override
    public ArrayList<MemeberDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM member";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<MemeberDTO> allMembers = null;

        while (rst.next()) {
            if (allMembers == null) {
                
                allMembers = new ArrayList<>();
            }

            allMembers.add(new MemeberDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getInt(7),
                    rst.getString(8),
                    rst.getDouble(9),
                    rst.getDouble(10),
                    rst.getString(11),
                    rst.getString(12),
                    rst.getString(13)
                    
            ));
        }
        return allMembers;
    }
    
}
