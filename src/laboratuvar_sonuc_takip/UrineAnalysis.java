/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratuvar_sonuc_takip;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class UrineAnalysis  {
   
    String[] analysisName = {"phValue", "proteinValue", "Glucose Value"};
   static ArrayList<String> analysisValues = new ArrayList<>(); 
   String analysisID;
   String phValue;
    String proteinValue;
    String glucoseValue;

    public UrineAnalysis(String analysisID, String phValue, String proteinValue, String glucoseValue) {
        this.analysisID = analysisID;
        this.phValue = phValue;
        this.proteinValue = proteinValue;
        this.glucoseValue = glucoseValue;
        analysisValues.add(this.phValue);
        analysisValues.add(this.proteinValue);
        analysisValues.add(this.glucoseValue);
    }

    
    
    
}