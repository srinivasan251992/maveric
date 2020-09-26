package com.maveric.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maveric.spring.model.Root;

@Service
public class RetrieveServiceImpl implements RetrieveService {
	
	@Autowired
	RestTemplate rt;

	@Override
	public Root retrieveFields() {

		Root u = rt.getForObject("https://rss.itunes.apple.com/api/v1/us/apple-music/coming-soon/all/10/explicit.json", Root.class);
		return u;
	}

}
