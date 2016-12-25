package processOfChange.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import processOfChange.model.processComponents.SubconsciousTruth;

/**
 * @author Grant Mills
 * @since 12/24/16
 */

public interface SubconsciousTruthRepository extends MongoRepository<SubconsciousTruth, Long> {

}
