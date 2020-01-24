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
@Table(name = "KULLANICILAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kullanicilar.findAll", query = "SELECT k FROM Kullanicilar k")
    , @NamedQuery(name = "Kullanicilar.findByTc", query = "SELECT k FROM Kullanicilar k WHERE k.tc = :tc")
    , @NamedQuery(name = "Kullanicilar.findByKullaniciadi", query = "SELECT k FROM Kullanicilar k WHERE k.kullaniciadi = :kullaniciadi")
    , @NamedQuery(name = "Kullanicilar.findBySifre", query = "SELECT k FROM Kullanicilar k WHERE k.sifre = :sifre")
    , @NamedQuery(name = "Kullanicilar.findByAdi", query = "SELECT k FROM Kullanicilar k WHERE k.adi = :adi")
    , @NamedQuery(name = "Kullanicilar.findBySoyadi", query = "SELECT k FROM Kullanicilar k WHERE k.soyadi = :soyadi")
    , @NamedQuery(name = "Kullanicilar.findByMail", query = "SELECT k FROM Kullanicilar k WHERE k.mail = :mail")})
public class Kullanicilar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TC")
    private Integer tc;
    @Basic(optional = false)
    @Column(name = "KULLANICIADI")
    private String kullaniciadi;
    @Basic(optional = false)
    @Column(name = "SIFRE")
    private int sifre;
    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Basic(optional = false)
    @Column(name = "SOYADI")
    private String soyadi;
    @Basic(optional = false)
    @Column(name = "MAIL")
    private String mail;

    public Kullanicilar() {
    }

    public Kullanicilar(Integer tc) {
        this.tc = tc;
    }

    public Kullanicilar(Integer tc, String kullaniciadi, int sifre, String adi, String soyadi, String mail) {
        this.tc = tc;
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
        this.adi = adi;
        this.soyadi = soyadi;
        this.mail = mail;
    }

    public Integer getTc() {
        return tc;
    }

    public void setTc(Integer tc) {
        this.tc = tc;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tc != null ? tc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kullanicilar)) {
            return false;
        }
        Kullanicilar other = (Kullanicilar) object;
        if ((this.tc == null && other.tc != null) || (this.tc != null && !this.tc.equals(other.tc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tugfe_\u0131vecek_1621231018_bp\u0131\u0131_odev2.Kullanicilar[ tc=" + tc + " ]";
    }
    
}
