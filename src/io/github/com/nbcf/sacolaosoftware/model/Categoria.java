/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.com.nbcf.sacolaosoftware.model;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 *
 * @author nil_b
 */
@Entity
@Table(name = "categoria", catalog = "vendas", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
    , @NamedQuery(name = "Categoria.findByIdCategoria", query = "SELECT c FROM Categoria c WHERE c.idCategoria = :idCategoria")
    , @NamedQuery(name = "Categoria.findByCategoria", query = "SELECT c FROM Categoria c WHERE c.categoria = :categoria")
        
    , @NamedQuery(name = "Categoria.CarregaPadraoIDTodosUltimos",       query = "SELECT c FROM Categoria  c ORDER BY c.id DESC")
    , @NamedQuery(name = "Categoria.CarregaPadraoIDTodosPrimeiros",     query = "SELECT c FROM Categoria  c ORDER BY c.id ASC")
        
    , @NamedQuery(name = "Categoria.CarregaPadraoNomeTodosUltimos",     query = "SELECT c FROM Categoria  c ORDER BY c.nome DESC")
    , @NamedQuery(name = "Categoria.CarregaPadraoNomeTodosPrimeiros",   query = "SELECT c FROM Categoria  c ORDER BY c.nome ASC") 
        
    , @NamedQuery(name = "Categoria.OrdemAlfabeticaNomeInicio",         query = "SELECT c FROM Categoria  c ORDER BY c.nome ASC")
    , @NamedQuery(name = "Categoria.OrdemAlfabeticaNomeFinal",          query = "SELECT c FROM Categoria  c ORDER BY c.nome DESC")
        
    , @NamedQuery(name = "Categoria.findByCategoriaExistente",          query = "SELECT c FROM Categoria  c WHERE c.nome = :nome") 

        
        
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaComecaComIdPrimeiros",      query = "SELECT c FROM Categoria c WHERE c.nome LIKE :nome$  ORDER BY c.id  ASC")
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaComecaComIdUltimos",        query = "SELECT c FROM Categoria c WHERE c.nome LIKE :nome$  ORDER BY c.id DESC")    
        
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaContemIdPrimeiros",         query = "SELECT c FROM Categoria c WHERE c.nome LIKE :$nome$ ORDER BY c.id ASC")
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaContemIdUltimos",           query = "SELECT c FROM Categoria c WHERE c.nome LIKE :$nome$ ORDER BY c.id DESC")     
        
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaTerminaComIdPrimeiros",     query = "SELECT c FROM Categoria c WHERE c.nome LIKE :$nome  ORDER BY c.id ASC")
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaTerminaComIdUltimos",       query = "SELECT c FROM Categoria c WHERE c.nome LIKE :$nome  ORDER BY c.id DESC")   
        
        /*********************************************************************************************/
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaComecaComAlfabetoPrimeiros",      query = "SELECT c FROM Categoria c WHERE c.nome LIKE :nome$  ORDER BY c.nome  ASC")
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaComecaComAlfabetoUltimos",        query = "SELECT c FROM Categoria c WHERE c.nome LIKE :nome$  ORDER BY c.nome DESC")   
        
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaContemAlfabetoPrimeiros",         query = "SELECT c FROM Categoria c WHERE c.nome LIKE :$nome$ ORDER BY c.nome ASC")
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaContemAlfabetoUltimos",           query = "SELECT c FROM Categoria c WHERE c.nome LIKE :$nome$ ORDER BY c.nome DESC") 
        
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaTerminaComAlfabetoPrimeiros",     query = "SELECT c FROM Categoria c WHERE c.nome LIKE :$nome  ORDER BY c.nome ASC")
    ,@NamedQuery(name = "Categoria.findByNomeCategoriaTerminaComAlfabetoUltimos",       query = "SELECT c FROM Categoria c WHERE c.nome LIKE :$nome  ORDER BY c.nome DESC")   

})
public class Categoria  implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_categoria")
    private Integer id;
    @Column(name = "categoria")
    private String nome;

    public Categoria() {
    }

    public PropertyChangeSupport getChangeSupport() {
        return changeSupport;
    }

    public void setChangeSupport(PropertyChangeSupport changeSupport) {
        this.changeSupport = changeSupport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.changeSupport);
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.changeSupport, other.changeSupport)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "changeSupport=" + changeSupport + ", id=" + id + ", nome=" + nome + '}';
    }

}
