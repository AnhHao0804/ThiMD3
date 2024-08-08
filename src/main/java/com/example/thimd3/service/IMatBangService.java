package com.example.thimd3.service;

import com.example.thimd3.model.MatBang;

import java.util.List;

public interface IMatBangService {
    boolean addMatBang(MatBang matBang);
    List<MatBang> getAllMatBangs();
    boolean editMatBang(MatBang matBang);
    boolean deleteMatBang(String maMatBang);
}
