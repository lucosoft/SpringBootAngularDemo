package demo.controller.service.impl;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import demo.controller.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Override
	public String home() {
		
		String localValor1 = "valor01";
		String localVvalor2 = "valor02";

		RestTemplate rest = new RestTemplate();
		rest.setMessageConverters(Arrays.asList(new StringHttpMessageConverter(), new FormHttpMessageConverter()));
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.set("valor1", localValor1);
		params.set("valor2", localVvalor2);
		// URI tgtUrl = rest.postForLocation("http://localhost:8081", params,
		// Collections.emptyMap());
		// URI tgtUrl = rest.getForEntity(url, responseType, uriVariables)
		// ("http://image81:8081", params, Collections.emptyMap());
		ResponseEntity<String> response = rest.getForEntity("http://localhost:8081/demos/home?message=BLAH", String.class);
//		ResponseEntity<String> response = rest.getForEntity("http://image81:8081/demos/home?message=BLAH", String.class);
		String body = response.getBody();
		System.out.println("Fin Test port 8082");
		// return "Fin Test port 8082";
		return body;
	}
}
