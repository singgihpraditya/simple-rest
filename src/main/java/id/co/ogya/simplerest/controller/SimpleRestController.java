package id.co.ogya.simplerest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.co.ogya.simplerest.request.SimpleRequest;
import id.co.ogya.simplerest.response.SimpleResponse;

@RestController
public class SimpleRestController {

	@GetMapping("/simple/get")
	public ResponseEntity<Object> simpleGetMethodWithQueryParam(@RequestParam(name = "input") String input) {
		SimpleResponse simpleResponse = new SimpleResponse();
		simpleResponse.setInput(input);
		simpleResponse.setValid(true);
		return new ResponseEntity(simpleResponse, HttpStatus.OK);
	}

	@GetMapping("/simple/get/{input}")
	public ResponseEntity<Object> simpleGetMethodWithPathParam(@PathVariable(name = "input") String input) {
		SimpleResponse simpleResponse = new SimpleResponse();
		simpleResponse.setInput(input);
		simpleResponse.setValid(true);
		return new ResponseEntity(simpleResponse, HttpStatus.OK);
	}
	
	@PostMapping("/simple/post")
	public ResponseEntity<Object> simplePost(@RequestBody SimpleRequest request) {
		SimpleResponse simpleResponse = new SimpleResponse();
		simpleResponse.setInput(request.getInput());
		simpleResponse.setValid(true);
		return new ResponseEntity(simpleResponse, HttpStatus.OK);
	}
}
