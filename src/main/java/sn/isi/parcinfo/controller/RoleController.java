package sn.isi.parcinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sn.isi.parcinfo.entities.Ingenieur;
import sn.isi.parcinfo.entities.Role;

@Controller
public class RoleController {
    @PostMapping("/role/save")
    public String save(Role role){
        return "role/save";
    }

    @GetMapping("/role/edit/{id}")
    public String edit(@PathVariable int id){
        return "role/edit";
    }

    @GetMapping("/role/list")
    public String list(Model model){
        return "role/list";
    }
}
