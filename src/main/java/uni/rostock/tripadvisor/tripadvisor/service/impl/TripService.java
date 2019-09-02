package uni.rostock.tripadvisor.tripadvisor.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uni.rostock.tripadvisor.tripadvisor.domain.Trip;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

import java.util.List;

@Service
@Transactional
public class TripService implements CRUDService<Trip>  {
    @Override
    public void save(Trip trip) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(Trip trip) {

    }

    @Override
    public List<Trip> getAll() {
        return null;
    }
}
