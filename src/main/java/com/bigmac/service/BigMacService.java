package com.bigmac.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.bigmac.model.BitCoinModel;

public class BigMacService {
	public final String urlApiBitCoin = "https://www.mercadobitcoin.net/api/BTC/ticker";
	public String CalcularBigMac() {
		
		RestTemplate restTemp = new RestTemplate();
		
		ResponseEntity<BitCoinModel> bitCoin = restTemp.getForEntity(urlApiBitCoin
				, BitCoinModel.class);
		
		
		return "teste";
		
	}
}
