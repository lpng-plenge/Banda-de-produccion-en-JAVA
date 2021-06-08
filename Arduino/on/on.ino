#include <SPI.h>  // incluye libreria SPI para comunicacion con el modulo
#include <RH_NRF24.h> // incluye la seccion NRF24 de la libreria RadioHead
#define LED1 4
#define LED2 3
#define LED3 2
RH_NRF24 nrf24;   // crea objeto con valores por defecto para bus SPI
// y pin digital numero 8 para CE

void setup() {
  pinMode(LED1, OUTPUT);
  pinMode(LED2, OUTPUT);
  pinMode(LED3, OUTPUT);
  //Iniciamos la comunicación con el puerto serie
  Serial.begin(9600);
  if (!nrf24.init())    // si falla inicializacion de modulo muestra texto
    Serial.println("fallo de inicializacion");
  if (!nrf24.setChannel(2)) // si falla establecer canal muestra texto
    Serial.println("fallo en establecer canal");
  if (!nrf24.setRF(RH_NRF24::DataRate250kbps, RH_NRF24::TransmitPower0dBm)) // si falla opciones
    Serial.println("fallo en opciones RF");             // RF muestra texto

  Serial.println("Base iniciada");  // texto para no comenzar con ventana vacia
}

void loop() {
  if (Serial.available() > 0) {
    int input = Serial.read();
    Serial.println(input);
    switch (input) {
      case '1':
        digitalWrite(LED1, HIGH);
        digitalWrite(LED2, LOW);
        digitalWrite(LED3, LOW);
        break;
      case '2':
        digitalWrite(LED1, HIGH);
        digitalWrite(LED2, HIGH);
        digitalWrite(LED3, LOW);
        break;
      case '0':
        digitalWrite(LED1, HIGH);
        digitalWrite(LED2, LOW);
        digitalWrite(LED3, HIGH);
        break;
      default:
        digitalWrite(LED1, LOW);
        digitalWrite(LED2, LOW);
        digitalWrite(LED3, LOW);
        return;

    }
  }
  //  if (nrf24.available())      // si hay informacion disponible
  //  {
  //    uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];  // buffer con longitud maxima de 32 bytes
  //    uint8_t len = sizeof(buf);      // obtiene longitud de la cadena
  //    if (nrf24.recv(buf, &len))      // si hay informacion valida en el buffer
  //    {
  //      Serial.print("Recibido: ");   // muestra texto
  //      Serial.println((char*)buf);   // muestra contenido del buffer
  //
  //      uint8_t data[] = "Hola amigo remoto"; // se almacena texto a enviar
  //      nrf24.send(data, sizeof(data));   // envia texto
  //      nrf24.waitPacketSent();     // espera hasta realizado el envio
  //      Serial.println("Respondiendo");   // muestra texto
  //    }
  //    else          // si falla la recepcion
  //    {
  //      Serial.println("fallo en recepcion"); // muestra texto
  //    }
}
