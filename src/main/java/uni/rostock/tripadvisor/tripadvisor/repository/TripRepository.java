package uni.rostock.tripadvisor.tripadvisor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uni.rostock.tripadvisor.tripadvisor.domain.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {
}
