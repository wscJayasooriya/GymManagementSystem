/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.MeasurementDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;
import lk.ijse.mygymmanagementsystem.core.dto.MeasurementDTO;
import lk.ijse.mygymmanagementsystem.core.dto.MemeberDTO;

/**
 *
 * @author Chinthaka
 */
public class MeasurementController {
    private static MeasurementDAO measurementDAO = (MeasurementDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEASUREMENT);
    
    public static boolean addMeasurement(MeasurementDTO measurementDTO) throws  Exception  {
        boolean result = measurementDAO.add(measurementDTO);
        return result;
    }
    
    public static boolean deleteMeasurement(MeasurementDTO measurementDTO)throws Exception{
        boolean result = measurementDAO.delete(measurementDTO);
        return result;
    }
    
    public static ArrayList<MeasurementDTO> getAllMeasurement()throws Exception{
        return measurementDAO.getAll();
    }
    
    public static MeasurementDTO searchMeasurement(String id) throws Exception{
        MeasurementDTO result=measurementDAO.search(id);
        return result;
    }
    
    public static boolean updateMeasurement(MeasurementDTO measurementDTO)throws Exception{
        boolean result = measurementDAO.update(measurementDTO);
        return result;
    }
}
