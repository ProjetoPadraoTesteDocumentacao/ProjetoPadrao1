package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CAP_CAPITAIS
 * @generated
 */
@Entity
@Table(name = "\"CAP_CAPITAIS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.cap_capitais")
public class cap_capitais implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "cap_id", nullable = true, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cap_est_Estado", nullable = true, referencedColumnName = "est_id", insertable=true, updatable=true)
  
  private est_Estado idEstado;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cap_cid_cidades", nullable = true, referencedColumnName = "cid_id", insertable=true, updatable=true)
  
  private cid_cidades idCidades;

  /**
   * Construtor
   * @generated
   */
  public cap_capitais(){
  }


  /**
   * Obtém idEstado
   * return idEstado
   * @generated
   */
  
  public est_Estado getIdEstado(){
    return this.idEstado;
  }

  /**
   * Define idEstado
   * @param idEstado idEstado
   * @generated
   */
  public cap_capitais setIdEstado(est_Estado idEstado){
    this.idEstado = idEstado;
    return this;
  }

  /**
   * Obtém idCidades
   * return idCidades
   * @generated
   */
  
  public cid_cidades getIdCidades(){
    return this.idCidades;
  }

  /**
   * Define idCidades
   * @param idCidades idCidades
   * @generated
   */
  public cap_capitais setIdCidades(cid_cidades idCidades){
    this.idCidades = idCidades;
    return this;
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
  public cap_capitais setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    cap_capitais object = (cap_capitais)obj;
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
