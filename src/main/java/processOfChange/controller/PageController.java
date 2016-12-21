package processOfChange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("myIQ", 55);
		return "index";
	}

}
