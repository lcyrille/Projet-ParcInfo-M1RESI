package sn.isi.parcinfo.service;

import sn.isi.parcinfo.entities.Serveur;

import java.util.List;

public interface IServeurService {
    public Serveur save(Serveur serveur);
    public Serveur update(Serveur serveur);
    public void remove(int id);
    public Serveur get(int id);
    public List<Serveur> getAll();

}
