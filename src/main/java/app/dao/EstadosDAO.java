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
@Repository("EstadosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface EstadosDAO extends JpaRepository<Estados, java.lang.String> {

  /**
   * Obtém a instância de Estados utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Estados entity WHERE entity.id = :id")
  public Estados findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Estados utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Estados entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Cidades entity WHERE entity.estado.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<Cidades> findCidadesGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Cidades entity WHERE entity.estado.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Cidades> findCidadesSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Cidades entity WHERE entity.estado.id = :id")
  public Page<Cidades> findCidades(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Estados entity WHERE entity.nome like concat('%',coalesce(:search,''),'%') OR entity.sigla like concat('%',coalesce(:search,''),'%')")
  public Page<Estados> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Estados entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:sigla is null OR entity.sigla like concat('%',:sigla,'%'))")
  public Page<Estados> specificSearch(@Param(value="nome") java.lang.String nome, @Param(value="sigla") java.lang.String sigla, Pageable pageable);
  
  /**
   * Foreign Key capital
   * @generated
   */
  @Query("SELECT entity FROM Estados entity WHERE entity.capital.id = :id")
  public Page<Estados> findEstadossByCapital(@Param(value="id") java.lang.String id, Pageable pageable);

}
