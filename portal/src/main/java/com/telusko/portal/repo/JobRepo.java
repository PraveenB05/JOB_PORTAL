package com.telusko.portal.repo;

import com.telusko.portal.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
    // getAllJobs() → findAll()
    // addJob()    → save()
    // All provided automatically by JpaRepository
}