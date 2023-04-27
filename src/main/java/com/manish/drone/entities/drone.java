package com.manish.drone.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="drone")
public class drone {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Enumerated(EnumType.ORDINAL)
	@Column(name="Model",length=100)
    private Model model;
	@Column(name="SERIAL_NUMBER",length=100)
	private String SerialNumber;
	@Column(name="weight_limit")
	@Size(max=500)
	private int weightLimit;
	@Column(name="Battery_Capacity")
	private int batteryCapacity;
	@Column(name="State")
	private State state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public int getWeightLimit() {
		return weightLimit;
	}
	public void setWeightLimit(int weightLimit) {
		this.weightLimit = weightLimit;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return "drone [model=" + model + ", SerialNumber=" + SerialNumber + ", weightLimit=" + weightLimit
				+ ", batteryCapacity=" + batteryCapacity + ", state=" + state + "]";
	}


	public enum State {
		IDLE, LOADING, LOADED, DELIVERING, DELIVERED, RETURNING;
		
	}
	public enum Model {
		Lightweight, Middleweight, Cruiserweight, Heavyweight;
	}
	
}
