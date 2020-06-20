/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsbk_database_pack;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gredo_JT
 */
@Entity
@Table(name = "pengadaan_apd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PengadaanApd.findAll", query = "SELECT p FROM PengadaanApd p")
    , @NamedQuery(name = "PengadaanApd.findById", query = "SELECT p FROM PengadaanApd p WHERE p.id = :id")
    , @NamedQuery(name = "PengadaanApd.findByNamaSekolah", query = "SELECT p FROM PengadaanApd p WHERE p.namaSekolah = :namaSekolah")
    , @NamedQuery(name = "PengadaanApd.findByAlamatSekolah", query = "SELECT p FROM PengadaanApd p WHERE p.alamatSekolah = :alamatSekolah")
    , @NamedQuery(name = "PengadaanApd.findByJumlahGuru", query = "SELECT p FROM PengadaanApd p WHERE p.jumlahGuru = :jumlahGuru")
    , @NamedQuery(name = "PengadaanApd.findByJumlahPegawai", query = "SELECT p FROM PengadaanApd p WHERE p.jumlahPegawai = :jumlahPegawai")
    , @NamedQuery(name = "PengadaanApd.findByJumlahMurid", query = "SELECT p FROM PengadaanApd p WHERE p.jumlahMurid = :jumlahMurid")
    , @NamedQuery(name = "PengadaanApd.findByZona", query = "SELECT p FROM PengadaanApd p WHERE p.zona = :zona")
    , @NamedQuery(name = "PengadaanApd.findByReqMasker", query = "SELECT p FROM PengadaanApd p WHERE p.reqMasker = :reqMasker")
    , @NamedQuery(name = "PengadaanApd.findByReqFaceshield", query = "SELECT p FROM PengadaanApd p WHERE p.reqFaceshield = :reqFaceshield")
    , @NamedQuery(name = "PengadaanApd.findByReqSanitizer", query = "SELECT p FROM PengadaanApd p WHERE p.reqSanitizer = :reqSanitizer")})
public class PengadaanApd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nama_sekolah")
    private String namaSekolah;
    @Size(max = 50)
    @Column(name = "alamat_sekolah")
    private String alamatSekolah;
    @Column(name = "jumlah_guru")
    private Integer jumlahGuru;
    @Column(name = "jumlah_pegawai")
    private Integer jumlahPegawai;
    @Column(name = "jumlah_murid")
    private Integer jumlahMurid;
    @Size(max = 50)
    @Column(name = "zona")
    private String zona;
    @Column(name = "req_masker")
    private Integer reqMasker;
    @Column(name = "req_faceshield")
    private Integer reqFaceshield;
    @Column(name = "req_sanitizer")
    private Integer reqSanitizer;

    public PengadaanApd() {
    }

    public PengadaanApd(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getAlamatSekolah() {
        return alamatSekolah;
    }

    public void setAlamatSekolah(String alamatSekolah) {
        this.alamatSekolah = alamatSekolah;
    }

    public Integer getJumlahGuru() {
        return jumlahGuru;
    }

    public void setJumlahGuru(Integer jumlahGuru) {
        this.jumlahGuru = jumlahGuru;
    }

    public Integer getJumlahPegawai() {
        return jumlahPegawai;
    }

    public void setJumlahPegawai(Integer jumlahPegawai) {
        this.jumlahPegawai = jumlahPegawai;
    }

    public Integer getJumlahMurid() {
        return jumlahMurid;
    }

    public void setJumlahMurid(Integer jumlahMurid) {
        this.jumlahMurid = jumlahMurid;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Integer getReqMasker() {
        return reqMasker;
    }

    public void setReqMasker(Integer reqMasker) {
        this.reqMasker = reqMasker;
    }

    public Integer getReqFaceshield() {
        return reqFaceshield;
    }

    public void setReqFaceshield(Integer reqFaceshield) {
        this.reqFaceshield = reqFaceshield;
    }

    public Integer getReqSanitizer() {
        return reqSanitizer;
    }

    public void setReqSanitizer(Integer reqSanitizer) {
        this.reqSanitizer = reqSanitizer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PengadaanApd)) {
            return false;
        }
        PengadaanApd other = (PengadaanApd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rsbk_database_pack.PengadaanApd[ id=" + id + " ]";
    }
    
}
