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
import lk.ijse.mygymmanagement.dao.custom.AttendanceDAO;
import lk.ijse.mygymmanagementsystem.core.dto.AttendanceDTO;
import lk.ijse.mygymmanagementsystem.core.dto.RegistrationDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class AttendanceDAOImpl implements AttendanceDAO {

    @Override
    public boolean add(AttendanceDTO attendanceDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO attendance VALUES (?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, attendanceDTO.getAttendanceID());
        pstm.setObject(2, attendanceDTO.getMemberRegNo());        
        pstm.setObject(3, attendanceDTO.getDate());
        pstm.setObject(4, attendanceDTO.getInTime());        
        pstm.setObject(5, attendanceDTO.getOutTime());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(AttendanceDTO attendanceDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE attendance SET Member_RegNo=?, Date=?, In_Time=?, Out_Time=? WHERE Attendance_ID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, attendanceDTO.getMemberRegNo());
        pstm.setObject(2, attendanceDTO.getDate());
        pstm.setObject(3, attendanceDTO.getInTime());
        pstm.setObject(4, attendanceDTO.getOutTime());
        pstm.setObject(5, attendanceDTO.getAttendanceID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(AttendanceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AttendanceDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AttendanceDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM attendance";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<AttendanceDTO> allAttendance = null;

        while (rst.next()) {
            if (allAttendance == null) {
                
                allAttendance = new ArrayList<>();
            }

            allAttendance.add(new AttendanceDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                    
            ));
        }
        return allAttendance;
    }
    
}
