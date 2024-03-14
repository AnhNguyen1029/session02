package ra.service;

import java.util.List;

public interface IGenericService <T,E>{
    List<T> getAll();
    public void save(T t);
    T findById(E e);
    public void delete(E e);
}
