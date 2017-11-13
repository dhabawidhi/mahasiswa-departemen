package mahasiswa.service;

import java.util.List;

import org.springframework.stereotype.Component;

import mahasiswa.model.Mahasiswa;
import mahasiswa.repository.MahasiswaRepository;

@Component
public class MahasiswaService {
	private MahasiswaRepository mahasiswaRepository;
	
	public MahasiswaService(MahasiswaRepository mahasiswaRepository)
	{
		this.mahasiswaRepository=mahasiswaRepository;
	}
	public List findAll()
	{
		return mahasiswaRepository.findAll();
	}
	public void save(Mahasiswa mahasiswa)
	{
		mahasiswaRepository.save(mahasiswa);
	}
	public void delete(int id)
	{
		mahasiswaRepository.delete(id);
	}
	public Mahasiswa findTask(int id){
		return mahasiswaRepository.findOne(id);
	}
}
