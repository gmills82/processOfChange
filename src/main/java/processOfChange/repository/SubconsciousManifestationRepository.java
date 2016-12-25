package processOfChange.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import processOfChange.model.processComponents.SubconsciousManifestation;

/**
 * @author Grant Mills
 * @since 12/24/16
 */
public interface SubconsciousManifestationRepository extends MongoRepository<SubconsciousManifestation, Long> {
}
