package in.anand.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class QuoteApiService {

	String api="https://quoters.apps.pcfone.io/api/random";
	WebClient client=WebClient.create();
	client.get()

}
