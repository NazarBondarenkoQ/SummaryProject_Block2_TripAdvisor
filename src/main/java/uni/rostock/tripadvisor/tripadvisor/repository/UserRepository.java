package uni.rostock.tripadvisor.tripadvisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.rostock.tripadvisor.tripadvisor.domain.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
