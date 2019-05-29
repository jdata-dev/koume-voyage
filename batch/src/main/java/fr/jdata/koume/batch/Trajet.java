package fr.jdata.koume.batch;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "PlanTransport")

public class Trajet {
	
	@Indexed(unique = true)
    @Field(value = "numTrajet")
	private int numTrajet;
	
	
	@Field(value = "numBus")
	private int numBus;
	
	@Field(value = "origine")
	private String origine;
	
	@Field(value = "destination")
	private String destination;
	
	@Field(value = "departureDateTime")
	private LocalDateTime departureDateTime;
	
	@Field(value = "arrivalDateTime")
	private LocalDateTime arrivalDateTime;
	
	@Field(value = "capacite")
	private int capacite;
	

	public Trajet(int numTrajet, int numBus, String origine, String destination, LocalDateTime departureDateTime,
			LocalDateTime arrivalDateTime, int capacite) {
		super();
		this.numTrajet = numTrajet;
		this.numBus = numBus;
		this.origine = origine;
		this.destination = destination;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.capacite = capacite;
	}

	public int getNumTrajet() {
		return numTrajet;
	}

	public void setNumTrajet(int numTrajet) {
		this.numTrajet = numTrajet;
	}

	public int getNumBus() {
		return numBus;
	}

	public void setNumBus(int numBus) {
		this.numBus = numBus;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	

	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	@Override
	public String toString() {
		return "Trajet [numTrajet=" + numTrajet + ", numBus=" + numBus + ", origine=" + origine + ", destination="
				+ destination + ", departureDateTime=" + departureDateTime + ", arrivalDateTime=" + arrivalDateTime
				+ ", capacite=" + capacite+ "]";
	}
	

	


	
	

}
