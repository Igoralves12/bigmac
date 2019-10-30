package com.bigmac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigmac.service.*;

@RestController
@RequestMapping(value="/v1")	
public class MacController {
	public BigMacService eatBig;
	
	@GetMapping("/eatMac")
	public String eatMac() {
		eatBig = new BigMacService();
		
		return eatBig.CalcularBigMac();
}


}
