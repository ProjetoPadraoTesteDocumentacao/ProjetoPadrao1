package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("cap_capitaisDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface cap_capitaisDAO extends JpaRepository<cap_capitais, java.lang.String> {

  /**
   * Obtém a instância de cap_capitais utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM cap_capitais entity WHERE entity.id = :id")
  public cap_capitais findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de cap_capitais utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM cap_capitais entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key idEstado
   * @generated
   */
  @Query("SELECT entity FROM cap_capitais entity WHERE entity.idEstado.id = :id")
  public Page<cap_capitais> findcap_capitaissByIdEstado(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key idCidades
   * @generated
   */
  @Query("SELECT entity FROM cap_capitais entity WHERE entity.idCidades.id = :id")
  public Page<cap_capitais> findcap_capitaissByIdCidades(@Param(value="id") java.lang.String id, Pageable pageable);

}
