/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.custom.QueryDAO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleInfoDTO;
import lk.ijse.mygymmanagementsystem.core.dto.SuperDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class QueryDAOImpl implements QueryDAO {

    @Override
    public ArrayList<ScheduleInfoDTO> getScheduleInfo(String text) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select s.schedule_id,e.exercise_id, exercise_name,start_date, end_date,sets,repetetion  from exercise e,schedule s, scheduledetail sd  where e.exercise_id=sd.exercise_id and s.schedule_id=sd.schedule_id and Member_regNo='"+text+"'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<ScheduleInfoDTO> allScheduleInfo = null;

        while (rst.next()) {
            if (allScheduleInfo == null) {
                
                allScheduleInfo = new ArrayList<>();
            }

            allScheduleInfo.add(new ScheduleInfoDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7)));
        }
        return allScheduleInfo;
    }

}
