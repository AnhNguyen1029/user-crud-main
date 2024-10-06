package com.example.usercrud.user;

import com.example.usercrud.user.userDto.CreateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<User> create(@RequestBody CreateDto data){
        User newUser = new User();
        newUser.setName(data.getName());
        newUser.setEmail(data.getEmail());
        return new ResponseEntity<>(userService.save(newUser), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id")Integer userId){
        userService.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
