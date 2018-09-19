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
@Repository("cid_cidadesDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface cid_cidadesDAO extends JpaRepository<cid_cidades, java.lang.String> {

  /**
   * Obtém a instância de cid_cidades utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM cid_cidades entity WHERE entity.id = :id")
  public cid_cidades findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de cid_cidades utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM cid_cidades entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM cap_capitais entity WHERE entity.idCidades.id = :id")
  public Page<cap_capitais> findCap_capitais(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.idEstado FROM cap_capitais entity WHERE entity.idCidades.id = :id AND (entity.idEstado.nome like concat('%',coalesce(:search,''),'%') OR entity.idEstado.sigla like concat('%',coalesce(:search,''),'%'))")
  public Page<est_Estado> listEst_EstadoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.idEstado FROM cap_capitais entity WHERE entity.idCidades.id = :id AND (:nome is null OR entity.idEstado.nome like concat('%',:nome,'%')) AND (:sigla is null OR entity.idEstado.sigla like concat('%',:sigla,'%'))")
  public Page<est_Estado> listEst_EstadoSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, @Param(value="sigla") java.lang.String sigla, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.idEstado FROM cap_capitais entity WHERE entity.idCidades.id = :id")
  public Page<est_Estado> listEst_Estado(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM cap_capitais entity WHERE entity.idCidades.id = :instanceId AND entity.idEstado.id = :relationId")
  public int deleteEst_Estado(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM cid_cidades entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<cid_cidades> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM cid_cidades entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<cid_cidades> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
  /**
   * Foreign Key est_Estado
   * @generated
   */
  @Query("SELECT entity FROM cid_cidades entity WHERE entity.est_Estado.id = :id")
  public Page<cid_cidades> findcid_cidadessByEst_Estado(@Param(value="id") java.lang.String id, Pageable pageable);

}
