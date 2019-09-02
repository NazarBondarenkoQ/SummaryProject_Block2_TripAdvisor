package uni.rostock.tripadvisor.tripadvisor.service;

import java.util.List;

public interface CRUDService<T> {
    void save(T entity);
    void deleteById(int id);
    void update(T entity);
    List<T> getAll();
}
