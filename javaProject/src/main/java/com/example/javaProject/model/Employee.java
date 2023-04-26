package com.example.javaProject.model;
import jakarta.persistence.*;
@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "urun_tipi")
    private String urunTipi;

    @Column(name = "urun_seri_no")
    private String seriNo;
    @Column(name = "urun_bolge")
    private String urunBolge;
    @Column(name = "urun_kimde")
    private String urunKimde;
    @Column(name = "urun_kayit_giren_kullanici")
    private String kayitKullanici;
    @Column(name = "urun_kayit_tipi")
    private String kayitTipi;

    @Column(name = "urun_kayit_tarihi")
    private String kayitTarihi;

    public Employee() {

    }

    public Employee(String urunTipi, String seriNo, String urunBolge, String urunKimde , String kayitKullanici , String kayitTipi , String kayitTarihi) {
        super();
        this.urunTipi = urunTipi;
        this.seriNo = seriNo;
        this.urunBolge = urunBolge;
        this.urunKimde = urunKimde;
        this.kayitKullanici = kayitKullanici;
        this.kayitTipi = kayitTipi;
        this.kayitTarihi = kayitTarihi;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUrunTipi() {
        return urunTipi;
    }
    public void setUrunTipi(String urunTipi) {
        this.urunTipi = urunTipi;
    }
    public String getSeriNo() {
        return seriNo;
    }
    public void setSeriNo(String seriNo) {
        this.seriNo = seriNo;
    }
    public String getUrunBolge() {
        return urunBolge;
    }
    public void setUrunBolge(String urunBolge) {
        this.urunBolge = urunBolge;
    }
    public String getUrunKimde() {
        return urunKimde;
    }
    public void setUrunKimde(String urunKimde) {
        this.urunKimde = urunKimde;
    }
    public String getKayitKullanici() {
        return kayitKullanici;
    }
    public void setKayitKullanici(String kayitKullanici) {
        this.kayitKullanici = kayitKullanici;
    }
    public String getKayitTipi() {
        return kayitTipi;
    }
    public void setKayitTipi(String kayitTipi) {
        this.kayitTipi = kayitTipi;
    }
    public String getKayitTarihi() {
        return kayitTarihi;
    }
    public void setKayitTarihi(String kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }
}
