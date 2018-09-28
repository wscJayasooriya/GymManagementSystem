/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.dao.custom;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.SuperDAO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleInfoDTO;
import lk.ijse.mygymmanagementsystem.core.dto.SuperDTO;

/**
 *
 * @author Chinthaka
 */
public interface QueryDAO extends SuperDAO<SuperDTO>{
    
    @Override
    public default boolean add(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default boolean update(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default boolean delete(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default SuperDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default ArrayList<SuperDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<ScheduleInfoDTO> getScheduleInfo(String text) throws Exception;
    
}
