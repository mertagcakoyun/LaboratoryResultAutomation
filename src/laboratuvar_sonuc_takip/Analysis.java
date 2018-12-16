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
public class Analysis {

 static ArrayList<String> analysisName = new ArrayList<>();
    int barcodeNumber;

    public static ArrayList<String> getAnalysisName() {
        return analysisName;
    }

    public static void setAnalysisName(ArrayList<String> analysisName) {
        Analysis.analysisName = analysisName;
    }

    public int getBarcodeNumber() {
        return barcodeNumber;
    }

    public void setBarcodeNumber(int barcodeNumber) {
        this.barcodeNumber = barcodeNumber;
    }

}
