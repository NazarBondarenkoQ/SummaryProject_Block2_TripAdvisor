package uni.rostock.tripadvisor.tripadvisor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uni.rostock.tripadvisor.tripadvisor.domain.Trip;
import uni.rostock.tripadvisor.tripadvisor.repository.TripRepository;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

import java.util.List;

@Service
@Transactional
public class TripService implements CRUDService<Trip> {

    private final TripRepository tr;

    @Autowired
    public TripService(TripRepository tr) {
        this.tr = tr;
    }

    @Override
    public void save(Trip trip) {
        tr.save(trip);
    }

    @Override
    public void deleteById(int id) {
        tr.deleteById(id);
    }

    @Override
    public void update(Trip trip) {
        save(trip);
    }

    @Override
    public List<Trip> getAll() {
        return tr.findAll();
    }
}
