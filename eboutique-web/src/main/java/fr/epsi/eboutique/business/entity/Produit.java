package fr.epsi.eboutique.business.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity (name="produit")
@Table (name="produit")
public class Produit {
  
  @Id	
  private Long identifier;
  
  private String libelle;
  
  private String description;
  
  private BigDecimal prix;
  
  @ManyToOne 
  private Marque marque;

  public Long getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Long identifier) {
    this.identifier = identifier;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrix() {
    return prix;
  }

  public void setPrix(BigDecimal prix) {
    this.prix = prix;
  }

  public Marque getMarque() {
    return marque;
  }

  public void setMarque(Marque marque) {
    this.marque = marque;
  }
  
  
}
