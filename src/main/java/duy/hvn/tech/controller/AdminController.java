package duy.hvn.tech.controller;

import duy.hvn.tech.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admin/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World " +  adminService;
    }
}