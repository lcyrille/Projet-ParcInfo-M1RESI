package sn.isi.parcinfo.service;

import org.springframework.stereotype.Service;
import sn.isi.parcinfo.dao.IServiceDao;
import sn.isi.parcinfo.entities.Services;

import java.util.List;

@Service
public class ServiceService implements IServiceService {
private IServiceDao iServiceDao;

    public ServiceService(IServiceDao iServiceDao) {
        this.iServiceDao = iServiceDao;
    }

    @Override
    public Services save(Services service) {
        return iServiceDao.save(service);
    }

    @Override
    public Services update(Services service) {
        Services serv = iServiceDao.findById(service.getId()).get();
        serv.setNom(service.getNom());
        serv.setPort(service.getPort());
        return iServiceDao.save(serv);
    }

    @Override
    public void remove(int id) { iServiceDao.delete(iServiceDao.findById(id).get());   }

    @Override
    public Services get(int id) {
        return iServiceDao.findById(id).get();
    }

    @Override
    public List<Services> getAll() {
        return iServiceDao.findAll();
    }
}
