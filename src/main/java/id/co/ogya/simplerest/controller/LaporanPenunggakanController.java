package id.co.ogya.simplerest.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import id.co.ogya.simplerest.request.RecordLaporanPenunggakanRequest;
import id.co.ogya.simplerest.response.RecordLaporanPenunggakanResponse;

@Controller
public class LaporanPenunggakanController {
	@PostMapping("/tunggakan")
	public ResponseEntity<Object> recordMasterData(@RequestBody RecordLaporanPenunggakanRequest request) {
		RecordLaporanPenunggakanResponse recordMasterDataResponse = new RecordLaporanPenunggakanResponse();
		recordMasterDataResponse.setReferenceNumber(UUID.randomUUID().toString());
		recordMasterDataResponse.setSuccess(true);
		return new ResponseEntity(recordMasterDataResponse, HttpStatus.OK);
	}
}
