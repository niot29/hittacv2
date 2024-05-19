package se.noidea.hittacv.services;

import jakarta.transaction.Transactional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.noidea.hittacv.entity.RolesEntity;
import se.noidea.hittacv.repository.RolesRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class RolesService {
    private static final Logger logger = LogManager.getLogger(RolesService.class);

    private final RolesRepository rolesRepository;
    @Autowired
    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public RolesEntity getRoleById(long id){
        logger.info("Service - getRoleById");
        RolesEntity rolesEntity = new RolesEntity();
        try {
            rolesEntity = rolesRepository.findAllById(id);
        }catch (Exception e){
            logger.error(e);
        }
        return rolesEntity;
    }

    public List<RolesEntity> listAllRoles(){
        logger.info("Service - listAllRoles");
        return rolesRepository.findAll();
    }

    public RolesEntity getRoleByName(String name){
        logger.info("Service - getRoleByName");
        return rolesRepository.findAllByName(name);
    }

    @Transactional
    public RolesEntity createRole(RolesEntity role){
        logger.info("Service - createRole");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        role.setCreatedAt(timestamp);
        role.setUpdatedAt(timestamp);
        return rolesRepository.save(role);
    }

    @Transactional
    public String deleteRole(long id){
        logger.info("Service - deleteRole");
        rolesRepository.delete(getRoleById(id));
        return  "\"message\": \"Role deleted\"\n";
    }

    @Transactional
    public RolesEntity updateRole(long id, RolesEntity newRoles){
        logger.info("Service - updateRole");
        RolesEntity rolesEntity = getRoleById(id);
        if(id != newRoles.getId()){
            RolesEntity emptyRole = new RolesEntity();
            return emptyRole;
        }
        try {
            rolesEntity.setGuardName(newRoles.getGuardName());
            rolesEntity.setName(newRoles.getName());
            rolesRepository.save(rolesEntity);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rolesEntity;
    }
}
