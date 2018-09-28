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
import lk.ijse.mygymmanagement.dao.custom.ViewAllAttendanceDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ViewAllAttendanceDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;

public class ViewAllAttendanceDAOImpl implements ViewAllAttendanceDAO {

    @Override
    public boolean add(ViewAllAttendanceDTO viewallattendence) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO viewallattendence VALUES (?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, viewallattendence.getRegisid());
        pstm.setObject(2, viewallattendence.getMemberid());
        pstm.setObject(3, viewallattendence.getMembername());
        pstm.setObject(4, viewallattendence.getAttenDate());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(ViewAllAttendanceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ViewAllAttendanceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewAllAttendanceDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public static ArrayList<ViewAllAttendanceDTO> getAllss(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM viewallattendence where memberid='" + id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<ViewAllAttendanceDTO> allAttend = null;

        while (rst.next()) {
            if (allAttend == null) {

                allAttend = new ArrayList<>();
            }

            allAttend.add(new ViewAllAttendanceDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            ));

        }

        return allAttend;
    }

    @Override
    public ArrayList<ViewAllAttendanceDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
