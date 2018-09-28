/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagement.dao;

import lk.ijse.mygymmanagement.dao.custom.impl.AttendanceDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.ExerciseDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.InstructorDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.InventoryDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.MeasurementDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.MemberDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.MemberHealthDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.PaymentChargeDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.QueryDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.RegistrationDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.ScheduleDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.ScheduleDetailDAOImpl;
import lk.ijse.mygymmanagement.dao.custom.impl.ViewAllAttendanceDAOImpl;



/**
 *
 * @author Chinthaka
 */
public class DAOFactory {
    public enum DAOTypes{
        ATTENDANCE,EXERCISE,INSTRUCTOR,INVENTORY,MEASUREMENT,MEMBER,MEMBER_HEALTH,PAYMENT,PAYMENT_CHARGE,REGISTRATION,SCHEDULE,SCHEDULE_DETAIL,VIEW_ALL_ATTENDANCE,QUERY 
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType){
        switch(daoType){
            case ATTENDANCE:
                return (SuperDAO) new AttendanceDAOImpl();
            case EXERCISE:
                return (SuperDAO) new ExerciseDAOImpl();
            case INSTRUCTOR:
                return (SuperDAO) new InstructorDAOImpl();
            case INVENTORY:
                return (SuperDAO) new InventoryDAOImpl();
            case MEASUREMENT:
                return (SuperDAO) new MeasurementDAOImpl();
            case MEMBER:
                return (SuperDAO) new MemberDAOImpl();
            case MEMBER_HEALTH:
                return (SuperDAO) new MemberHealthDAOImpl();
            case PAYMENT:
                return (SuperDAO) new PaymentDAOImpl();
            case PAYMENT_CHARGE:
                return (SuperDAO) new PaymentChargeDAOImpl();
            case REGISTRATION:
                return (SuperDAO) new RegistrationDAOImpl();
            case SCHEDULE:
                return (SuperDAO) new ScheduleDAOImpl();
            case SCHEDULE_DETAIL:
                return (SuperDAO) new ScheduleDetailDAOImpl();
            case VIEW_ALL_ATTENDANCE:
                return (SuperDAO) new ViewAllAttendanceDAOImpl();
            case QUERY:
                return new QueryDAOImpl();
            default:
                return null;
        }
    }
}
