package processOfChange.model.processSteps;

import groovy.transform.EqualsAndHashCode;
import processOfChange.model.processComponents.ExternalPressure;
import processOfChange.model.processComponents.SubconsciousManifestation;
import processOfChange.model.processComponents.SubconsciousTruth;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@EqualsAndHashCode
public class Omen {
	private ExternalPressure externalPressure;
	private SubconsciousTruth subconsciousTruth;
	private SubconsciousManifestation subconsciousManifestation;

	public Omen(ExternalPressure externalPressure, SubconsciousTruth subconsciousTruth, SubconsciousManifestation subconsciousManifestation) {
		this.externalPressure = externalPressure;
		this.subconsciousTruth = subconsciousTruth;
		this.subconsciousManifestation = subconsciousManifestation;
	}

	public SubconsciousTruth getSubconsciousTruth() {
		return subconsciousTruth;
	}

	public ExternalPressure getExternalPressure() {
		return externalPressure;
	}

	public SubconsciousManifestation getSubconsciousManifestation() {
		return subconsciousManifestation;
	}
}
