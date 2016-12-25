package processOfChange.assembler.processSteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import processOfChange.model.processComponents.ExternalPressure;
import processOfChange.model.processComponents.SubconsciousManifestation;
import processOfChange.model.processComponents.SubconsciousTruth;
import processOfChange.model.processSteps.Omen;
import processOfChange.repository.ExternalPressureRepository;
import processOfChange.repository.SubconsciousManifestationRepository;
import processOfChange.repository.SubconsciousTruthRepository;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class OmenAssembler {

	private ExternalPressureRepository mExternalPressureRepository;
	private SubconsciousTruthRepository mSubconsciousTruthRepository;
	private SubconsciousManifestationRepository mSubconsciousManifestationRepository;

	@Autowired
	public OmenAssembler(ExternalPressureRepository externalPressureRepository, SubconsciousTruthRepository subconsciousTruthRepository, SubconsciousManifestationRepository subconsciousManifestationRepository) {
		mExternalPressureRepository = externalPressureRepository;
		mSubconsciousTruthRepository = subconsciousTruthRepository;
		mSubconsciousManifestationRepository = subconsciousManifestationRepository;
	}

	public Omen createOmen(){
		ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
		ExternalPressure externalPressure = mExternalPressureRepository.findOne(threadLocalRandom.nextLong(0, mExternalPressureRepository.count() - 1));
		SubconsciousTruth subconsciousTruth = mSubconsciousTruthRepository.findOne(threadLocalRandom.nextLong(0, mSubconsciousTruthRepository.count() - 1));
		SubconsciousManifestation subconsciousManifestation = mSubconsciousManifestationRepository.findOne(threadLocalRandom.nextLong(0, mSubconsciousManifestationRepository.count() - 1));

		return new Omen(externalPressure, subconsciousTruth, subconsciousManifestation);
	}
}
