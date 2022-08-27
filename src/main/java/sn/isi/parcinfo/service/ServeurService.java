package sn.isi.parcinfo.service;

import org.springframework.stereotype.Service;
import sn.isi.parcinfo.dao.IServeurDao;
import sn.isi.parcinfo.entities.Serveur;

import java.util.List;

@Service
public class ServeurService implements IServeurService {

    private IServeurDao iServeurDao;

    public ServeurService(IServeurDao iServeurDao) { this.iServeurDao = iServeurDao; }

    @Override
    public Serveur save(Serveur serveur) {
        return iServeurDao.save(serveur);
    }

    @Override
    public Serveur update(Serveur serveur) {
        Serveur srv = iServeurDao.findById(serveur.getId()).get();
        srv.setNom(serveur.getNom());
        srv.setAdrIp(serveur.getAdrIp());
        return iServeurDao.save(srv);
    }

    @Override
    public void remove(int id) {
        iServeurDao.delete(iServeurDao.findById(id).get());
    }

    @Override
    public Serveur get(int id) {
        return iServeurDao.findById(id).get();
    }

    @Override
    public List<Serveur> getAll() {
        return iServeurDao.findAll();
    }
}
