package com.rph.SBMSSTOCKCALCAPI.dto;

import lombok.Data;

@Data
public class StockCalcResponse {
    private String compName;
    private Double compPrice;
    private Integer port;
    private Double totalCost;
}
