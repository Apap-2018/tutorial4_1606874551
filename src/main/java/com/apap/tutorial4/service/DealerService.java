package com.apap.tutorial4.service;

import java.util.Optional;

import com.apap.tutorial4.model.DealerModel;
import com.apap.tutorial4.repository.DealerDb;

/**
 * 
 * DealerService
 *
 */
public interface DealerService {
	Optional<DealerModel> getDealerDetailById(Long id);
	
	void addDealer(DealerModel dealer);
	void deleteDealer(long dealerId);

	DealerDb viewAllDealer();

}
