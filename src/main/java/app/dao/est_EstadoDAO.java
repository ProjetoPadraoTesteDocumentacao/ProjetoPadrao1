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
@Repository("est_EstadoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface est_EstadoDAO extends JpaRepository<est_Estado, java.lang.String> {

  /**
   * Obtém a instância de est_Estado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM est_Estado entity WHERE entity.id = :id")
  public est_Estado findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de est_Estado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM est_Estado entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM cid_cidades entity WHERE entity.est_Estado.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<cid_cidades> findCid_cidadesGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM cid_cidades entity WHERE entity.est_Estado.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<cid_cidades> findCid_cidadesSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM cid_cidades entity WHERE entity.est_Estado.id = :id")
  public Page<cid_cidades> findCid_cidades(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM cap_capitais entity WHERE entity.idEstado.id = :id")
  public Page<cap_capitais> findCap_capitais(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.idCidades FROM cap_capitais entity WHERE entity.idEstado.id = :id AND (entity.idCidades.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<cid_cidades> listCid_cidades_2GeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.idCidades FROM cap_capitais entity WHERE entity.idEstado.id = :id AND (:nome is null OR entity.idCidades.nome like concat('%',:nome,'%'))")
  public Page<cid_cidades> listCid_cidades_2SpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.idCidades FROM cap_capitais entity WHERE entity.idEstado.id = :id")
  public Page<cid_cidades> listCid_cidades_2(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM cap_capitais entity WHERE entity.idEstado.id = :instanceId AND entity.idCidades.id = :relationId")
  public int deleteCid_cidades_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM est_Estado entity WHERE entity.nome like concat('%',coalesce(:search,''),'%') OR entity.sigla like concat('%',coalesce(:search,''),'%')")
  public Page<est_Estado> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM est_Estado entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:sigla is null OR entity.sigla like concat('%',:sigla,'%'))")
  public Page<est_Estado> specificSearch(@Param(value="nome") java.lang.String nome, @Param(value="sigla") java.lang.String sigla, Pageable pageable);
  
}
