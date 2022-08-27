package sn.isi.parcinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sn.isi.parcinfo.entities.Ingenieur;
import sn.isi.parcinfo.service.IIngenieurService;

import java.util.List;

@Controller
public class IngenieurController {

    @Autowired
    private IIngenieurService iIngenieurService;

    @GetMapping("/ingenieur/save")
    public String save(Model model){
        model.addAttribute("ingenieur", new Ingenieur());
        return "ingenieur/save";
    }
    @PostMapping("/ingenieur/save")
    public String save(Model model, Ingenieur ingenieur){
        iIngenieurService.save(ingenieur);
        return "ingenieur/confirmationajout";
    }

    @GetMapping("/ingenieur/edit/{id}")
    public String edit(@PathVariable int id){
        return "ingenieur/edit";
    }

    @GetMapping("/ingenieur/list")
    public String list(Model model){
        List<Ingenieur> ingenieurs=iIngenieurService.getAll();
        model.addAttribute("listIngenieurs",ingenieurs);
        return "ingenieur/list";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/accueil")
    public String accueil(){
        return "accueil";
    }
}
