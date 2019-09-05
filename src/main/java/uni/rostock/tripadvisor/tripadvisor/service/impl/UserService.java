package uni.rostock.tripadvisor.tripadvisor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uni.rostock.tripadvisor.tripadvisor.domain.User;
import uni.rostock.tripadvisor.tripadvisor.repository.UserRepository;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

import java.util.List;

@Service
@Transactional
public class UserService implements CRUDService<User> {

    private final UserRepository ur;

    @Autowired
    public UserService(UserRepository ur) {
        this.ur = ur;
    }

    @Override
    public void save(User user) {
        ur.save(user);
    }

    @Override
    public void deleteById(int id) {
        ur.deleteById(id);
    }

    @Override
    public void update(User user) {
        save(user);
    }

    @Override
    public List<User> getAll() {
        return ur.findAll();
    }
}
