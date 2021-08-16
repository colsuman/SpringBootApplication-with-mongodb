package com.spring.restApi.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restApi.Dao.AppDao;
import com.spring.restApi.model.AppModel;


@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	AppDao employeeDAO;
	
	@PostMapping("/create")
	public AppModel create(@RequestBody AppModel api )
	{
		return employeeDAO.save(api);
	}
	
	@GetMapping("/create/{id}")
	public Optional<AppModel> getDetail(@PathVariable Long id) {
		return employeeDAO.findById(id);
		
	}

}