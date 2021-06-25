package repositorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe de exemplo para cria��o de reposit�rio abstrato com CRUD.
 * Implementa��o feita com ArrayList.
 * 
 * @author Leandro M. Nascimento
 *
 * @param <T>
 */
public abstract class RepositorioGenerico<T> {
    
    protected List<T> elements;
    
    public RepositorioGenerico() {
        this.elements = new ArrayList<T>();
    }
    
    public void create(T newObj) {
        if (!this.elements.contains(newObj)) {
            this.elements.add(newObj);
        }
    }
    
    public List<T> recover() {
        return Collections.unmodifiableList(this.elements);
    }
    
    public void update(T newElementWithID) {
        int index = this.elements.indexOf(newElementWithID);
        if (index >= 0) {
            this.elements.set(index, newElementWithID);
        }
    }
    
    public void delete(T newElementWithID) {
        int index = this.elements.indexOf(newElementWithID);
        if (index >= 0) {
            this.elements.remove(index);
        }
    }

}