package com.nubi.fws.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nubi.fws.model.FrontSlider;



public interface FrontSliderRepo extends JpaRepository<FrontSlider, Integer> {
	List<FrontSlider> findTop5ByOrderByDateDesc();
	List<FrontSlider> findTop10ByOrderByDateAsc();

}
