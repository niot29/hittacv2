package se.noidea.hittacv.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.noidea.hittacv.entity.RolesEntity;
import se.noidea.hittacv.services.RolesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/role")
public class RolesController {
    private static final Logger logger = LogManager.getLogger(RolesController.class);

    private final RolesService rolesService;

    public RolesController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @GetMapping
    public ResponseEntity<List<RolesEntity>> listAllRoles(){
        logger.info("Controller - listAllRoles:");
        return new ResponseEntity<>(rolesService.listAllRoles(), HttpStatus.OK);
    }
    @GetMapping("/{role}")
    public ResponseEntity<RolesEntity> getRoleById(@PathVariable String role){
        logger.info("Controller - getRoleByName:");
        long id = Long.parseLong(role);
        return new ResponseEntity<>(rolesService.getRoleById(id), HttpStatus.OK);
    }

    @PostMapping("/store")
    public ResponseEntity<RolesEntity> createNewRole(@RequestBody RolesEntity role){
        logger.info("Controller - createNewRole: " + role);
        return new ResponseEntity<>(rolesService.createRole(role), HttpStatus.OK);
    }

    @DeleteMapping("/{role}/delete")
    public ResponseEntity<String> deleteRole(@PathVariable String role){
        logger.info("Controller - deleteRole: " + role);
        long id = Long.parseLong(role);
        return new ResponseEntity<>(rolesService.deleteRole(id), HttpStatus.OK);
    }

    @PutMapping("/{role}/update")
    public ResponseEntity<RolesEntity> updateRole(@PathVariable String role, @RequestBody  RolesEntity rolesEntity){
        logger.info("Controller - updateRole: " + role);
        long id = Long.parseLong(role);
        return new ResponseEntity<>(rolesService.updateRole(id,rolesEntity), HttpStatus.OK);
    }
}
