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
public class MemberHealthDTO extends SuperDTO{
    private String memberHealthID;
    private String memberID;
    private String bloodGroup;
    private boolean HeartAttackStroke;
    private boolean HighBloodPressure;
    private boolean EpilepsyorFits;
    private boolean HighCholesterol;
    private boolean StomachorDuodenalUlcer;
    private boolean LiverorKidneyCondition;
    private boolean PainorTightnessintheChest;
    private boolean Diabetes;
    private boolean Hernia;
    private boolean DifficultyinBreathingorChronicCoughs;
    private boolean Asthma;
    private boolean FaintingAttacks;
    private boolean AdvicefromPhysiciantoExercise;

    public MemberHealthDTO() {
    }

    public MemberHealthDTO(String memberHealthID, String memberID, String bloodGroup, boolean HeartAttackStroke, boolean HighBloodPressure, boolean EpilepsyorFits, boolean HighCholesterol, boolean StomachorDuodenalUlcer, boolean LiverorKidneyCondition, boolean PainorTightnessintheChest, boolean Diabetes, boolean Hernia, boolean DifficultyinBreathingorChronicCoughs, boolean Asthma, boolean FaintingAttacks, boolean AdvicefromPhysiciantoExercise) {
        this.memberHealthID = memberHealthID;
        this.memberID = memberID;
        this.bloodGroup = bloodGroup;
        this.HeartAttackStroke = HeartAttackStroke;
        this.HighBloodPressure = HighBloodPressure;
        this.EpilepsyorFits = EpilepsyorFits;
        this.HighCholesterol = HighCholesterol;
        this.StomachorDuodenalUlcer = StomachorDuodenalUlcer;
        this.LiverorKidneyCondition = LiverorKidneyCondition;
        this.PainorTightnessintheChest = PainorTightnessintheChest;
        this.Diabetes = Diabetes;
        this.Hernia = Hernia;
        this.DifficultyinBreathingorChronicCoughs = DifficultyinBreathingorChronicCoughs;
        this.Asthma = Asthma;
        this.FaintingAttacks = FaintingAttacks;
        this.AdvicefromPhysiciantoExercise = AdvicefromPhysiciantoExercise;
    }

    /**
     * @return the memberHealthID
     */
    public String getMemberHealthID() {
        return memberHealthID;
    }

    /**
     * @param memberHealthID the memberHealthID to set
     */
    public void setMemberHealthID(String memberHealthID) {
        this.memberHealthID = memberHealthID;
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
     * @return the bloodGroup
     */
    public String getBloodGroup() {
        return bloodGroup;
    }

    /**
     * @param bloodGroup the bloodGroup to set
     */
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    /**
     * @return the HeartAttackStroke
     */
    public boolean isHeartAttackStroke() {
        return HeartAttackStroke;
    }

    /**
     * @param HeartAttackStroke the HeartAttackStroke to set
     */
    public void setHeartAttackStroke(boolean HeartAttackStroke) {
        this.HeartAttackStroke = HeartAttackStroke;
    }

    /**
     * @return the HighBloodPressure
     */
    public boolean isHighBloodPressure() {
        return HighBloodPressure;
    }

    /**
     * @param HighBloodPressure the HighBloodPressure to set
     */
    public void setHighBloodPressure(boolean HighBloodPressure) {
        this.HighBloodPressure = HighBloodPressure;
    }

    /**
     * @return the EpilepsyorFits
     */
    public boolean isEpilepsyorFits() {
        return EpilepsyorFits;
    }

    /**
     * @param EpilepsyorFits the EpilepsyorFits to set
     */
    public void setEpilepsyorFits(boolean EpilepsyorFits) {
        this.EpilepsyorFits = EpilepsyorFits;
    }

    /**
     * @return the HighCholesterol
     */
    public boolean isHighCholesterol() {
        return HighCholesterol;
    }

    /**
     * @param HighCholesterol the HighCholesterol to set
     */
    public void setHighCholesterol(boolean HighCholesterol) {
        this.HighCholesterol = HighCholesterol;
    }

    /**
     * @return the StomachorDuodenalUlcer
     */
    public boolean isStomachorDuodenalUlcer() {
        return StomachorDuodenalUlcer;
    }

    /**
     * @param StomachorDuodenalUlcer the StomachorDuodenalUlcer to set
     */
    public void setStomachorDuodenalUlcer(boolean StomachorDuodenalUlcer) {
        this.StomachorDuodenalUlcer = StomachorDuodenalUlcer;
    }

    /**
     * @return the LiverorKidneyCondition
     */
    public boolean isLiverorKidneyCondition() {
        return LiverorKidneyCondition;
    }

    /**
     * @param LiverorKidneyCondition the LiverorKidneyCondition to set
     */
    public void setLiverorKidneyCondition(boolean LiverorKidneyCondition) {
        this.LiverorKidneyCondition = LiverorKidneyCondition;
    }

    /**
     * @return the PainorTightnessintheChest
     */
    public boolean isPainorTightnessintheChest() {
        return PainorTightnessintheChest;
    }

    /**
     * @param PainorTightnessintheChest the PainorTightnessintheChest to set
     */
    public void setPainorTightnessintheChest(boolean PainorTightnessintheChest) {
        this.PainorTightnessintheChest = PainorTightnessintheChest;
    }

    /**
     * @return the Diabetes
     */
    public boolean isDiabetes() {
        return Diabetes;
    }

    /**
     * @param Diabetes the Diabetes to set
     */
    public void setDiabetes(boolean Diabetes) {
        this.Diabetes = Diabetes;
    }

    /**
     * @return the Hernia
     */
    public boolean isHernia() {
        return Hernia;
    }

    /**
     * @param Hernia the Hernia to set
     */
    public void setHernia(boolean Hernia) {
        this.Hernia = Hernia;
    }

    /**
     * @return the DifficultyinBreathingorChronicCoughs
     */
    public boolean isDifficultyinBreathingorChronicCoughs() {
        return DifficultyinBreathingorChronicCoughs;
    }

    /**
     * @param DifficultyinBreathingorChronicCoughs the DifficultyinBreathingorChronicCoughs to set
     */
    public void setDifficultyinBreathingorChronicCoughs(boolean DifficultyinBreathingorChronicCoughs) {
        this.DifficultyinBreathingorChronicCoughs = DifficultyinBreathingorChronicCoughs;
    }

    /**
     * @return the Asthma
     */
    public boolean isAsthma() {
        return Asthma;
    }

    /**
     * @param Asthma the Asthma to set
     */
    public void setAsthma(boolean Asthma) {
        this.Asthma = Asthma;
    }

    /**
     * @return the FaintingAttacks
     */
    public boolean isFaintingAttacks() {
        return FaintingAttacks;
    }

    /**
     * @param FaintingAttacks the FaintingAttacks to set
     */
    public void setFaintingAttacks(boolean FaintingAttacks) {
        this.FaintingAttacks = FaintingAttacks;
    }

    /**
     * @return the AdvicefromPhysiciantoExercise
     */
    public boolean isAdvicefromPhysiciantoExercise() {
        return AdvicefromPhysiciantoExercise;
    }

    /**
     * @param AdvicefromPhysiciantoExercise the AdvicefromPhysiciantoExercise to set
     */
    public void setAdvicefromPhysiciantoExercise(boolean AdvicefromPhysiciantoExercise) {
        this.AdvicefromPhysiciantoExercise = AdvicefromPhysiciantoExercise;
    }
    
    
}
