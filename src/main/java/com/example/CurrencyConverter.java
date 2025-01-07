package com.example;

import java.util.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Scanner;
import java.util.Map;

public class CurrencyConverter {
    // Map para almacenar las tasas de cambio
    private static final Map<String, Double> currencyRates = new HashMap<>();

    public static void main(String[] args) {
        // Llenamos el Map con algunas tasas de cambio
        currencyRates.put("USD", 1.0);
        currencyRates.put("ARS", 1035.75);
        currencyRates.put("BRL", 6.112);
        currencyRates.put("COP", 4336.79);

        // Llamamos a la función para realizar la conversión
        showMenu();
    }

    // Función que muestra el menú de opciones
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=================================");
        System.out.println("¡Bienvenido al Conversor de Moneda! =]");
        System.out.println("=================================");
        
        // Muestra las opciones de conversión
        System.out.println("Elija una opción de conversión:");
        System.out.println("1) Dólar =>> Peso argentino (ARS)");
        System.out.println("2) Peso argentino (ARS) =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño (BRL)");
        System.out.println("4) Real brasileño (BRL) =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano (COP)");
        System.out.println("6) Peso colombiano (COP) =>> Dólar");
        System.out.println("7) Salir");
        
        // Leer la opción seleccionada
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                convertCurrencyFlow("USD", "ARS");
                break;
            case 2:
                convertCurrencyFlow("ARS", "USD");
                break;
            case 3:
                convertCurrencyFlow("USD", "BRL");
                break;
            case 4:
                convertCurrencyFlow("BRL", "USD");
                break;
            case 5:
                convertCurrencyFlow("USD", "COP");
                break;
            case 6:
                convertCurrencyFlow("COP", "USD");
                break;
            case 7:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida.");
                showMenu();
                break;
        }
    }

    // Función para realizar la conversión entre dos monedas
    public static void convertCurrencyFlow(String fromCurrency, String toCurrency) {
        Scanner scanner = new Scanner(System.in);

        // Verifica si el par de monedas es válido
        if (currencyRates.containsKey(fromCurrency) && currencyRates.containsKey(toCurrency)) {
            System.out.print("Ingrese la cantidad a convertir desde " + fromCurrency + " a " + toCurrency + ": ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Por favor ingrese una cantidad válida mayor que 0.");
            } else {
                // Realiza la conversión
                double rateFrom = currencyRates.get(fromCurrency);
                double rateTo = currencyRates.get(toCurrency);
                double result = amount * rateTo / rateFrom;

                // Muestra el resultado de la conversión
                System.out.printf("%.2f %s equivale a %.2f %s\n", amount, fromCurrency, result, toCurrency);
            }
        } else {
            System.out.println("Moneda no válida.");
        }

        // Después de la conversión, muestra el menú nuevamente
        showMenu();
    }
}