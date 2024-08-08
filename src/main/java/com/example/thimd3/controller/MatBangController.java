package com.example.thimd3.controller;

import com.example.thimd3.dao.IMatBangDAO;
import com.example.thimd3.dao.impl.MatBangDAO;
import com.example.thimd3.model.MatBang;
import com.example.thimd3.service.IMatBangService;
import com.example.thimd3.service.impl.MatBangService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "MatBangController" , value = "/matbangs")
public class MatBangController extends HttpServlet {
    private IMatBangService matBangService = new MatBangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
               // showCreateForm(req, resp);
                break;
            case "edit":
                //showEditForm(req, resp);
                break;
            case "delete":
                deleteMatBang(request, response);
                break;
            case "search":
                //searchCustomer(req, resp);
                break;
            default:
                listMatBang(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private void listMatBang(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MatBang> matbangs = matBangService.getAllMatBangs();
        req.setAttribute("matBangList", matbangs);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/list-matbang.jsp");
        dispatcher.forward(req, resp);
    }
    private void deleteMatBang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maMatBang = request.getParameter("maMatBang");
        boolean result = matBangService.deleteMatBang(maMatBang);
        String message = result ? "Xóa mặt bằng thành công" : "Xóa mặt bằng thất bại";
        request.setAttribute("message", message);
        listMatBang(request, response);
    }
}
