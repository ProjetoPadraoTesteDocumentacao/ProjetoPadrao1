package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CID_CIDADES
 * @generated
 */
@Entity
@Table(name = "\"CID_CIDADES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.cid_cidades")
public class cid_cidades implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "cid_id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "cid_nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_est_Estado", nullable = true, referencedColumnName = "est_id", insertable=true, updatable=true)
  
  private est_Estado est_Estado;

  /**
   * Construtor
   * @generated
   */
  public cid_cidades(){
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
  public cid_cidades setId(java.lang.String id){
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
  public cid_cidades setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém est_Estado
   * return est_Estado
   * @generated
   */
  
  public est_Estado getEst_Estado(){
    return this.est_Estado;
  }

  /**
   * Define est_Estado
   * @param est_Estado est_Estado
   * @generated
   */
  public cid_cidades setEst_Estado(est_Estado est_Estado){
    this.est_Estado = est_Estado;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    cid_cidades object = (cid_cidades)obj;
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
