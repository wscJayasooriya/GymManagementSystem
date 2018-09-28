/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.PaymentChargeDAO;
import lk.ijse.mygymmanagementsystem.core.dto.InstructorDTO;
import lk.ijse.mygymmanagementsystem.core.dto.PaymentChargeDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleDTO;

/**
 *
 * @author Chinthaka
 */
public class PaymentChargeController {
    private static PaymentChargeDAO paymentChargeDAO = (PaymentChargeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT_CHARGE);
    
    public static boolean addCharge(PaymentChargeDTO paymentChargeDTO) throws  Exception  {
        boolean result = paymentChargeDAO.add(paymentChargeDTO);
        return result;
    }
    
    public static boolean deleteCharge(PaymentChargeDTO paymentChargeDTO)throws Exception{
        boolean result = paymentChargeDAO.delete(paymentChargeDTO);
        return result;
    }
    
    public static boolean updateCharge(PaymentChargeDTO paymentChargeDTO)throws Exception{
        boolean result = paymentChargeDAO.update(paymentChargeDTO);
        return result;
    }
    
    public static ArrayList<PaymentChargeDTO> getAllCharge()throws Exception{
        return paymentChargeDAO.getAll();
    }
    
    public static PaymentChargeDTO searchCharge(String id) throws Exception{
        PaymentChargeDTO result=paymentChargeDAO.search(id);
        return result;
    }
}
