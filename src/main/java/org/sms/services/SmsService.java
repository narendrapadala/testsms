package org.sms.services;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sms.entites.Sms;
import org.sms.repository.SmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SmsService  {

	@Autowired
	private SmsRepository smsRepository;

	private static final Logger LOG = LoggerFactory.getLogger(SmsService.class);

	public List<Sms> getAllsms() {
		System.out.println("--- Inside getAllsms() ---");
		LOG.info("--- Inside getAllsms() ---");
		List<Sms> list = new ArrayList<>();
		smsRepository.findAll().forEach(e -> list.add(e));
		return list;
	}


	public Sms addSms(Sms sms) {
		System.out.println("--- Inside addSms() ---");
		LOG.info("--- Inside addSms() ---");
		return smsRepository.save(sms);
	}



}
