package processOfChange.model.processComponents;

import groovy.transform.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Grant Mills
 * @since 12/24/16
 */
@Document(collection = "subconsciousManifestation")
@EqualsAndHashCode
public class SubconsciousManifestation {
	private String value;

	public SubconsciousManifestation(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
