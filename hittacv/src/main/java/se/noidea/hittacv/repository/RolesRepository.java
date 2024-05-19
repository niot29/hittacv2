package se.noidea.hittacv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.noidea.hittacv.entity.RolesEntity;

import java.util.List;

public interface RolesRepository extends JpaRepository<RolesEntity, Long> {

    List<RolesEntity> findAll();
    RolesEntity findAllById(long id);
    RolesEntity findAllByName(String name);
}
