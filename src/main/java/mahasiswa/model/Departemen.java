package mahasiswa.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="departemen")
public class Departemen {
//	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String departemen_nama;
	
//	@OneToOne(mappedBy = "departemen")
//	@JsonBackReference
//	private Mahasiswa mahasiswa;
	
	public Departemen(){}
	
	public Departemen(int id)
	{ this.id=id;}
	
	public Departemen(String departemen_nama){
		this.departemen_nama = departemen_nama;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setDepartemen_nama(String departemen_nama){
		this.departemen_nama = departemen_nama;
	}
	
	public String getDepartemen_nama(){
		return this.departemen_nama;
	}
	
//	public void setMahasiswa(Mahasiswa mahasiswa){
//		this.mahasiswa = mahasiswa;
//	}
//	
//	public Mahasiswa getMahasiswa(){
//		return this.mahasiswa;
//	}

	@Override
	public String toString() {
		return "Departemen [id=" + id + ", departemen_nama=" + departemen_nama + "]";
	}
	
//	public String toString(){
//		String info = String.format("Departemen: departemen_nama = %s has a mahasiswa with departemen_nama = %s", this.departemen_nama, this.mahasiswa.getNama());
//		return info;
//	}
}
