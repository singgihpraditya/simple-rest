package id.co.ogya.simplerest.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import id.co.ogya.simplerest.request.RecordBayarTelkomRequest;
import id.co.ogya.simplerest.response.RecordBayarTelkomResponse;
import id.co.ogya.simplerest.response.ValidateNoTelponResponse;

@Controller
public class TelkomController {
	@PostMapping("/telkom/bayar")
	public ResponseEntity<Object> bayar(@RequestBody RecordBayarTelkomRequest request) {
		RecordBayarTelkomResponse bayarTelkomResponse = new RecordBayarTelkomResponse();
		bayarTelkomResponse.setBulan(request.getBulan());
		bayarTelkomResponse.setNoRekening(request.getNoRekening());
		bayarTelkomResponse.setNoTelepon(request.getNoTelepon());
		bayarTelkomResponse.setReferenceNumber(UUID.randomUUID().toString());
		
		if(request.getBulan() % 2 == 0) {
			bayarTelkomResponse.setSuccess(true);
			bayarTelkomResponse.setMessage("Transaksi success");
		}
		else {
			bayarTelkomResponse.setSuccess(false);
			bayarTelkomResponse.setMessage("Transaksi gagal");
		}
		
		return new ResponseEntity(bayarTelkomResponse, HttpStatus.OK);
	}
	
	@GetMapping("/telkom/validate/{no-telpon}")
	public ResponseEntity<Object> validateNoTelpon(@PathVariable(name = "no-telpon") String noTelpon) {
		ValidateNoTelponResponse validateNoTelponResponse = new ValidateNoTelponResponse();
		if(Integer.parseInt(noTelpon.substring(noTelpon.length()-1, noTelpon.length())) % 2 == 0) {
			validateNoTelponResponse.setRegistered(true);
		}
		else {
			validateNoTelponResponse.setRegistered(false);
		}
		return new ResponseEntity(validateNoTelponResponse, HttpStatus.OK);
	}
}
