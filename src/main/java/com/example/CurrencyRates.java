package com.example;

import java.util.Map;

public class CurrencyRates {
    private Map<String, Double> rates;

    // Getter y Setter para las tasas de cambio
    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }
}
