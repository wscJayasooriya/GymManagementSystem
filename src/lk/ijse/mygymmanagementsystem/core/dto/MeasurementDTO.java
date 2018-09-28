/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagementsystem.core.dto;

import java.util.Date;

/**
 *
 * @author Chinthaka
 */
public class MeasurementDTO extends SuperDTO{
    private String measurementID;
    private String scheduleID;
    private String memberID;
    private String date;
    private Double weight;
    private Double height;
    private Double neck;
    private Double shoulders;
    private Double chest;
    private Double waist;
    private Double hips;
    private Double upperArmLeft;
    private Double upperArmRight;
    private Double forearmLeft;
    private Double forearmRight;
    private Double thighLeft;
    private Double thighRight;
    private Double calfLeft;
    private Double calfRight;

    public MeasurementDTO() {
    }

    public MeasurementDTO(String measurementID, String scheduleID, String memberID, String date, Double weight, Double height, Double neck, Double shoulders, Double chest, Double waist, Double hips, Double upperArmLeft, Double upperArmRight, Double forearmLeft, Double forearmRight, Double thighLeft, Double thighRight, Double calfLeft, Double calfRight) {
        this.measurementID = measurementID;
        this.scheduleID = scheduleID;
        this.memberID = memberID;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.neck = neck;
        this.shoulders = shoulders;
        this.chest = chest;
        this.waist = waist;
        this.hips = hips;
        this.upperArmLeft = upperArmLeft;
        this.upperArmRight = upperArmRight;
        this.forearmLeft = forearmLeft;
        this.forearmRight = forearmRight;
        this.thighLeft = thighLeft;
        this.thighRight = thighRight;
        this.calfLeft = calfLeft;
        this.calfRight = calfRight;
    }

    /**
     * @return the measurementID
     */
    public String getMeasurementID() {
        return measurementID;
    }

    /**
     * @param measurementID the measurementID to set
     */
    public void setMeasurementID(String measurementID) {
        this.measurementID = measurementID;
    }

    /**
     * @return the scheduleID
     */
    public String getScheduleID() {
        return scheduleID;
    }

    /**
     * @param scheduleID the scheduleID to set
     */
    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    /**
     * @return the memberID
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * @param memberID the memberID to set
     */
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return the neck
     */
    public Double getNeck() {
        return neck;
    }

    /**
     * @param neck the neck to set
     */
    public void setNeck(Double neck) {
        this.neck = neck;
    }

    /**
     * @return the shoulders
     */
    public Double getShoulders() {
        return shoulders;
    }

    /**
     * @param shoulders the shoulders to set
     */
    public void setShoulders(Double shoulders) {
        this.shoulders = shoulders;
    }

    /**
     * @return the chest
     */
    public Double getChest() {
        return chest;
    }

    /**
     * @param chest the chest to set
     */
    public void setChest(Double chest) {
        this.chest = chest;
    }

    /**
     * @return the waist
     */
    public Double getWaist() {
        return waist;
    }

    /**
     * @param waist the waist to set
     */
    public void setWaist(Double waist) {
        this.waist = waist;
    }

    /**
     * @return the hips
     */
    public Double getHips() {
        return hips;
    }

    /**
     * @param hips the hips to set
     */
    public void setHips(Double hips) {
        this.hips = hips;
    }

    /**
     * @return the upperArmLeft
     */
    public Double getUpperArmLeft() {
        return upperArmLeft;
    }

    /**
     * @param upperArmLeft the upperArmLeft to set
     */
    public void setUpperArmLeft(Double upperArmLeft) {
        this.upperArmLeft = upperArmLeft;
    }

    /**
     * @return the upperArmRight
     */
    public Double getUpperArmRight() {
        return upperArmRight;
    }

    /**
     * @param upperArmRight the upperArmRight to set
     */
    public void setUpperArmRight(Double upperArmRight) {
        this.upperArmRight = upperArmRight;
    }

    /**
     * @return the forearmLeft
     */
    public Double getForearmLeft() {
        return forearmLeft;
    }

    /**
     * @param forearmLeft the forearmLeft to set
     */
    public void setForearmLeft(Double forearmLeft) {
        this.forearmLeft = forearmLeft;
    }

    /**
     * @return the forearmRight
     */
    public Double getForearmRight() {
        return forearmRight;
    }

    /**
     * @param forearmRight the forearmRight to set
     */
    public void setForearmRight(Double forearmRight) {
        this.forearmRight = forearmRight;
    }

    /**
     * @return the thighLeft
     */
    public Double getThighLeft() {
        return thighLeft;
    }

    /**
     * @param thighLeft the thighLeft to set
     */
    public void setThighLeft(Double thighLeft) {
        this.thighLeft = thighLeft;
    }

    /**
     * @return the thighRight
     */
    public Double getThighRight() {
        return thighRight;
    }

    /**
     * @param thighRight the thighRight to set
     */
    public void setThighRight(Double thighRight) {
        this.thighRight = thighRight;
    }

    /**
     * @return the calfLeft
     */
    public Double getCalfLeft() {
        return calfLeft;
    }

    /**
     * @param calfLeft the calfLeft to set
     */
    public void setCalfLeft(Double calfLeft) {
        this.calfLeft = calfLeft;
    }

    /**
     * @return the calfRight
     */
    public Double getCalfRight() {
        return calfRight;
    }

    /**
     * @param calfRight the calfRight to set
     */
    public void setCalfRight(Double calfRight) {
        this.calfRight = calfRight;
    }

    

}