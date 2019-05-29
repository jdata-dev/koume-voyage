package fr.jdata.koume.batch;

import java.time.LocalDateTime;
import java.util.Date;
 
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
 
@Document(collection = "PlanTransport")
public class PlanTransport {
 
    @Id
    private Long id;
 
    @Indexed(unique = true)
    @Field(value = "numTrajet")
    private String numTrajet;
 
    @Field(value = "numBus")
    private String numBus;
 
    @Field(value = "origine")
    private String origine;
    
    @Field(value = "destination")
    private String destination;
    
    @Field(value = "departureDateTime")
    private LocalDateTime departureDateTime;
    
    @Field(value = "arrivalDateTime")
    private LocalDateTime arrivalDateTime;
    
    @Field(value = "capacite")
    private String capacite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumTrajet() {
		return numTrajet;
	}

	public void setNumTrajet(String numTrajet) {
		this.numTrajet = numTrajet;
	}

	public String getNumBus() {
		return numBus;
	}

	public void setNumBus(String numBus) {
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

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}

	@Override
	public String toString() {
		return "PlanTransport [id=" + id + ", numTrajet=" + numTrajet + ", numBus=" + numBus + ", origine=" + origine
				+ ", destination=" + destination + ", departureDateTime=" + departureDateTime + ", arrivalDateTime="
				+ arrivalDateTime + ", capacite=" + capacite + "]";
	}
 
   
	
}