/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.MemberDAO;
import lk.ijse.mygymmanagement.dao.custom.RegistrationDAO;
import lk.ijse.mygymmanagementsystem.core.dto.ExerciseDTO;
import lk.ijse.mygymmanagementsystem.core.dto.MemeberDTO;
import lk.ijse.mygymmanagementsystem.core.dto.RegistrationDTO;
import lk.ijse.mygymmanagementsystem.dao.db.DBConnection;

/**
 *
 * @author Chinthaka
 */
public class RegMemberController {

    private static RegistrationDAO registrationDAO = (RegistrationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATION);
    private static MemberDAO memberDAO = (MemberDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEMBER);

   /* public static boolean addRegistration(RegistrationDTO registrationDTO) throws Exception {
        boolean result = registrationDAO.add(registrationDTO);
        return result;
    }*/

    public static boolean deleteRegistration(RegistrationDTO registrationDTO) throws Exception {
        boolean result = registrationDAO.delete(registrationDTO);
        return result;
    }

    public static ArrayList<RegistrationDTO> getAllRegistration() throws Exception {
        return registrationDAO.getAll();
    }

    public static RegistrationDTO searchRegistration(String id) throws Exception {
        RegistrationDTO result = registrationDAO.search(id);
        return result;
    }

    public static boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception {
        boolean result = registrationDAO.update(registrationDTO);
        return result;
    }

    public static boolean addRegistration(RegistrationDTO registration, MemeberDTO member) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        boolean result = memberDAO.add(member);
        connection.setAutoCommit(false);
        try {
            if (result) {
                result = registrationDAO.add(registration);
                if (!result) {
                    connection.rollback();
                    return false;
                }
                connection.commit();
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
