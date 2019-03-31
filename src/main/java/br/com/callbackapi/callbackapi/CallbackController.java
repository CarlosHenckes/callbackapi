package br.com.callbackapi.callbackapi;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackController {
	
	final static Logger LOGGER = Logger.getLogger(CallbackController.class.getName());
	
	@Autowired
	private CallbackService service;

	@PutMapping(path = "/v1/firstcall")
	public ResponseEntity<String> firstCall(){
		LOGGER.info("callback-controller-recendo-chamado");
		service.callbackCaller();
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
	}
}
