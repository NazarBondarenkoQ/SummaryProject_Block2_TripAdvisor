package uni.rostock.tripadvisor.tripadvisor.controller;

import org.springframework.web.bind.annotation.*;
import uni.rostock.tripadvisor.tripadvisor.domain.Location;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

import java.util.List;

@RestController
@RequestMapping("location")
public class LocationController {
    private final CRUDService<Location> locationService;

    public LocationController(CRUDService<Location> locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/save")
    public void save(@RequestBody Location location) {
        locationService.save(location);
    }

    @PutMapping("/update")
    public void update(@RequestBody Location location) {
        locationService.update(location);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        locationService.deleteById(id);
    }

    @GetMapping("/get/all")
    public List<Location> getAll() {
        return locationService.getAll();
    }
}
