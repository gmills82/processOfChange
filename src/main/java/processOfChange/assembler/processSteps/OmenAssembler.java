package processOfChange.assembler.processSteps;

import org.springframework.stereotype.Component;
import processOfChange.model.processSteps.Omen;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class OmenAssembler {

	public Omen createOmen(){
		return new Omen("blah", "blah", "blah");
	}
}
