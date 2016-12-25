package processOfChange.model.processComponents;

import groovy.transform.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Grant Mills
 * @since 12/24/16
 */
@Document(collection = "externalPressure")
@EqualsAndHashCode
public class ExternalPressure {
	private String value;

	public ExternalPressure(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
