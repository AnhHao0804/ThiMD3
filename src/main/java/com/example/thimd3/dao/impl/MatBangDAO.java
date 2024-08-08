package com.example.thimd3.dao.impl;

import com.example.thimd3.dao.IMatBangDAO;
import com.example.thimd3.model.MatBang;
import com.example.thimd3.utils.JDBCConnection;

import javax.swing.*;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatBangDAO implements IMatBangDAO {
    private final String SELECT_ALL_MATBANG = "SELECT * FROM Mat_Bang";
    private final String INSERT_MATBANG = "INSERT INTO Mat_Bang (Ma_Mat_Bang, Ma_Toa_Nha, So_Mat_Bang, Dien_Tich, Loai_Mat_Bang, Gia_Thue, Trang_Thai) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String DELETE_MATBANG_SQL = "DELETE FROM Mat_Bang WHERE Ma_Mat_Bang = ?";

    @Override
    public boolean addMatBang(MatBang matBang) {
        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MATBANG)) {
            preparedStatement.setString(1, matBang.getMaMatBang());
            preparedStatement.setString(2, matBang.getMaToaNha());
            preparedStatement.setInt(3, matBang.getSoMatBang());
            preparedStatement.setBigDecimal(4, matBang.getDienTich());
            preparedStatement.setString(5, matBang.getLoaiMatBang());
            preparedStatement.setBigDecimal(6, matBang.getGiaThue());
            preparedStatement.setString(7, matBang.getTrangThai());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<MatBang> getAllMatBangs() {
        List<MatBang> matBangs = new ArrayList<>();
        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_MATBANG);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String maMatBang = resultSet.getString("Ma_Mat_Bang");
                String maToaNha = resultSet.getString("Ma_Toa_Nha");
                int soMatBang = resultSet.getInt("So_Mat_Bang");
                BigDecimal dienTich = resultSet.getBigDecimal("Dien_Tich");
                String loaiMatBang = resultSet.getString("Loai_Mat_Bang");
                BigDecimal giaThue = resultSet.getBigDecimal("Gia_Thue");
                String trangThai = resultSet.getString("Trang_Thai");

                matBangs.add(new MatBang(maMatBang, maToaNha, soMatBang, dienTich, loaiMatBang, giaThue, trangThai));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return matBangs;
    }


    @Override
    public boolean editMatBang(MatBang matBang) {
        return false;
    }

    @Override
    public boolean deleteMatBang(String maMatBang) {
        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_MATBANG_SQL)) {
            preparedStatement.setString(1, maMatBang);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }




}




