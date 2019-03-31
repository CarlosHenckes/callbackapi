package br.com.callbackapi.callbackapi;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallbackService {
	
	final static Logger LOGGER = Logger.getLogger(CallbackService.class.getName());
	
	@Autowired
	private Proxy proxy;

	public void callbackCaller() {
		try {
			TimeUnit.SECONDS.sleep(1);
			LOGGER.info("callback-service-devolvendo-requester");
			proxy.responseCallback("name=carlos&idade=48");
			
		} catch (InterruptedException e) {
			throw new RuntimeException(e.getMessage()); }
	}
}
