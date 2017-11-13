package mahasiswa.service;

import java.util.List;

import org.springframework.stereotype.Component;

import mahasiswa.repository.DepartemenRepository;

@Component
public class DepartemenService {
	private DepartemenRepository departemenRepository;
	
	public DepartemenService(DepartemenRepository departemenRepository)
	{
		this.departemenRepository=departemenRepository;
	}
	public List findAll()
	{
		return departemenRepository.findAll();
	}
}
