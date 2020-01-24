package org.sms.controller;

import java.util.List;

import org.sms.entites.Sms;
import org.sms.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SmsController {
	
	@Autowired
	private SmsService smsService;



	@GetMapping("sms")
	public ResponseEntity<List<Sms>> getAllsms() {
		List<Sms> list = smsService.getAllsms();
		return new ResponseEntity<List<Sms>>(list, HttpStatus.OK);
	}

	@PostMapping("addsms")
	public ResponseEntity<Void> addSms(@RequestBody Sms user, UriComponentsBuilder builder) {
		Sms savedUser = smsService.addSms(user);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/addsms/{id}").buildAndExpand(savedUser.getSmsId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}


}
