package edu.nsbm.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine")

public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idno;
	
	@Column(name = "medicine_name", nullable = false)
	private String medicineName;
	
	@Column(name = "medicine_description")
	private String medicineDescription;
	
	@Column(name = "amount")
	private Long amount;
	
	public Medicine() {
		
	}
	
	
	public Medicine(String medicineName, String medicineDescription, Long amount) {
		super();
		this.medicineName = medicineName;
		this.medicineDescription = medicineDescription;
		this.amount = amount;
	}
	
	public Long getIdNo() {
		return idno;
	}
	public void setIdNo(Long idno) {
		this.idno = idno;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getMedicineDescription() {
		return medicineDescription;
	}
	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	

}
