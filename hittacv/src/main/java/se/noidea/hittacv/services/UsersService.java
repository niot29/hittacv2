package se.noidea.hittacv.services;

import jakarta.transaction.Transactional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.noidea.hittacv.entity.UsersEntity;
import se.noidea.hittacv.repository.UsersRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UsersService {
    private static final Logger logger = LogManager.getLogger(UsersService.class);

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<UsersEntity> listAllUsers(){
        logger.info("listAllUsers - List Alla Users");
        return usersRepository.findAll();
    }

    public UsersEntity getUsersEntity(long id){
        logger.info("Service - getUserById: long" );
        UsersEntity usersEntity = new UsersEntity();
        try {
            usersEntity =  usersRepository.findAllById(id);
        }catch (NullPointerException e){
            logger.error("No Entiry return");
        }
        return usersEntity;
    }
    public  List<UsersEntity> getUsersBySearchParam(Map<String,String> searchParam){
        logger.info("Service - getUsersBySearchParam() ");
        List<UsersEntity> usersEntityList = new ArrayList<>();

        for (Map.Entry<String, String> entry : searchParam.entrySet()) {
            System.out.println(entry.getKey());

            switch (entry.getKey()){
                case "name":
                    System.out.println(entry.getValue());
                    usersEntityList = listAllUsersByName(entry.getValue().toString());
                    break;
                case "email":
                    System.out.println(entry.getValue());
                    usersEntityList = getUserByEmail(entry.getValue().toString());
                    break;
                default:
                    usersEntityList = null;
            }
        }
        return usersEntityList;
    }

    public List<UsersEntity> listAllUsersByName(String name){
        logger.info("listAllUsersByName - List Alla By Name: " + name);
        return usersRepository.findAllByName(name);
    }

    public List<UsersEntity> getUserByEmail(String email){
        logger.info("getUserByEmail - List Alla By emal: " + email);
        return usersRepository.findByEmail(email);
    }

    @Transactional
    public long deleteUser(long userId){
        logger.info("Service- deleteUser(): " );
        return usersRepository.deleteAllById(userId);
    }
    @Transactional
    public UsersEntity updateUserInfo(Long userId, UsersEntity newUserInfo){
        logger.info("Service- updateUserInfo(): " );
        UsersEntity usersEntity = getUsersEntity(userId);
        try {
            usersEntity.setName(newUserInfo.getName());
            usersEntity.setEmail(newUserInfo.getEmail());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        usersRepository.save(usersEntity);
        return usersEntity;
    }

}
