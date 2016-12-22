package processOfChange.assembler.processSteps;

import org.springframework.stereotype.Component;
import processOfChange.model.processSteps.LossOfControl;
import processOfChange.util.Constants.DespairingQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class LossOfControlAssembler {

	public LossOfControl createLossOfControl(){
		List<String> defeats = new ArrayList<>();
		defeats.add("cheated on");

		return new LossOfControl("yo mama", "bad gas", defeats, DespairingQuestion.random());
	}
}
