package com.example.projet_cafeteria.Controllers;

import com.example.projet_cafeteria.models.User;
import com.example.projet_cafeteria.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    //@RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<Collection<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        if (users.isEmpty()) {
            return new ResponseEntity("users not found", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("/{prenom}")
    public ResponseEntity<User> getUserByPrenom(@PathVariable String prenom){
        User user = userService.getUserByPrenom(prenom);
        if (user == null) {
            return new ResponseEntity("User not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/{prenom}")
    public ResponseEntity<User> getUpdateUser(@PathVariable String prenom, @RequestBody User user){
        User userToUpdate = userService.getUserByPrenom(prenom);
        if (userToUpdate != null) {
            User updatedUser = userService.updateUser(user, userToUpdate.getPrenom());
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity("User not found or is not updatable", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("deleteUser/{prenom}")
    public ResponseEntity getDeleteUser(@PathVariable String prenom){
        User userToDelete = userService.getUserByPrenom(prenom);
        if (userToDelete != null){
            userService.deleteUserByPrenom(userToDelete.getPrenom());
            return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("There is an error when trying to delete a user", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/message")
    public String home(Model model) {
        Collection<User> users = userService.getAllUsers();
        model.addAttribute("ListUsers", users);
        return "home";
    }


}
