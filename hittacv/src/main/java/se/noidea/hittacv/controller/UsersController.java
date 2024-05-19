package se.noidea.hittacv.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.noidea.hittacv.entity.UsersEntity;
import se.noidea.hittacv.services.UsersService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UsersController {
    private static final Logger logger = LogManager.getLogger(UsersController.class);
    private final UsersService usersService;


    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public ResponseEntity<List<UsersEntity>> listAllUsers(){
        logger.info("Controller - listAllUsers:");
        return new ResponseEntity<>(usersService.listAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{user}")
    public ResponseEntity<UsersEntity> getUser(@PathVariable String user){
        logger.info("Controller - getUser:");
        long userId = Long.parseLong(user);
        return new ResponseEntity<>(usersService.getUsersEntity(userId), HttpStatus.OK);
    }

    @DeleteMapping ("/{user}/delete")
    public ResponseEntity<String> deleteUser(@PathVariable  String user){
        logger.info("Controller - deleteUser:");
        long userId = Long.parseLong(user);
        String returnMsg = "OK";
        int statusCode = 200;
        if(usersService.deleteUser(userId) == 0){
            returnMsg = "FAIL";
            statusCode = 400;
        }
        return ResponseEntity.status(HttpStatus.valueOf(statusCode)).body(returnMsg);

    }

    @PutMapping("/{user}/update")
    public ResponseEntity<UsersEntity> updateUser(@PathVariable  String user, @RequestBody  UsersEntity usersEntity){
        logger.info("Controller - updateUser():");
        long userId = Long.parseLong(user);
        return new ResponseEntity<>(usersService.updateUserInfo(userId,usersEntity), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<UsersEntity>> getRequestBySearch(@RequestParam Map<String,String> searchParam){
        logger.info("Controller - getRequestBySearch:");
        return new ResponseEntity<>(usersService.getUsersBySearchParam(searchParam), HttpStatus.OK);
    }
}
