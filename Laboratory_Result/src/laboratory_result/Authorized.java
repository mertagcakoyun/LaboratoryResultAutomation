/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory_result;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "AUTHORIZED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Authorized.findAll", query = "SELECT a FROM Authorized a")
    , @NamedQuery(name = "Authorized.findById", query = "SELECT a FROM Authorized a WHERE a.authorizedPK.id = :id")
    , @NamedQuery(name = "Authorized.findByUsername", query = "SELECT a FROM Authorized a WHERE a.authorizedPK.username = :username")
    , @NamedQuery(name = "Authorized.findByPassword", query = "SELECT a FROM Authorized a WHERE a.password = :password")})
public class Authorized implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AuthorizedPK authorizedPK;
    @Column(name = "PASSWORD")
    private String password;

    public Authorized() {
    }

    public Authorized(AuthorizedPK authorizedPK) {
        this.authorizedPK = authorizedPK;
    }

    public Authorized(int id, String username) {
        this.authorizedPK = new AuthorizedPK(id, username);
    }

    public AuthorizedPK getAuthorizedPK() {
        return authorizedPK;
    }

    public void setAuthorizedPK(AuthorizedPK authorizedPK) {
        this.authorizedPK = authorizedPK;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (authorizedPK != null ? authorizedPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Authorized)) {
            return false;
        }
        Authorized other = (Authorized) object;
        if ((this.authorizedPK == null && other.authorizedPK != null) || (this.authorizedPK != null && !this.authorizedPK.equals(other.authorizedPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "laboratory_result.Authorized[ authorizedPK=" + authorizedPK + " ]";
    }
    
}
