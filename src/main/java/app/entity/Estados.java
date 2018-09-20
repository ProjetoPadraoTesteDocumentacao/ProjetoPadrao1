package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ESTADOS
 * @generated
 */
@Entity
@Table(name = "\"ESTADOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Estados")
public class Estados implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "sigla", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String sigla;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cidades", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Cidades capital;

  /**
   * Construtor
   * @generated
   */
  public Estados(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Estados setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Estados setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém sigla
   * return sigla
   * @generated
   */
  
  public java.lang.String getSigla(){
    return this.sigla;
  }

  /**
   * Define sigla
   * @param sigla sigla
   * @generated
   */
  public Estados setSigla(java.lang.String sigla){
    this.sigla = sigla;
    return this;
  }

  /**
   * Obtém capital
   * return capital
   * @generated
   */
  
  public Cidades getCapital(){
    return this.capital;
  }

  /**
   * Define capital
   * @param capital capital
   * @generated
   */
  public Estados setCapital(Cidades capital){
    this.capital = capital;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Estados object = (Estados)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
