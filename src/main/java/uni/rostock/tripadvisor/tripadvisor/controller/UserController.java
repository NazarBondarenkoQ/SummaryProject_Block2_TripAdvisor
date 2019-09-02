package uni.rostock.tripadvisor.tripadvisor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import uni.rostock.tripadvisor.tripadvisor.domain.User;
import uni.rostock.tripadvisor.tripadvisor.service.CRUDService;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private CRUDService<User> userService;

    @PostMapping(value = "/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }
}
