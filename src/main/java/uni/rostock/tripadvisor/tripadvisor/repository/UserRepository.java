package uni.rostock.tripadvisor.tripadvisor.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import uni.rostock.tripadvisor.tripadvisor.domain.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Override
    @EntityGraph(attributePaths = {"locations"})
    List<User> findAll();
}
