package com.max.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.entities.lead;

public interface LeadRepositories extends JpaRepository<lead, Long> {

}
