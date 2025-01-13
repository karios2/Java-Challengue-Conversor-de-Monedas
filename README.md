Conversor de Monedas

Este es un programa de conversión de monedas que permite convertir entre diferentes monedas utilizando tasas de cambio obtenidas de una API externa. Los usuarios pueden seleccionar el tipo de conversión y la cantidad de dinero a convertir, y el sistema calculará y mostrará el valor equivalente en la moneda destino.

Requisitos Java 11 o superior. Biblioteca Gson (versión 2.11.0) para manejar el JSON. Acceso a Internet para obtener tasas de cambio actuales desde la API. Instalación Clona este repositorio en tu máquina local:

git clone

Navega al directorio del proyecto:

cd

Compila el proyecto utilizando Maven:

mvn compile

y ejecuta

mvn exec:java

Aparecerá un menú con las opciones disponibles para realizar las conversiones.

Selecciona la opción de conversión deseada e ingresa la cantidad de dinero a convertir.

El sistema mostrará el valor convertido en la moneda seleccionada.

Ejemplo de Uso ¡Bienvenido al Conversor de Moneda! =]
Elija una opción de conversión:

Dólar =>> Peso argentino (ARS)
Peso argentino (ARS) =>> Dólar
Dólar =>> Real brasileño (BRL)
Real brasileño (BRL) =>> Dólar
Dólar =>> Peso colombiano (COP)
Peso colombiano (COP) =>> Dólar
Salir Elija una opción válida: 1 Ingrese la cantidad a convertir desde USD a ARS: 5 5.00 USD equivale a 5178.75 ARS
