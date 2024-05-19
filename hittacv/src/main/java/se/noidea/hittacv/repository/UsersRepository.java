package se.noidea.hittacv.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import se.noidea.hittacv.entity.UsersEntity;

import java.util.List;

public interface UsersRepository extends JpaRepository<UsersEntity,Long> {

     List<UsersEntity> findAll();

     List<UsersEntity> findAllByName(String name);

    List<UsersEntity> findByEmail(String email);

    UsersEntity findAllById(long id);

    long deleteAllById(long id);
}
