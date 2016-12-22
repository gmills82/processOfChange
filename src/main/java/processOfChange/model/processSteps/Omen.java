package processOfChange.model.processSteps;

import groovy.transform.EqualsAndHashCode;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@EqualsAndHashCode
public class Omen {
	private String externalPressure;
	private String subconsciousTruth;
	private String subconsciousManifestation;

	public Omen(String externalPressure, String subconsciousTruth, String subconsciousManifestation) {
		this.externalPressure = externalPressure;
		this.subconsciousTruth = subconsciousTruth;
		this.subconsciousManifestation = subconsciousManifestation;
	}

	public String getSubconsciousTruth() {
		return subconsciousTruth;
	}

	public String getExternalPressure() {
		return externalPressure;
	}

	public String getSubconsciousManifestation() {
		return subconsciousManifestation;
	}
}
