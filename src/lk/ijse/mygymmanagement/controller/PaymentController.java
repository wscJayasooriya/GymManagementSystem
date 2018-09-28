/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.PaymentDAO;
import lk.ijse.mygymmanagementsystem.core.dto.AttendanceDTO;
import lk.ijse.mygymmanagementsystem.core.dto.PaymentDTO;
import lk.ijse.mygymmanagementsystem.core.dto.ScheduleDTO;

/**
 *
 * @author Chinthaka
 */
public class PaymentController {
    private static PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    
    public static boolean addPayment(PaymentDTO paymentDTO) throws  Exception  {
        boolean result = paymentDAO.add(paymentDTO);
        return result;
    }
    
    public static ArrayList<PaymentDTO> getAllPayment()throws Exception{
        return paymentDAO.getAll();
    }
    
    public static PaymentDTO searchPayment(String id) throws Exception{
        PaymentDTO result=paymentDAO.search(id);
        return result;
    }
}
