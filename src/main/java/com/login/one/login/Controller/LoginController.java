package com.login.one.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.one.login.Entity.ClientsEntity;
import com.login.one.login.Entity.LoginsEntity;
import com.login.one.login.Entity.UsersEntity;
import com.login.one.login.Service.LoginsService;

import org.springframework.ui.Model;

@Controller
public class LoginController {
    @Autowired
    private LoginsService loginsService;

    @GetMapping("/login")
    public String logins(@RequestParam(required = false) String error, Model model){
        if(error !=null){
            model.addAttribute(error, "Error en las credenciales");
        }
        return "login";
    }

    @PostMapping("/login")
    public String loggins(@RequestParam String username, @RequestParam String password, Model model){
        LoginsEntity login = loginsService.findByUsername(username);
        if(login !=null){
            if(login.getPassword().equals(password)){
                UsersEntity user = login.getUsersEntity();
                ClientsEntity client = user.getCliente();

                model.addAttribute("name", client.getName());
                model.addAttribute("last_name", client.getLast_name());
                model.addAttribute("username", username);
                return "home";
            } else{
                model.addAttribute("error", "password");
            }
        } else {
            model.addAttribute("error", "user");
        }
        return "login";
    }
}