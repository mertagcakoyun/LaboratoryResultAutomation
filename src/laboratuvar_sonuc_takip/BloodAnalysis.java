/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratuvar_sonuc_takip;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class BloodAnalysis extends Analysis {

    static ArrayList<String> analysisValues = new ArrayList<>();
    String[] analysisName = {"B12 Value", "Cholestrol Value", "Glucose Value", "Triglycerides Value"};
    private String b12Value, cholestrolValue, glucoseValue, triglyceridesValue;
     String analysisID;
    
    public BloodAnalysis(String analysisID, String b12Value, String cholestrolValue, String glucoseValue, String triglyceridesValue) {
        this.analysisID = analysisID;
        this.b12Value = b12Value;
        this.cholestrolValue = cholestrolValue;
        this.glucoseValue = glucoseValue;
        this.triglyceridesValue = triglyceridesValue;
        analysisValues.add(this.b12Value);
        analysisValues.add(this.cholestrolValue);
        analysisValues.add(this.glucoseValue);
        analysisValues.add(this.triglyceridesValue);
    }

    BloodAnalysis() {
       
    }

   

   
    

   

    

}
