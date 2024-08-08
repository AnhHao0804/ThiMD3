package com.example.thimd3.service.impl;

import com.example.thimd3.dao.IMatBangDAO;
import com.example.thimd3.dao.impl.MatBangDAO;
import com.example.thimd3.model.MatBang;
import com.example.thimd3.service.IMatBangService;

import java.util.Collections;
import java.util.List;

public class MatBangService implements IMatBangService {
    private IMatBangDAO matBangDAO = new MatBangDAO();

    @Override
    public boolean addMatBang(MatBang matBang) {
        return matBangDAO.addMatBang(matBang);
    }

    @Override
    public List<MatBang> getAllMatBangs() {
        return matBangDAO.getAllMatBangs();
    }

    @Override
    public boolean editMatBang(MatBang matBang) {
        return false;
    }

    @Override
    public boolean deleteMatBang(String maMatBang) {
        return matBangDAO.deleteMatBang(maMatBang);
    }
}
