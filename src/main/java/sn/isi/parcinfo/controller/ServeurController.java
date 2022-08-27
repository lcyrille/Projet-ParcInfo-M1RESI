package sn.isi.parcinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sn.isi.parcinfo.entities.Ingenieur;
import sn.isi.parcinfo.entities.Serveur;

@Controller
public class ServeurController {
    @PostMapping("/serveur/save")
    public String save(Serveur serveur){
        return "serveur/save";
    }

    @GetMapping("/serveur/edit/{id}")
    public String edit(@PathVariable int id){
        return "serveur/edit";
    }

    @GetMapping("/serveur/list")
    public String list(Model model){
        return "serveur/list";
    }
}
