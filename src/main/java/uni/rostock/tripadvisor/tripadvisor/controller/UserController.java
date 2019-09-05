package uni.rostock.tripadvisor.tripadvisor.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import uni.rostock.tripadvisor.tripadvisor.domain.User;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final CRUDService<User> userService;

    public UserController(@Qualifier("userService") CRUDService<User> userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        userService.deleteById(id);
    }

    @GetMapping("/get/all")
    public List<User> getAll() {
        return userService.getAll();
    }
}
