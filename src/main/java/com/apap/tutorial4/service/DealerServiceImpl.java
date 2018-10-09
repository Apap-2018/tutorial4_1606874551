package com.apap.tutorial4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial4.model.DealerModel;
import com.apap.tutorial4.repository.DealerDb;

/**
 * 
 * DealerServiceImpl
 *
 */
@Service
@Transactional
public class DealerServiceImpl implements DealerService {
	@Autowired
	private DealerDb dealerDb;
	
	@Override
	public Optional<DealerModel> getDealerDetailById(Long id) {
		return dealerDb.findById(id);
	}
	
	@Override
	public void addDealer(DealerModel dealer) {
		dealerDb.save(dealer);
	}
	
	@Override
	public void deleteDealer(long dealerId) {
		dealerDb.deleteById(dealerId);
	}

	@Override
	public DealerDb viewAllDealer() {
		// TODO Auto-generated method stub
		return dealerDb;
	}
	
	@Override
	public void dealerUpdate(DealerModel updateDealer, Long dealerId) {
		DealerModel dataLama = dealerDb.findById(dealerId).get();
		dataLama.setAlamat(updateDealer.getAlamat());
		dataLama.setNoTelp(updateDealer.getNoTelp());
		dealerDb.save(dataLama);
	}
}
