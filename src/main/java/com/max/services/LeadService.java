package com.max.services;

import com.max.entities.*;

public interface LeadService {

	public void saveLeadInfo(LeadService lead);

	public LeadService findLeadById(long id);

	void saveLeadInfo(lead lead) throws RuntimeException;
}
