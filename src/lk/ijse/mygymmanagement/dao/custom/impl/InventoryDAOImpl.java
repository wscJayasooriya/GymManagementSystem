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
import lk.ijse.mygymmanagement.dao.custom.InventoryDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class InventoryDAOImpl implements InventoryDAO {

    @Override
    public boolean add(InventoryDTO inventory) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO inventory VALUES (?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, inventory.getInventoryID());
        pstm.setObject(2, inventory.getInventoryName());
        pstm.setObject(3, inventory.getBrandName());
        pstm.setObject(4, inventory.getQty());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(InventoryDTO inventory) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE inventory SET Inventory_Name=?, Brand_Name=?, Qty=? WHERE Inventory_ID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, inventory.getInventoryName());
        pstm.setObject(2, inventory.getBrandName());
        pstm.setObject(3, inventory.getQty());
        pstm.setObject(4, inventory.getInventoryID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(InventoryDTO inventory) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM inventory WHERE  Inventory_ID= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, inventory.getInventoryID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public InventoryDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM inventory WHERE Inventory_ID='" +id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new InventoryDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getInt(4));
        }

        return null;
    }

    @Override
    public ArrayList<InventoryDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM inventory";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<InventoryDTO> allInventories = null;

        while (rst.next()) {
            if (allInventories == null) {
                
                allInventories = new ArrayList<>();
            }

            allInventories.add(new InventoryDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getInt(4)
            ));

        }

        return allInventories;
    }
    
}
