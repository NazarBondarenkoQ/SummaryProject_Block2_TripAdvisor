package uni.rostock.tripadvisor.tripadvisor.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import uni.rostock.tripadvisor.tripadvisor.domain.Trip;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

import java.util.List;

@RestController
@RequestMapping("trip")
public class TripController {

    private final CRUDService<Trip> tripService;

    public TripController(@Qualifier("tripService") CRUDService<Trip> tripService) {
        this.tripService = tripService;
    }

    @PostMapping("/save")
    public void save(@RequestBody Trip trip) {
        tripService.save(trip);
    }

    @PutMapping("/update")
    public void update(@RequestBody Trip trip) {
        tripService.update(trip);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        tripService.deleteById(id);
    }

    @GetMapping("/get/all")
    public List<Trip> getAll() {
        return tripService.getAll();
    }
}
