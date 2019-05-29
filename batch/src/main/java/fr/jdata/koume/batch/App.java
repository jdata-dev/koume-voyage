package fr.jdata.koume.batch;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class App implements CommandLineRunner {

	@Autowired
	private TravelRepository repository;

	public static void main(String[] args) throws IOException {
		// Validation de l'entrée
		if (args.length == 0) {
			System.out.println("Aucun fichier renseigné");
			return;
		}

		// Lecture du fichier
		Reader in = new FileReader(args[0]);
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);

		for (CSVRecord record : records) {
			String numTrajet = record.get("num_trajet");
			String numBus = record.get("num_bus");
			String origine = record.get("origine");
			String destination = record.get("destination");
			String heureDepart = record.get("heure_depart");
			String heureArrivee = record.get("heure_arrivee");
			String dateDepart = record.get("date_depart");
			String dateArrivee = record.get("date_arrivee");
			String capacite = record.get("capacite_bus");

			Trajet t1 = new Trajet(Integer.valueOf(numTrajet), Integer.valueOf(numBus), origine, destination,
					LocalDateTime.of(convertDate(dateDepart), convertTime(heureDepart)),
					LocalDateTime.of(convertDate(dateArrivee), convertTime(heureArrivee)),
					Integer.valueOf(capacite));

			System.out.println(t1.toString());
		}
		
	}

	private static LocalDate convertDate(String date) {
		LocalDate dt = LocalDate.parse(date);
		return dt;
	}

	private static LocalTime convertTime(String time) {
		LocalTime tm = LocalTime.parse(time);
		return tm;
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		// save a travel
		repository.save(new Trajet(0, 0, null, null, null, null, 0));

		// fetch all customers
		System.out.println("travel found with findAll():");
		System.out.println("-------------------------------");
		for (Trajet trajet : repository.findAll()) {
			System.out.println(trajet);
		}
	}

}
