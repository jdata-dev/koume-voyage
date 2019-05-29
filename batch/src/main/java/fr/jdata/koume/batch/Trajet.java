package fr.jdata.koume.batch;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;


public class Trajet {
	
	
	@Id
	public String id;
	
	private int numTrajet;
	private int numBus;
	private String origine;
	private String destination;
	private LocalDateTime departureDateTime;
	private LocalDateTime arrivalDateTime;
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
		return id+"Trajet [numTrajet=" + numTrajet + ", numBus=" + numBus + ", origine=" + origine + ", destination="
				+ destination + ", departureDateTime=" + departureDateTime + ", arrivalDateTime=" + arrivalDateTime
				+ ", capacite=" + capacite+ "]";
	}
	

	


	
	

}
