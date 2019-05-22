package fr.epsi.eboutique.business.entity;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity (name="commande")
@Table (name="commande")
public class Commande {

  @Id
  private Long identifier;
  
  @OneToMany
  private Collection<CommandeLigne> lignes;
  
  private LocalDate dateCreation;

  public Collection<CommandeLigne> getLignes() {
    return lignes;
  }

  public void setLignes(Collection<CommandeLigne> lignes) {
    this.lignes = lignes;
  }

  public LocalDate getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(LocalDate dateCreation) {
    this.dateCreation = dateCreation;
  }

  public Long getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Long identifier) {
    this.identifier = identifier;
  }
  
  
}
