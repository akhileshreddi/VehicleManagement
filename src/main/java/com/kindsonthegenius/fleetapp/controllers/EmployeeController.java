package com.kindsonthegenius.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetapp.models.Employee;

import com.kindsonthegenius.fleetapp.services.CountryService;
import com.kindsonthegenius.fleetapp.services.EmployeeService;
import com.kindsonthegenius.fleetapp.services.EmployeeTypeService;
import com.kindsonthegenius.fleetapp.services.JobTitleService;
import com.kindsonthegenius.fleetapp.services.LocationService;
import com.kindsonthegenius.fleetapp.services.StateService;

@Controller
public class EmployeeController {
	

	@Autowired	private EmployeeService employeeService;
	@Autowired	private LocationService locationService;
	@Autowired	private JobTitleService jobTitleService;
	@Autowired	private EmployeeTypeService employeeTypeService;
	@Autowired	private CountryService countryService;
	@Autowired	private StateService stateService;
	
	
	
	


	@GetMapping("/employees")
	public String getEmployees(Model model) {	
		
		model.addAttribute("employees", employeeService.getEmployees());			
		model.addAttribute("locations", locationService.getLocations());		
	   
	    model.addAttribute("states", stateService.getStates());
	    model.addAttribute("countries", countryService.getCountries());
	    model.addAttribute("jobTitles", jobTitleService.getJobTitles());
				
		model.addAttribute("employeeTypes", employeeTypeService.getEmployeeTypes());
				
		return "Employee";
	}	
	
	@PostMapping("/employees/addNew")
	public String addNew(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}
	
	@RequestMapping("employees/findById")
	@ResponseBody
	public Optional<Employee> findById(int id) {
	  return employeeService.findById(id);	
	}	
	
	@RequestMapping(value="/employees/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}
	
	@RequestMapping(value="/employees/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		employeeService.delete(id);
		return "redirect:/employees";
	}
}
