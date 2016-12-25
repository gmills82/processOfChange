package processOfChange.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import processOfChange.model.processComponents.ExternalPressure;

/**
 * @author Grant Mills
 * @since 12/24/16
 */
public interface ExternalPressureRepository extends MongoRepository<ExternalPressure, Long> {

}
