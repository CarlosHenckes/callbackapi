package br.com.callbackapi.callbackapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "res", url = "http://192.168.99.100:9000")
public interface Proxy {

	@PostMapping(path = "/v1/requester")
	public String responseCallback(@RequestBody String payload);
}
