package processOfChange.model.processComponents;

import groovy.transform.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Grant Mills
 * @since 12/24/16
 */
@Document(collection = "subconsciousTruth")
@EqualsAndHashCode
public class SubconsciousTruth {
	private String value;

	public SubconsciousTruth(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
