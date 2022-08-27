package sn.isi.parcinfo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.isi.parcinfo.entities.Ingenieur;
import sn.isi.parcinfo.entities.Role;
import sn.isi.parcinfo.entities.Serveur;
import sn.isi.parcinfo.entities.Services;
import sn.isi.parcinfo.service.IIngenieurService;
import sn.isi.parcinfo.service.IRoleService;
import sn.isi.parcinfo.service.IServeurService;
import sn.isi.parcinfo.service.IServiceService;

@SpringBootApplication
public class ParcinfoApplication implements CommandLineRunner {

	//Injection de dependence du service pour les traitements
    private IServeurService iServeurService;
	private IIngenieurService iIngenieurService;
	private IServiceService iServiceService;
	private IRoleService iRoleService;

	public ParcinfoApplication(IServeurService iServeurService, IIngenieurService iIngenieurService, IServiceService iServiceService, IRoleService iRoleService) {
		this.iServeurService = iServeurService;
		this.iIngenieurService = iIngenieurService;
		this.iServiceService = iServiceService;
		this.iRoleService = iRoleService;
	}


	public static void main(String[] args) {
		SpringApplication.run(ParcinfoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Creation d'un objet serveur à inserer
	     /*Serveur serveur = new Serveur();
		serveur.setAdrIp("192.168.1.15");
		serveur.setNom("Web server");
		serveur.setIngenieur(iIngenieurService.get(1)); */


		//Insertion dans la base de données
		/*serveur = iServeurService.save(serveur);
		System.out.println(serveur.getId());*/

		//Creation d'un objet serveur à inserer
		/*Services service = new Services();
		service.setNom("ssh");
		service.setPort(22);
		service.setIngenieur(iIngenieurService.get(1));
		service.setServeur(iServeurService.get(8));*/

		//Insertion dans la base de données
		/*service = iServiceService.save(service);
		System.out.println(service.getId());*/

	}
}
