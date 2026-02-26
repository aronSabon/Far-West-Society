package com.nubi.fws.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.fws.model.FrontSlider;
import com.nubi.fws.repo.FrontSliderRepo;
import com.nubi.fws.service.FrontSliderService;

@Service
public class FrontSliderServiceImpl implements FrontSliderService {
	@Autowired
	FrontSliderRepo frontSliderRepository;

	@Override
	public void addFrontSlider(FrontSlider frontSlider) {
		// TODO Auto-generated method stub
		frontSliderRepository.save(frontSlider);
	}

	@Override
	public List<FrontSlider> getAllFrontSlider() {
		// TODO Auto-generated method stub
		return frontSliderRepository.findAll();
	}

	@Override
	public void deleteFrontSliderById(int frontSliderId) {
		// TODO Auto-generated method stub
		frontSliderRepository.deleteById(frontSliderId);
	}

	@Override
	public FrontSlider getFrontSliderById(int frontSliderId) {
		// TODO Auto-generated method stub
		return frontSliderRepository.findById(frontSliderId).get();
	}

	@Override
	public void updateFrontSlider(FrontSlider frontSlider) {
		// TODO Auto-generated method stub
		frontSliderRepository.save(frontSlider);
	}

	@Override
	public List<FrontSlider> getTop5ByDateDesc() {
		// TODO Auto-generated method stub
		return frontSliderRepository.findTop5ByOrderByDateDesc();
	}

	@Override
	public List<FrontSlider> getTop10ByOrderByDateAsc() {
		// TODO Auto-generated method stub
		return frontSliderRepository.findTop10ByOrderByDateAsc();
	}
}

