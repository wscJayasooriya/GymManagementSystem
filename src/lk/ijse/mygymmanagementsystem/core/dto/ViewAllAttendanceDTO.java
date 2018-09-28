/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagementsystem.core.dto;

/**
 *
 * @author Chinthaka
 */
public class ViewAllAttendanceDTO extends SuperDTO{

    private String regisid;
    private String memberid;
    private String membername;
    private String attenDate;

    public ViewAllAttendanceDTO() {
    }

    public ViewAllAttendanceDTO(String regisid, String memberid, String membername, String attenDate) {
        this.regisid = regisid;
        this.memberid = memberid;
        this.membername = membername;
        this.attenDate = attenDate;
    }

    /**
     * @return the regisid
     */
    public String getRegisid() {
        return regisid;
    }

    /**
     * @param regisid the regisid to set
     */
    public void setRegisid(String regisid) {
        this.regisid = regisid;
    }

    /**
     * @return the memberid
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * @param memberid the memberid to set
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    /**
     * @return the membername
     */
    public String getMembername() {
        return membername;
    }

    /**
     * @param membername the membername to set
     */
    public void setMembername(String membername) {
        this.membername = membername;
    }

    /**
     * @return the attenDate
     */
    public String getAttenDate() {
        return attenDate;
    }

    /**
     * @param attenDate the attenDate to set
     */
    public void setAttenDate(String attenDate) {
        this.attenDate = attenDate;
    }
    
}
