package se.noidea.hittacv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.noidea.hittacv.entity.JobsEntity;

import java.util.List;
@Repository
public interface JobRepository extends JpaRepository<JobsEntity, Long> {

    List<JobsEntity>  findAll();

    JobsEntity findById(long id);
}
