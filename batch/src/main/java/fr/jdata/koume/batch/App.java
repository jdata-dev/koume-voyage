package fr.jdata.koume.batch;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class App {

	public static void main(String[] args) throws IOException {
		
		Reader in = new FileReader("C:\\Users\\Samantha\\Desktop\\Plan_koume.csv");
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
			String prix = record.get("prix");
			String capacite = record.get("capacite_bus");
			String arretInterm = record.get("arret_interm");

			Trajet t1 = new Trajet(Integer.valueOf(numTrajet), Integer.valueOf(numBus), origine, destination,
					LocalDateTime.of(convertDate(dateDepart), convertTime(heureDepart)),
					LocalDateTime.of(convertDate(dateArrivee), convertTime(heureArrivee)), Double.valueOf(prix),
					Integer.valueOf(capacite), arretInterm);

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

}
