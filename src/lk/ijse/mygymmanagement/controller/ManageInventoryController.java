/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.InventoryDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InventoryDTO;

/**
 *
 * @author Chinthaka
 */
public class ManageInventoryController {
    private static InventoryDAO inventoryDAO = (InventoryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.INVENTORY);
    
    public static boolean addInventory(InventoryDTO inventoryDTO) throws  Exception  {
        boolean result = inventoryDAO.add(inventoryDTO);
        return result;
    }
    
    public static boolean deleteInventory(InventoryDTO inventoryDTO)throws Exception{
        boolean result = inventoryDAO.delete(inventoryDTO);
        return result;
    }
    
    public static boolean updateInventory(InventoryDTO inventoryDTO)throws Exception{
        boolean result = inventoryDAO.update(inventoryDTO);
        return result;
    }
    
    public static InventoryDTO searchInventory(String id) throws Exception{
        InventoryDTO searchedInventory = inventoryDAO.search(id);
        return searchedInventory;
    }
    
    public static ArrayList<InventoryDTO> getAllInventory()throws Exception{
        return inventoryDAO.getAll();
    }
}
