package mahasiswa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mahasiswa.model.Departemen;
import mahasiswa.model.Mahasiswa;
import mahasiswa.service.DepartemenService;
import mahasiswa.service.MahasiswaService;

@Controller
public class MahasiswaController {

	@Autowired
	private MahasiswaService mahasiswaService;
	
	@Autowired
	private DepartemenService departemenService;

	private Departemen departemen2;
	
	@GetMapping("/")
	public String home(HttpServletRequest request)
//	public String home()
	{
//		request.setAttribute("tasks", taskService.findAll());
//		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	@GetMapping("/all-tasks")
	public String allTasks(HttpServletRequest request)
	{
		request.setAttribute("mahasiswas", mahasiswaService.findAll());
//		request.setAttribute("mode", "MODE_TASKS");
		return "all-tasks";
	}
	@GetMapping("/new-mahasiswa")
	public String newTask(HttpServletRequest request)
	{
//		request.setAttribute("mode", "MODE_NEW");
		request.setAttribute("departemens", departemenService.findAll());
		return "mahasiswa";
	}
	@PostMapping("/save-mahasiswa")
	public String newTasks(HttpServletRequest request,@RequestParam String id, @RequestParam String nama, @RequestParam Departemen departemen,@ModelAttribute Mahasiswa mahasiswa,BindingResult bindingResult)
	{
		
//		int departemen2int=Integer.parseInt(departemen);
		departemen2 = null;
//		departemen2.setId(departemen2int);
		if(id=="")
		{
			mahasiswa= new Mahasiswa(nama,departemen);
			mahasiswaService.save(mahasiswa);
		}
		else
		{
			int id2=Integer.parseInt(id);
			mahasiswa= new Mahasiswa(id2,nama,departemen);
			mahasiswaService.save(mahasiswa);
		}
		request.setAttribute("mahasiswas", mahasiswaService.findAll());
		
		
		return "all-tasks";
	}
	@GetMapping("/update-mahasiswa")
	public String updateTasks(@RequestParam int id, HttpServletRequest request)
	{
		request.setAttribute("mahasiswa", mahasiswaService.findTask(id));
		request.setAttribute("departemens", departemenService.findAll());
//		request.setAttribute("mode", "MODE_UPDATE");
		return "mahasiswa";
	}
	@GetMapping("/delete-mahasiswa")
	public String deleteTasks(@RequestParam int id, HttpServletRequest request)
	{
		String a=""+id;
		mahasiswaService.delete(id);
		request.setAttribute("mahasiswas", mahasiswaService.findAll());
		return "all-tasks";
	}
	
	/*
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello Mahasiswa";
	}
	
	@GetMapping("/mahasiswa/all-tasks")
	public List allTask()
	{
		return mahasiswaService.findAll();
	}
	
	@GetMapping("/mahasiswa/save-task")
	public String saveTask(@RequestParam String nama, @RequestParam Departemen departemen)
	{
		Mahasiswa mahasiswa= new Mahasiswa(nama,departemen);
		mahasiswaService.save(mahasiswa);
		return "Task saved";
	}
	@GetMapping("/mahasiswa/delete-task")
	public String deleteTask(@RequestParam int id)
	{
		mahasiswaService.delete(id);
		return "Mahasiswa deleted";
	}
	@GetMapping("/mahasiswa/update-task")
	public String updateTask(@RequestParam int id, @RequestParam String nama, @RequestParam Departemen departemen) 
	{
		Mahasiswa mahasiswa= new Mahasiswa(id,nama,departemen);
		mahasiswaService.save(mahasiswa);
		return "Mahasiswa updated";
	}
	*/
}
