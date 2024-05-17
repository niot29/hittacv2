package se.noidea.hittacv.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import se.noidea.hittacv.entity.JobsEntity;
import se.noidea.hittacv.services.JobService;

import java.util.List;

@Controller
@RequestMapping("/api/v1/jobs")
public class JobsController {
    private static final Logger logger = LogManager.getLogger(JobsController.class);

    private JobService jobService;

    @Autowired
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<JobsEntity>> listAllJobs() {
        logger.info("Controller - listAllJobs() : List all jobs");
        return new ResponseEntity<>(jobService.listAllJobs(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getJobById(@PathVariable long id){
        logger.info("Controller - getJobById(id) : get jobs id");
        return new ResponseEntity<>(jobService.getJobByIde(id), HttpStatus.OK);
    }
}
