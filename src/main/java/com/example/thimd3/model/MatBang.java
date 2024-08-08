package com.example.thimd3.model;
import java.math.BigDecimal;

public class MatBang {
    private String maMatBang;
    private String maToaNha;
    private int soMatBang;
    private BigDecimal dienTich;
    private String loaiMatBang;
    private BigDecimal giaThue;
    private String trangThai;

    public MatBang() {
    }

    // Constructor, Getters, and Setters
    public MatBang(String maMatBang, String maToaNha, int soMatBang, BigDecimal dienTich, String loaiMatBang, BigDecimal giaThue, String trangThai) {
        this.maMatBang = maMatBang;
        this.maToaNha = maToaNha;
        this.soMatBang = soMatBang;
        this.dienTich = dienTich;
        this.loaiMatBang = loaiMatBang;
        this.giaThue = giaThue;
        this.trangThai = trangThai;
    }

    public String getMaMatBang() {
        return maMatBang;
    }

    public void setMaMatBang(String maMatBang) {
        this.maMatBang = maMatBang;
    }

    public String getMaToaNha() {
        return maToaNha;
    }

    public void setMaToaNha(String maToaNha) {
        this.maToaNha = maToaNha;
    }

    public int getSoMatBang() {
        return soMatBang;
    }

    public void setSoMatBang(int soMatBang) {
        this.soMatBang = soMatBang;
    }

    public BigDecimal getDienTich() {
        return dienTich;
    }

    public void setDienTich(BigDecimal dienTich) {
        this.dienTich = dienTich;
    }

    public String getLoaiMatBang() {
        return loaiMatBang;
    }

    public void setLoaiMatBang(String loaiMatBang) {
        this.loaiMatBang = loaiMatBang;
    }

    public BigDecimal getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(BigDecimal giaThue) {
        this.giaThue = giaThue;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
