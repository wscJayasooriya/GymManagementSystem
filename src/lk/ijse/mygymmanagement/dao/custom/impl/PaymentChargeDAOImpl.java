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
import lk.ijse.mygymmanagementsystem.core.dto.PaymentChargeDTO;
import lk.ijse.mygymmanagement.dao.custom.PaymentChargeDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class PaymentChargeDAOImpl implements PaymentChargeDAO {

    @Override
    public boolean add(PaymentChargeDTO paymentCharge) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO paymentcharge VALUES (?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, paymentCharge.getPaymentTypeID());
        pstm.setObject(2, paymentCharge.getPaymentType());
        pstm.setObject(3, paymentCharge.getCharge());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(PaymentChargeDTO paymentCharge) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE paymentcharge SET Payment_Type=?, charge=? WHERE Payment_Charge_ID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, paymentCharge.getPaymentType());
        pstm.setObject(2, paymentCharge.getCharge());
        pstm.setObject(3, paymentCharge.getPaymentTypeID()); 
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(PaymentChargeDTO paymentCharge) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM paymentcharge WHERE  Payment_Charge_ID= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, paymentCharge.getPaymentTypeID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public PaymentChargeDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM paymentcharge WHERE Payment_Charge_ID='" +id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new PaymentChargeDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3));
        }

        return null;
    }

    @Override
    public ArrayList<PaymentChargeDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM paymentcharge";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PaymentChargeDTO> allPaymentCharge = null;

        while (rst.next()) {
            if (allPaymentCharge == null) {
                
                allPaymentCharge = new ArrayList<>();
            }

            allPaymentCharge.add(new PaymentChargeDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            ));

        }

        return allPaymentCharge;
    }
    
}
