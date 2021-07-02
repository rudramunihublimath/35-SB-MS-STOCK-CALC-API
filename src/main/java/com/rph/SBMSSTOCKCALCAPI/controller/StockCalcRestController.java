package com.rph.SBMSSTOCKCALCAPI.controller;

import com.rph.SBMSSTOCKCALCAPI.client.StockPriceFeignClient;
import com.rph.SBMSSTOCKCALCAPI.dto.StockCalcResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockCalcRestController {

    @Autowired
    private StockPriceFeignClient feignClient;

    @GetMapping
    public String test(){
        return "STOCK-CALC API";
    }

    @GetMapping("/cost")
    public StockCalcResponse getCost(@RequestParam String compName,
                                     @RequestParam Integer qty){
        StockCalcResponse stockPrice = feignClient.getStockPrice(compName);
        stockPrice.setTotalCost(qty*stockPrice.getCompPrice());
        return stockPrice;
    }

}
