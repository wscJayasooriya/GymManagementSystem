/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.ijse.mygymmanagementsystem.core.dto.MemberHealthDTO;
import lk.ijse.mygymmanagement.dao.custom.MemberHealthDAO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;


public class MemberHealthDAOImpl implements MemberHealthDAO {

    @Override
    public boolean add(MemberHealthDTO health) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO memberhealth VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, health.getMemberHealthID());
        pstm.setObject(2, health.getMemberID());
        pstm.setObject(3, health.getBloodGroup());
        pstm.setObject(4, health.isHeartAttackStroke());
        pstm.setObject(5, health.isHighBloodPressure());
        pstm.setObject(6, health.isEpilepsyorFits());
        pstm.setObject(7, health.isHighCholesterol());
        pstm.setObject(8, health.isStomachorDuodenalUlcer());
        pstm.setObject(9, health.isLiverorKidneyCondition());
        pstm.setObject(10, health.isPainorTightnessintheChest());
        pstm.setObject(11, health.isDiabetes());
        pstm.setObject(12, health.isHernia());
        pstm.setObject(13, health.isDifficultyinBreathingorChronicCoughs());
        pstm.setObject(14, health.isAsthma());
        pstm.setObject(15, health.isFaintingAttacks());
        pstm.setObject(16, health.isAdvicefromPhysiciantoExercise());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
        
    }

    @Override
    public boolean update(MemberHealthDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(MemberHealthDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MemberHealthDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MemberHealthDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
