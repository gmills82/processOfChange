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

	public Omen(String externalPressure, String subconsciousTruth) {
		this.externalPressure = externalPressure;
		this.subconsciousTruth = subconsciousTruth;
	}

	public String getSubconsciousTruth() {
		return subconsciousTruth;
	}

	public String getExternalPressure() {
		return externalPressure;
	}
}
