package br.com.mei.restfulwebservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	private static final String msgWS = "Serviço Web funcionando, %s!";
	private final AtomicLong aL = new AtomicLong();
	
	@GetMapping("/mensagem-funcionamento-serviço-web")
	public ResourceRepresentationClass resourceRepresentationClass(
			@RequestParam(value = "nameUser", defaultValue = "Usuário") String nameUser) {
		return new ResourceRepresentationClass(aL.incrementAndGet(),
				String.format(msgWS, nameUser));
		
	}

}
