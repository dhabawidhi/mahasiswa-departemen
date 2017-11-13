package mahasiswa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mahasiswa.service.DepartemenService;

@RestController
public class DepartemenController {

	@Autowired
	private DepartemenService departemenService;
	
	@GetMapping("/departemen/hello")
	public String hello()
	{
		return "Hello Departemen";
	}
	
	@GetMapping("/departemen/all-tasks")
	public List allTask()
	{
		return departemenService.findAll();
	}
}
