package com.nubi.fws.controller.frontEnd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nubi.fws.model.FrontSlider;
import com.nubi.fws.service.FrontSliderService;
@Controller
public class FrontSliderController {

	@Autowired
	FrontSliderService frontSliderService;

	@GetMapping("/add-front-slider")
	public String addHomeSlider() {
		return "AddFrontSlider";
	}

	@GetMapping("/front-slider-list")
	private String frontSliderList(Model model) {
		model.addAttribute("frontSliderList", frontSliderService.getAllFrontSlider());
		return "FrontSliderList";
	}

	@GetMapping("/delete-front-slider")
	private String deleteFrontSlider(@RequestParam int frontSliderId) {
		frontSliderService.deleteFrontSliderById(frontSliderId);
		return "redirect:/front-slider-list";
	}

	@GetMapping("/edit-front-slider")
	private String editFrontSlider(Model model, @RequestParam int frontSliderId) {
		model.addAttribute("frontSliderModel", frontSliderService.getFrontSliderById(frontSliderId));
		return "EditFrontSlider";
	}

	@PostMapping("/add-front-slider")
	public String addHomeSlider(@ModelAttribute FrontSlider frontSlider,
			@RequestParam MultipartFile image) {
		try {
			Files.copy(
					image.getInputStream(),
					Path.of("src/main/resources/static/images/frontSlider/" + image.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING
					);
			frontSlider.setDate(LocalDate.now());
			frontSlider.setImageName(image.getOriginalFilename());
			frontSliderService.addFrontSlider(frontSlider);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "AddFrontSlider";
	}

	/* this method is managed entity merge */
	@PostMapping("/update-front-slider")
	public String updateFrontSlider(@ModelAttribute FrontSlider frontSlider,
			@RequestParam(required = false) MultipartFile image) {
		FrontSlider managedFrontSliderEntity= frontSliderService.getFrontSliderById(frontSlider.getFrontSliderId());
		managedFrontSliderEntity.setTitle(frontSlider.getTitle());
		managedFrontSliderEntity.setDescription(frontSlider.getDescription());
		if (image != null && !image.isEmpty()) {
			try {
				Files.copy(
						image.getInputStream(),
						Path.of("src/main/resources/static/images/frontSlider/" + image.getOriginalFilename()),
						StandardCopyOption.REPLACE_EXISTING
						);
				managedFrontSliderEntity.setImageName(image.getOriginalFilename());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		frontSliderService.updateFrontSlider(managedFrontSliderEntity);
		return "redirect:/front-slider-list";
	}
}
