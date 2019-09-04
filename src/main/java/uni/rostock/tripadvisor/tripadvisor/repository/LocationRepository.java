package uni.rostock.tripadvisor.tripadvisor.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import uni.rostock.tripadvisor.tripadvisor.domain.Location;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    @Override
    @EntityGraph(attributePaths = {"comments"})
    List<Location> findAll();
}
