package com.manish.drone.entities;

import javax.validation.constraints.Size;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class medicine {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="medicine_id")
	private int medicineId;
	@Column(name="medication_name",length=100)
    private String medicationName;
	@Column(name="weight",length=100)
	private String weight;
	@Column(name="code")
	@Size(max=500)
	private int code;
	@Column(name="case_image")
	private int caseImage;
	@Column(name="drone_id")
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="drone_id", referencedColumnName = "id")
	private drone drone;
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicationName() {
		return medicationName;
	}
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCaseImage() {
		return caseImage;
	}
	public void setCaseImage(int caseImage) {
		this.caseImage = caseImage;
	}
	public drone getDrone() {
		return drone;
	}
	public void setDrone(drone drone) {
		this.drone = drone;
	}
	public medicine(String medicationName, String weight, int code, int caseImage,
			com.manish.drone.entities.drone drone) {
		super();
		this.medicationName = medicationName;
		this.weight = weight;
		this.code = code;
		this.caseImage = caseImage;
		this.drone = drone;
	}
	@Override
	public String toString() {
		return "medicine [medicineId=" + medicineId + ", medicationName=" + medicationName + ", weight=" + weight
				+ ", code=" + code + ", caseImage=" + caseImage + ", drone=" + drone + "]";
	}
	
	
	
	
}
