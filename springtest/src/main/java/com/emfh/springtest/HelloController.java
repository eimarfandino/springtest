package com.emfh.springtest;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emfh.model.MyTestObject;

@Controller
public class HelloController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	MyTestObject testBean;

	@RequestMapping(value="/hello.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

		String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
        logger.info("\n\nObject Name: " + testBean.getName());
        return new ModelAndView("WEB-INF/views/hello.jsp", "now", now);

	}
}
