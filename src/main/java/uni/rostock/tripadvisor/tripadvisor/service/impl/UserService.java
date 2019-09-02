package uni.rostock.tripadvisor.tripadvisor.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uni.rostock.tripadvisor.tripadvisor.domain.User;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

import java.util.List;

@Service
@Transactional
public class UserService implements CRUDService<User> {
    @Override
    public void save(User entity) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
