package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class cap_capitaisPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.String est;
  
  /**
   * @generated
   */
  private java.lang.String cid;
  
  /**
   * Construtor
   * @generated
   */
  public cap_capitaisPK(){
  }
  
  /**
   * Obtém est
   * return est
   * @generated
   */
  public java.lang.String getEst(){
    return this.est;
  }
  
  /**
   * Define est
   * @param est est
   * @generated
   */
  public cap_capitaisPK setEst(java.lang.String est){
    this.est = est;
    return this;
  }
  /**
   * Obtém cid
   * return cid
   * @generated
   */
  public java.lang.String getCid(){
    return this.cid;
  }
  
  /**
   * Define cid
   * @param cid cid
   * @generated
   */
  public cap_capitaisPK setCid(java.lang.String cid){
    this.cid = cid;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    cap_capitaisPK object = (cap_capitaisPK)obj;
    if (est != null ? !est.equals(object.est) : object.est != null) return false;
    if (cid != null ? !cid.equals(object.cid) : object.cid != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((est == null) ? 0 : est.hashCode());
    result = 31 * result + ((cid == null) ? 0 : cid.hashCode());
    return result;
  }

}
