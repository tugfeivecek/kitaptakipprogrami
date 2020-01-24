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
@Table(name = "KITAPLAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kitaplar.findAll", query = "SELECT k FROM Kitaplar k")
    , @NamedQuery(name = "Kitaplar.findByIsbn", query = "SELECT k FROM Kitaplar k WHERE k.isbn = :isbn")
    , @NamedQuery(name = "Kitaplar.findByKitapismi", query = "SELECT k FROM Kitaplar k WHERE k.kitapismi = :kitapismi")
    , @NamedQuery(name = "Kitaplar.findByBasimyili", query = "SELECT k FROM Kitaplar k WHERE k.basimyili = :basimyili")
    , @NamedQuery(name = "Kitaplar.findBySayfasayisi", query = "SELECT k FROM Kitaplar k WHERE k.sayfasayisi = :sayfasayisi")
    , @NamedQuery(name = "Kitaplar.findByFiyat", query = "SELECT k FROM Kitaplar k WHERE k.fiyat = :fiyat")
    , @NamedQuery(name = "Kitaplar.findByYayinevi", query = "SELECT k FROM Kitaplar k WHERE k.yayinevi = :yayinevi")
    , @NamedQuery(name = "Kitaplar.findByYazar", query = "SELECT k FROM Kitaplar k WHERE k.yazar = :yazar")})
public class Kitaplar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBN")
    private Integer isbn;
    @Basic(optional = false)
    @Column(name = "KITAPISMI")
    private String kitapismi;
    @Basic(optional = false)
    @Column(name = "BASIMYILI")
    private int basimyili;
    @Basic(optional = false)
    @Column(name = "SAYFASAYISI")
    private int sayfasayisi;
    @Basic(optional = false)
    @Column(name = "FIYAT")
    private int fiyat;
    @Basic(optional = false)
    @Column(name = "YAYINEVI")
    private String yayinevi;
    @Basic(optional = false)
    @Column(name = "YAZAR")
    private String yazar;

    public Kitaplar() {
    }

    public Kitaplar(Integer isbn) {
        this.isbn = isbn;
    }

    public Kitaplar(Integer isbn, String kitapismi, int basimyili, int sayfasayisi, int fiyat, String yayinevi, String yazar) {
        this.isbn = isbn;
        this.kitapismi = kitapismi;
        this.basimyili = basimyili;
        this.sayfasayisi = sayfasayisi;
        this.fiyat = fiyat;
        this.yayinevi = yayinevi;
        this.yazar = yazar;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getKitapismi() {
        return kitapismi;
    }

    public void setKitapismi(String kitapismi) {
        this.kitapismi = kitapismi;
    }

    public int getBasimyili() {
        return basimyili;
    }

    public void setBasimyili(int basimyili) {
        this.basimyili = basimyili;
    }

    public int getSayfasayisi() {
        return sayfasayisi;
    }

    public void setSayfasayisi(int sayfasayisi) {
        this.sayfasayisi = sayfasayisi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kitaplar)) {
            return false;
        }
        Kitaplar other = (Kitaplar) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tugfe_\u0131vecek_1621231018_bp\u0131\u0131_odev2.Kitaplar[ isbn=" + isbn + " ]";
    }
    
}
