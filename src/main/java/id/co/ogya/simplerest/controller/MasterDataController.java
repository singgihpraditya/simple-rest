package id.co.ogya.simplerest.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import id.co.ogya.simplerest.request.RecordMasterDataRequest;
import id.co.ogya.simplerest.response.RecordMasterDataResponse;

@Controller
public class MasterDataController {
	@PostMapping("/master-data/record")
	public ResponseEntity<Object> recordMasterData(@RequestBody RecordMasterDataRequest request) {
		RecordMasterDataResponse recordMasterDataResponse = new RecordMasterDataResponse();
		recordMasterDataResponse.setReferenceNumber(UUID.randomUUID().toString());
		recordMasterDataResponse.setSuccess(true);
		return new ResponseEntity(recordMasterDataResponse, HttpStatus.OK);
	}
}
