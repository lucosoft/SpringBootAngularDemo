package demo.controller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.controller.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@RequestMapping("/")
	@ResponseBody
	public ResponseEntity<String> home() {
		String respuesta = this.clienteService.home();
		return new ResponseEntity<>(respuesta, HttpStatus.OK);
	}
}
