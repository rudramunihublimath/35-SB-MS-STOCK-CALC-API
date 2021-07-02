package com.rph.SBMSSTOCKCALCAPI.client;

import com.rph.SBMSSTOCKCALCAPI.dto.StockCalcResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "STOCK-PRICE-API")
public interface StockPriceFeignClient {

    @GetMapping("/price")
    public StockCalcResponse getStockPrice(@RequestParam String compName);

}
