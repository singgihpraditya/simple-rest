package id.co.ogya.simplerest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import id.co.ogya.simplerest.request.RecordUserRequest;
import id.co.ogya.simplerest.response.InquiryRoleResponse;
import id.co.ogya.simplerest.response.RecordUserResponse;

@Controller
public class UserRoleController {
	@PostMapping("/user-role/record")
	public ResponseEntity<Object> recordUser(@RequestBody RecordUserRequest request) {
		RecordUserResponse recordUserResponse = new RecordUserResponse();
		String noTelpon = request.getTelpon();
		
		if(Integer.parseInt(noTelpon.substring(noTelpon.length()-1, noTelpon.length())) % 2 == 0) {
			recordUserResponse.setProgramName("program1");
		}
		else {
			recordUserResponse.setProgramName("program2");
		}
		recordUserResponse.setSuccess(true);
		
		return new ResponseEntity(recordUserResponse, HttpStatus.OK);
	}
	
	@GetMapping("/user-role/inquiry/{name}")
	public ResponseEntity<Object> inquiryRole(@PathVariable(name = "name") String name) {
		InquiryRoleResponse inquiryRoleResponse = new InquiryRoleResponse();
		inquiryRoleResponse.setProgramName("program1");
		inquiryRoleResponse.setSuccess(true);
		return new ResponseEntity(inquiryRoleResponse, HttpStatus.OK);
	}
}
