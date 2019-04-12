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
@Table(name = "PATHOLOGYANALYSIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pathologyanalysis.findAll", query = "SELECT p FROM Pathologyanalysis p")
    , @NamedQuery(name = "Pathologyanalysis.findByAnalysisid", query = "SELECT p FROM Pathologyanalysis p WHERE p.analysisid = :analysisid")
    , @NamedQuery(name = "Pathologyanalysis.findByPatientid", query = "SELECT p FROM Pathologyanalysis p WHERE p.patientid = :patientid")
    , @NamedQuery(name = "Pathologyanalysis.findByPiacediameter", query = "SELECT p FROM Pathologyanalysis p WHERE p.piacediameter = :piacediameter")
    , @NamedQuery(name = "Pathologyanalysis.findByTumortype", query = "SELECT p FROM Pathologyanalysis p WHERE p.tumortype = :tumortype")})
public class Pathologyanalysis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ANALYSISID")
    private Integer analysisid;
    @Column(name = "PATIENTID")
    private Integer patientid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PIACEDIAMETER")
    private Double piacediameter;
    @Column(name = "TUMORTYPE")
    private String tumortype;

    public Pathologyanalysis() {
    }

    public Pathologyanalysis(Integer analysisid) {
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

    public Double getPiacediameter() {
        return piacediameter;
    }

    public void setPiacediameter(Double piacediameter) {
        this.piacediameter = piacediameter;
    }

    public String getTumortype() {
        return tumortype;
    }

    public void setTumortype(String tumortype) {
        this.tumortype = tumortype;
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
        if (!(object instanceof Pathologyanalysis)) {
            return false;
        }
        Pathologyanalysis other = (Pathologyanalysis) object;
        if ((this.analysisid == null && other.analysisid != null) || (this.analysisid != null && !this.analysisid.equals(other.analysisid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "laboratory_result.Pathologyanalysis[ analysisid=" + analysisid + " ]";
    }
    
}
