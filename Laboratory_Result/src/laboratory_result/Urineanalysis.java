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
@Table(name = "URINEANALYSIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Urineanalysis.findAll", query = "SELECT u FROM Urineanalysis u")
    , @NamedQuery(name = "Urineanalysis.findByAnalysisid", query = "SELECT u FROM Urineanalysis u WHERE u.analysisid = :analysisid")
    , @NamedQuery(name = "Urineanalysis.findByPatientid", query = "SELECT u FROM Urineanalysis u WHERE u.patientid = :patientid")
    , @NamedQuery(name = "Urineanalysis.findByProteinvalue", query = "SELECT u FROM Urineanalysis u WHERE u.proteinvalue = :proteinvalue")
    , @NamedQuery(name = "Urineanalysis.findByPhvalue", query = "SELECT u FROM Urineanalysis u WHERE u.phvalue = :phvalue")
    , @NamedQuery(name = "Urineanalysis.findByGlucosevalue", query = "SELECT u FROM Urineanalysis u WHERE u.glucosevalue = :glucosevalue")})
public class Urineanalysis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ANALYSISID")
    private Integer analysisid;
    @Column(name = "PATIENTID")
    private Integer patientid;
    @Column(name = "PROTEINVALUE")
    private Integer proteinvalue;
    @Column(name = "PHVALUE")
    private Integer phvalue;
    @Column(name = "GLUCOSEVALUE")
    private Integer glucosevalue;

    public Urineanalysis() {
    }

    public Urineanalysis(Integer analysisid) {
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

    public Integer getProteinvalue() {
        return proteinvalue;
    }

    public void setProteinvalue(Integer proteinvalue) {
        this.proteinvalue = proteinvalue;
    }

    public Integer getPhvalue() {
        return phvalue;
    }

    public void setPhvalue(Integer phvalue) {
        this.phvalue = phvalue;
    }

    public Integer getGlucosevalue() {
        return glucosevalue;
    }

    public void setGlucosevalue(Integer glucosevalue) {
        this.glucosevalue = glucosevalue;
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
        if (!(object instanceof Urineanalysis)) {
            return false;
        }
        Urineanalysis other = (Urineanalysis) object;
        if ((this.analysisid == null && other.analysisid != null) || (this.analysisid != null && !this.analysisid.equals(other.analysisid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "laboratory_result.Urineanalysis[ analysisid=" + analysisid + " ]";
    }
    
}
