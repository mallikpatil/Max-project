package com.max.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.repositories.LeadRepositories;
import com.max.entities.*;
import com.max.services.*;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepositories leadRepo;
	
	public void saveLeadInfo(lead lead) throws RuntimeException{
			leadRepo.save(lead);
	}

	public lead findLeadById1(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveLeadInfo(LeadService lead) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LeadService findLeadById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}