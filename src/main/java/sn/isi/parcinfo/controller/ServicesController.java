package sn.isi.parcinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sn.isi.parcinfo.entities.Ingenieur;
import sn.isi.parcinfo.entities.Services;

@Controller
public class ServicesController {
    @PostMapping("/services/save")
    public String save(Services services){
        return "services/save";
    }

    @GetMapping("/services/edit/{id}")
    public String edit(@PathVariable int id){
        return "services/edit";
    }

    @GetMapping("/services/list")
    public String list(Model model){
        return "services/list";
    }
}
