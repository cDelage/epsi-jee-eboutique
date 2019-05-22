package fr.epsi.eboutique.business.dao;

import java.util.Collection;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.epsi.eboutique.business.entity.Produit;

@Named
public class ProduitDao {

	  @PersistenceContext
	  private EntityManager em;
	  
	  public Collection<Produit> findAll(){
		    return em.createQuery("select libelle from produit").getResultList();
		  }
}
