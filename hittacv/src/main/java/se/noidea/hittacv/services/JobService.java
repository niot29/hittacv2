package se.noidea.hittacv.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.noidea.hittacv.entity.JobsEntity;
import se.noidea.hittacv.repository.JobRepository;

import java.util.List;

@Service
public class JobService {
    private static final Logger logger = LogManager.getLogger(JobService.class);

   private final JobRepository jobRepository;

   @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<JobsEntity> listAllJobs(){
        logger.info("listAllJbas() - List All jobs");

        return jobRepository.findAll();
    }

    public JobsEntity getJobByIde(long id){
        logger.info("getJobByIde(ID) - Get Job vby id");
        return jobRepository.findById(id);
    }
}
