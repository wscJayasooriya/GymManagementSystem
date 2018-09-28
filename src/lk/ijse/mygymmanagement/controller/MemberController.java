/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.mygymmanagement.dao.DAOFactory;
import lk.ijse.mygymmanagement.dao.custom.MemberDAO;
import lk.ijse.mygymmanagementsystem.core.dto.MemeberDTO;

/**
 *
 * @author Chinthaka
 */
public class MemberController {
    private static MemberDAO memberDAO = (MemberDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEMBER);
    
   /* public static boolean addMember(MemeberDTO memeberDTO) throws  Exception  {
        boolean result = memberDAO.add(memeberDTO);
        return result;
    }*/
    
    public static boolean deleteMember(MemeberDTO memeberDTO)throws Exception{
        boolean result = memberDAO.delete(memeberDTO);
        return result;
    }
    
    public static ArrayList<MemeberDTO> getAllMember()throws Exception{
        return memberDAO.getAll();
    }
    
    public static MemeberDTO searchMember(String id) throws Exception{
        MemeberDTO result=memberDAO.search(id);
        return result;
    }
    
    public static boolean updateMember(MemeberDTO memeberDTO)throws Exception{
        boolean result = memberDAO.update(memeberDTO);
        return result;
    }
}
