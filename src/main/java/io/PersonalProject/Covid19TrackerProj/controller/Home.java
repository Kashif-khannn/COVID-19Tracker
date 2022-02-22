package io.PersonalProject.Covid19TrackerProj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.PersonalProject.Covid19TrackerProj.models.LocationStats;
import io.PersonalProject.Covid19TrackerProj.service.CovidDataService;

@org.springframework.stereotype.Controller
public class Home {
	
	@Autowired
	CovidDataService covidDataService;
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = covidDataService.getAllStats();
		int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
		int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPastDay()).sum();
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", totalReportedCases);
		model.addAttribute("totalNewCases", totalNewCases);
		
		return "home";
	}
	

}
