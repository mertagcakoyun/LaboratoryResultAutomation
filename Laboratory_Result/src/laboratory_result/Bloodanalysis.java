/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory_result;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "BLOODANALYSIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bloodanalysis.findAll", query = "SELECT b FROM Bloodanalysis b")
    , @NamedQuery(name = "Bloodanalysis.findByAnalysisid", query = "SELECT b FROM Bloodanalysis b WHERE b.analysisid = :analysisid")
    , @NamedQuery(name = "Bloodanalysis.findByPatientid", query = "SELECT b FROM Bloodanalysis b WHERE b.patientid = :patientid")
    , @NamedQuery(name = "Bloodanalysis.findByB12value", query = "SELECT b FROM Bloodanalysis b WHERE b.b12value = :b12value")
    , @NamedQuery(name = "Bloodanalysis.findByCholestrolvalue", query = "SELECT b FROM Bloodanalysis b WHERE b.cholestrolvalue = :cholestrolvalue")
    , @NamedQuery(name = "Bloodanalysis.findByGlucosevalue", query = "SELECT b FROM Bloodanalysis b WHERE b.glucosevalue = :glucosevalue")
    , @NamedQuery(name = "Bloodanalysis.findByTriglyceridesvalue", query = "SELECT b FROM Bloodanalysis b WHERE b.triglyceridesvalue = :triglyceridesvalue")})
public class Bloodanalysis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ANALYSISID")
    private Integer analysisid;
    @Column(name = "PATIENTID")
    private Integer patientid;
    @Column(name = "B12VALUE")
    private Integer b12value;
    @Column(name = "CHOLESTROLVALUE")
    private Integer cholestrolvalue;
    @Column(name = "GLUCOSEVALUE")
    private Integer glucosevalue;
    @Column(name = "TRIGLYCERIDESVALUE")
    private Integer triglyceridesvalue;

    public Bloodanalysis() {
    }

    public Bloodanalysis(Integer analysisid) {
        this.analysisid = analysisid;
    }

    public Integer getAnalysisid() {
        return analysisid;
    }

    public void setAnalysisid(Integer analysisid) {
        this.analysisid = analysisid;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getB12value() {
        return b12value;
    }

    public void setB12value(Integer b12value) {
        this.b12value = b12value;
    }

    public Integer getCholestrolvalue() {
        return cholestrolvalue;
    }

    public void setCholestrolvalue(Integer cholestrolvalue) {
        this.cholestrolvalue = cholestrolvalue;
    }

    public Integer getGlucosevalue() {
        return glucosevalue;
    }

    public void setGlucosevalue(Integer glucosevalue) {
        this.glucosevalue = glucosevalue;
    }

    public Integer getTriglyceridesvalue() {
        return triglyceridesvalue;
    }

    public void setTriglyceridesvalue(Integer triglyceridesvalue) {
        this.triglyceridesvalue = triglyceridesvalue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (analysisid != null ? analysisid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bloodanalysis)) {
            return false;
        }
        Bloodanalysis other = (Bloodanalysis) object;
        if ((this.analysisid == null && other.analysisid != null) || (this.analysisid != null && !this.analysisid.equals(other.analysisid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "laboratory_result.Bloodanalysis[ analysisid=" + analysisid + " ]";
    }
    
}
