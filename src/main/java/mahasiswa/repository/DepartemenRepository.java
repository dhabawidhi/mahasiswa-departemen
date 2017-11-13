package mahasiswa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mahasiswa.model.Departemen;

public interface DepartemenRepository extends JpaRepository<Departemen, Integer> {

}
