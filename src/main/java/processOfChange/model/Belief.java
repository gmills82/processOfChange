package processOfChange.model;

import groovy.transform.EqualsAndHashCode;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@EqualsAndHashCode
public class Belief {
	protected enum BeliefType {
		VULNERABILITY, POWER
	}
	private String statement;
	private BeliefType type;

	public Belief(String statement, BeliefType type) {
		this.statement = statement;
		this.type = type;
	}

	public String getStatement() {
		return statement;
	}

	public BeliefType getType() {
		return type;
	}
}
