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
import lk.ijse.mygymmanagement.dao.custom.ExerciseDAO;
import lk.ijse.mygymmanagementsystem.core.dto.ExerciseDTO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class ExerciseDAOImpl implements ExerciseDAO {

    @Override
    public boolean add(ExerciseDTO exerciseDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO exercise VALUES (?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, exerciseDTO.getExerciseID());
        pstm.setObject(2, exerciseDTO.getExerciseName());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(ExerciseDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ExerciseDTO exerciseDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM exercise WHERE  Exercise_ID= ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, exerciseDTO.getExerciseID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public ExerciseDTO search(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM exercise WHERE Exercise_ID='" +id+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new ExerciseDTO(
                    rst.getString(1),
                    rst.getString(2));
        }

        return null;
    }

    @Override
    public ArrayList<ExerciseDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM exercise";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<ExerciseDTO> allExercises = null;

        while (rst.next()) {
            if (allExercises == null) {
                
                allExercises = new ArrayList<>();
            }

            allExercises.add(new ExerciseDTO(
                    rst.getString(1),
                    rst.getString(2)
            ));

        }

        return allExercises;
    }
}
