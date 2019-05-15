package com.xpense.mvcweb;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xpense.mvcweb.dao.UserDao;
import com.xpense.mvcweb.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	private UserDao userDao;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletResponse response, Locale locale, Model model, HttpServletRequest request) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public String profilePOST(@ModelAttribute User user, Model model, HttpSession session){
		
		if(userDao.validateUser(user)){
			//success
			//start session using HttpSession..
			session.setAttribute("activeUser", user.getUsername());
			session.setMaxInactiveInterval(3*60); // 3 minutes
			return "homeprofile";
		}else{
			//fail
			model.addAttribute("loginError","Either Password or Username is INcorrect!"); //login error returned through Model in JSP
			logger.error("Error");
			return "home";
		}
	}
	
}
