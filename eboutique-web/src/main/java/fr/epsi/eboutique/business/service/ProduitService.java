package fr.epsi.eboutique.business.service;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import fr.epsi.eboutique.business.dao.ProduitDao;
import fr.epsi.eboutique.business.entity.Produit;

@Named
public class ProduitService {
	
	@Inject
	private ProduitDao produitDao;
	
	  public Collection<Produit> findAll() {
		    return this.produitDao.findAll();
		  }

}
