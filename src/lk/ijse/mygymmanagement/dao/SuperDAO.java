/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.dao;

import java.util.ArrayList;
import lk.ijse.mygymmanagementsystem.core.dto.SuperDTO;

/**
 *
 * @author Chinthaka
 */
public interface SuperDAO<T extends SuperDTO> {
    
    public boolean add(T dto) throws Exception;
    
    public boolean update(T dto)throws Exception;
    
    public boolean delete(T dto)throws Exception;
    
    public T search(String id)throws Exception;
    
    public ArrayList<T> getAll()throws Exception;
    
}
