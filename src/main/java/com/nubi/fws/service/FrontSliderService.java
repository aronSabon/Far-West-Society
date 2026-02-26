package com.nubi.fws.service;

import java.util.List;

import com.nubi.fws.model.FrontSlider;


	public interface FrontSliderService {

		void addFrontSlider(FrontSlider frontSlider);
		List<FrontSlider> getAllFrontSlider();
		void deleteFrontSliderById(int frontSliderId);
		FrontSlider getFrontSliderById(int frontSliderId);
		void updateFrontSlider(FrontSlider frontSlider);
		List<FrontSlider> getTop5ByDateDesc();
		List<FrontSlider> getTop10ByOrderByDateAsc();

	}


