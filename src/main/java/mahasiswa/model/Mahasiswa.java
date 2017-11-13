package mahasiswa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nama;
	
	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@ManyToOne
	@JoinColumn(name = "departemen_id")
	private Departemen departemen;
	
	public Mahasiswa(){}
	
	public Mahasiswa(String name){
		this.nama = nama;
	}
	
	public Mahasiswa(String nama, Departemen departemen){
		this.nama = nama;
		this.departemen = departemen;
	}
	
	public Mahasiswa(int id, String nama, Departemen departemen){
		this.id=id;
		this.nama = nama;
		this.departemen = departemen;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setName(String nama){
		this.nama = nama;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public void setDepartemen(Departemen departemen){
		this.departemen = departemen;
	}
	
	public Departemen getDepartemen(){
		return this.departemen;
	}
	/*
	public String toString(){
		String info = String.format("Mahasiswa: name = %s has a husband with name = %s", this.name, this.husband.getName());
		return info;
	}
	*/

	
	public String toString() {
		return "Mahasiswa [id=" + id + ", name=" + nama + ", departemen=" + this.departemen.getDepartemen_nama()+ "]";
	}
}
