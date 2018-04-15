package lgh.springcloud.sleuth.trace2.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {
	@RequestMapping(value = "/trace-2", method = RequestMethod.GET)
	public String trace(HttpServletRequest request) {

		Enumeration<String> names = request.getHeaderNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			log.info("{}: {}", name, request.getHeader(name));
		}

		log.info("=== call trace-2 ===");
		return "Trace";
	}

}
