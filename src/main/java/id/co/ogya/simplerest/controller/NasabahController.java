package id.co.ogya.simplerest.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import id.co.ogya.simplerest.request.RecordSetorRequest;
import id.co.ogya.simplerest.request.RecordTarikRequest;
import id.co.ogya.simplerest.request.RecordTransferRequest;
import id.co.ogya.simplerest.response.RecordSetorResponse;
import id.co.ogya.simplerest.response.RecordTarikResponse;
import id.co.ogya.simplerest.response.RecordTransferResponse;
import id.co.ogya.simplerest.response.ValidateRekeningResponse;

@Controller
public class NasabahController {
	@PostMapping("/nasabah/setor")
	public ResponseEntity<Object> setor(@RequestBody RecordSetorRequest request) {
		RecordSetorResponse recordSetorResponse = new RecordSetorResponse();
		recordSetorResponse.setReferenceNumber(UUID.randomUUID().toString());
		recordSetorResponse.setSuccess(true);
		return new ResponseEntity(recordSetorResponse, HttpStatus.OK);
	}
	
	@PostMapping("/nasabah/tarik")
	public ResponseEntity<Object> tarik(@RequestBody RecordTarikRequest request) {
		RecordTarikResponse recordTarikResponse = new RecordTarikResponse();
		recordTarikResponse.setReferenceNumber(UUID.randomUUID().toString());
		recordTarikResponse.setSuccess(true);
		return new ResponseEntity(recordTarikResponse, HttpStatus.OK);
	}
	
	@PostMapping("/nasabah/transfer")
	public ResponseEntity<Object> tarik(@RequestBody RecordTransferRequest request) {
		RecordTransferResponse recordTransferResponse = new RecordTransferResponse();
		recordTransferResponse.setReferenceNumber(UUID.randomUUID().toString());
		recordTransferResponse.setSuccess(true);
		return new ResponseEntity(recordTransferResponse, HttpStatus.OK);
	}

	@GetMapping("/nasabah/validate-rekening/{no-rekening}")
	public ResponseEntity<Object> validateNoRekening(@PathVariable(name = "no-rekening") String noRekening) {
		ValidateRekeningResponse validateNoTelponResponse = new ValidateRekeningResponse();
		validateNoTelponResponse.setRegistered(true);
		return new ResponseEntity(validateNoTelponResponse, HttpStatus.OK);
	}
}
