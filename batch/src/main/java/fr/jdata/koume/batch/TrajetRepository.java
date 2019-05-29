package fr.jdata.koume.batch;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrajetRepository extends MongoRepository<Trajet, String> {

	    public Trajet findByFirstName(String firstName);
	    public List<Trajet> findByLastName(String lastName);

}



