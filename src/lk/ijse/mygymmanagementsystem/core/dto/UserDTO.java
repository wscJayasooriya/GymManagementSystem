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
public class UserDTO extends SuperDTO{
    private String userName;
    private String currentPassword;
    private String newPassword;
    private String reEnterPassword;

    public UserDTO() {
    }

    public UserDTO(String userName, String currentPassword, String newPassword, String reEnterPassword) {
        this.userName = userName;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
        this.reEnterPassword = reEnterPassword;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the currentPassword
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * @param currentPassword the currentPassword to set
     */
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    /**
     * @return the newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * @param newPassword the newPassword to set
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * @return the reEnterPassword
     */
    public String getReEnterPassword() {
        return reEnterPassword;
    }

    /**
     * @param reEnterPassword the reEnterPassword to set
     */
    public void setReEnterPassword(String reEnterPassword) {
        this.reEnterPassword = reEnterPassword;
    }
    
    
}
