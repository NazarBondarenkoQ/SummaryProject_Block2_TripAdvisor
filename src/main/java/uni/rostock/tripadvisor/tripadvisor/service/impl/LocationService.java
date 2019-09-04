package uni.rostock.tripadvisor.tripadvisor.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uni.rostock.tripadvisor.tripadvisor.domain.Location;
import uni.rostock.tripadvisor.tripadvisor.repository.LocationRepository;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

import java.util.List;

@Service
@Transactional
public class LocationService implements CRUDService<Location> {

    private final LocationRepository lr;

    public LocationService(LocationRepository lr) {
        this.lr = lr;
    }

    @Override
    public void save(Location location) {
        lr.save(location);
    }

    @Override
    public void deleteById(int id) {
        lr.deleteById(id);
    }

    @Override
    public void update(Location location) {
        save(location);
    }

    @Override
    public List<Location> getAll() {
        return lr.findAll();
    }
}
