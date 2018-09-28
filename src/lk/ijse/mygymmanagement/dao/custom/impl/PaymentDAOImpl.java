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
import lk.ijse.mygymmanagement.dao.custom.PaymentDAO;
import lk.ijse.mygymmanagementsystem.core.dto.AttendanceDTO;
import lk.ijse.mygymmanagementsystem.core.dto.PaymentDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class PaymentDAOImpl implements PaymentDAO {

    @Override
    public boolean add(PaymentDTO paymentDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO payment VALUES (?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, paymentDTO.getPaymentID());
        pstm.setObject(2, paymentDTO.getMemberRegNo());        
        pstm.setObject(3, paymentDTO.getMemberNIC());
        pstm.setObject(4, paymentDTO.getMemberName());        
        pstm.setObject(5, paymentDTO.getDate());
        pstm.setObject(6, paymentDTO.getPaymentChargeID());        
        pstm.setObject(7, paymentDTO.getPaymentType());
        pstm.setObject(8, paymentDTO.getCharge());        
        pstm.setObject(9, paymentDTO.getCash());
        pstm.setObject(10, paymentDTO.getBalance());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM payment";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PaymentDTO> allPayment = null;

        while (rst.next()) {
            if (allPayment == null) {
                
                allPayment = new ArrayList<>();
            }

            allPayment.add(new PaymentDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getString(10)
                    
            ));
        }
        return allPayment;
    }
    
}
