package sn.isi.parcinfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.parcinfo.entities.Ingenieur;
import sn.isi.parcinfo.entities.Serveur;

import java.util.List;

public interface IServeurDao extends JpaRepository<Serveur,Integer> {

}
