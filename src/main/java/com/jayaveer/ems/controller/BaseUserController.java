package com.jayaveer.ems.controller;

import com.jayaveer.ems.exception.ResourceNotFoundException;
import com.jayaveer.ems.model.BaseUser;
import com.jayaveer.ems.model.Employee;
import com.jayaveer.ems.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/users")
@CrossOrigin(origins = "http://localhost:3000")
public class BaseUserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<BaseUser> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<BaseUser> getUserById(@PathVariable(value = "id")Long userid) throws ResourceNotFoundException {
        BaseUser user = userRepository.findById(userid)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: "+userid));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public BaseUser createUser(@RequestBody BaseUser baseUser) {
        return userRepository.save(baseUser);
    }

    @DeleteMapping(value = "/{id}")
    public Map<String,Boolean> deleteUser(@PathVariable(value = "id")Long userid) throws ResourceNotFoundException{
        BaseUser user = userRepository.findById(userid)
                .orElseThrow(()-> new ResourceNotFoundException("User not found for this id :: "+userid));
        userRepository.delete(user);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return response;
    }
}
