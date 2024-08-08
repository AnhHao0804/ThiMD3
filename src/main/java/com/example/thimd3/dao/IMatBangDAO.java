package com.example.thimd3.dao;

import com.example.thimd3.model.MatBang;

import java.util.List;

public interface IMatBangDAO {
    boolean addMatBang(MatBang matBang);
    List<MatBang> getAllMatBangs();
    boolean editMatBang(MatBang matBang);
    boolean deleteMatBang(String maMatBang);
}
