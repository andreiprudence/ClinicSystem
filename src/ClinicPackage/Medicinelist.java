/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "MEDICINELIST", catalog = "", schema = "CLINIC")
@NamedQueries({
    @NamedQuery(name = "Medicinelist.findAll", query = "SELECT m FROM Medicinelist m")
    , @NamedQuery(name = "Medicinelist.findByMedicineidno", query = "SELECT m FROM Medicinelist m WHERE m.medicineidno = :medicineidno")
    , @NamedQuery(name = "Medicinelist.findByMedicinename", query = "SELECT m FROM Medicinelist m WHERE m.medicinename = :medicinename")
    , @NamedQuery(name = "Medicinelist.findByMedicineprice", query = "SELECT m FROM Medicinelist m WHERE m.medicineprice = :medicineprice")})
public class Medicinelist implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MEDICINEIDNO")
    private Integer medicineidno;
    @Basic(optional = false)
    @Column(name = "MEDICINENAME")
    private String medicinename;
    @Basic(optional = false)
    @Column(name = "MEDICINEPRICE")
    private String medicineprice;

    public Medicinelist() {
    }

    public Medicinelist(Integer medicineidno) {
        this.medicineidno = medicineidno;
    }

    public Medicinelist(Integer medicineidno, String medicinename, String medicineprice) {
        this.medicineidno = medicineidno;
        this.medicinename = medicinename;
        this.medicineprice = medicineprice;
    }

    public Integer getMedicineidno() {
        return medicineidno;
    }

    public void setMedicineidno(Integer medicineidno) {
        Integer oldMedicineidno = this.medicineidno;
        this.medicineidno = medicineidno;
        changeSupport.firePropertyChange("medicineidno", oldMedicineidno, medicineidno);
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        String oldMedicinename = this.medicinename;
        this.medicinename = medicinename;
        changeSupport.firePropertyChange("medicinename", oldMedicinename, medicinename);
    }

    public String getMedicineprice() {
        return medicineprice;
    }

    public void setMedicineprice(String medicineprice) {
        String oldMedicineprice = this.medicineprice;
        this.medicineprice = medicineprice;
        changeSupport.firePropertyChange("medicineprice", oldMedicineprice, medicineprice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (medicineidno != null ? medicineidno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicinelist)) {
            return false;
        }
        Medicinelist other = (Medicinelist) object;
        if ((this.medicineidno == null && other.medicineidno != null) || (this.medicineidno != null && !this.medicineidno.equals(other.medicineidno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClinicPackage.Medicinelist[ medicineidno=" + medicineidno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
