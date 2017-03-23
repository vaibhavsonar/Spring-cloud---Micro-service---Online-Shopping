/**
 * 
 */
package com.opus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Vaibhav.Sonar
 *
 */
@RestController
public class BasicController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/myshop/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getGreetingMessage() {
		ResponseEntity<String> response = null;

/*		response = this.restTemplate.exchange("http://onlineShopClient/myshop", HttpMethod.GET, null,
				String.class, "");*/

		return new ResponseEntity<String>("Hello from REST service", HttpStatus.OK);
	}
}
