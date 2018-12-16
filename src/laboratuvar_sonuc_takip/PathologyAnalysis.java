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
public class PathologyAnalysis {

    static ArrayList<String> analysisValues = new ArrayList<>();
    String[] analysisName = {"Piace Diameter", "Tumor Type"};
    String pieceDiameter;
    String analysisID;
    String tumorType; //if tumor type is false, we have a malignant tumor.

    public PathologyAnalysis(String analysisID, String pieceDiameter, String tumorType) {
        this.pieceDiameter = pieceDiameter;
        this.analysisID = analysisID;
        this.tumorType = tumorType;
        analysisValues.add(this.pieceDiameter);
        analysisValues.add(this.tumorType);
    }

    

}
