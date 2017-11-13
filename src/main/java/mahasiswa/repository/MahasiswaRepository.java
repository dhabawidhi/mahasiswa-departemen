package mahasiswa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mahasiswa.model.Mahasiswa;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Integer> {

}
