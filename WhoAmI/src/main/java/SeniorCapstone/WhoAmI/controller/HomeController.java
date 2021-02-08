//Almicke Navarro 
//CST-323
//January 12, 2020 
//I used the source code from the following website: https://github.com/MickeyNavarro/KaraokeMachine

package SeniorCapstone.WhoAmI.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView displayHomePage(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
