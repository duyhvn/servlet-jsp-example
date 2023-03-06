package duy.hvn.tech.controller;

import duy.hvn.tech.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private final AdminService adminService;

    public HomeController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/")
    public ModelAndView helloWorld() {
        return new ModelAndView("home", "obj", adminService);
    }
}