/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugfe_ıvecek_1621231018_bpıı_odev2;

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
 * @author tuğfe
 */
@Entity
@Table(name = "YAYINEVLER\u0130")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Yayinevleri.findAll", query = "SELECT y FROM Yayinevleri y")
    , @NamedQuery(name = "Yayinevleri.findByYayinevikodu", query = "SELECT y FROM Yayinevleri y WHERE y.yayinevikodu = :yayinevikodu")
    , @NamedQuery(name = "Yayinevleri.findByYayineviadi", query = "SELECT y FROM Yayinevleri y WHERE y.yayineviadi = :yayineviadi")
    , @NamedQuery(name = "Yayinevleri.findByYayineviilce", query = "SELECT y FROM Yayinevleri y WHERE y.yayineviilce = :yayineviilce")
    , @NamedQuery(name = "Yayinevleri.findByYayineviil", query = "SELECT y FROM Yayinevleri y WHERE y.yayineviil = :yayineviil")})
public class Yayinevleri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "YAYINEVIKODU")
    private Integer yayinevikodu;
    @Basic(optional = false)
    @Column(name = "YAYINEVIADI")
    private String yayineviadi;
    @Basic(optional = false)
    @Column(name = "YAYINEVIILCE")
    private String yayineviilce;
    @Basic(optional = false)
    @Column(name = "YAYINEVIIL")
    private String yayineviil;

    public Yayinevleri() {
    }

    public Yayinevleri(Integer yayinevikodu) {
        this.yayinevikodu = yayinevikodu;
    }

    public Yayinevleri(Integer yayinevikodu, String yayineviadi, String yayineviilce, String yayineviil) {
        this.yayinevikodu = yayinevikodu;
        this.yayineviadi = yayineviadi;
        this.yayineviilce = yayineviilce;
        this.yayineviil = yayineviil;
    }

    public Integer getYayinevikodu() {
        return yayinevikodu;
    }

    public void setYayinevikodu(Integer yayinevikodu) {
        this.yayinevikodu = yayinevikodu;
    }

    public String getYayineviadi() {
        return yayineviadi;
    }

    public void setYayineviadi(String yayineviadi) {
        this.yayineviadi = yayineviadi;
    }

    public String getYayineviilce() {
        return yayineviilce;
    }

    public void setYayineviilce(String yayineviilce) {
        this.yayineviilce = yayineviilce;
    }

    public String getYayineviil() {
        return yayineviil;
    }

    public void setYayineviil(String yayineviil) {
        this.yayineviil = yayineviil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yayinevikodu != null ? yayinevikodu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Yayinevleri)) {
            return false;
        }
        Yayinevleri other = (Yayinevleri) object;
        if ((this.yayinevikodu == null && other.yayinevikodu != null) || (this.yayinevikodu != null && !this.yayinevikodu.equals(other.yayinevikodu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tugfe_\u0131vecek_1621231018_bp\u0131\u0131_odev2.Yayinevleri[ yayinevikodu=" + yayinevikodu + " ]";
    }
    
}
