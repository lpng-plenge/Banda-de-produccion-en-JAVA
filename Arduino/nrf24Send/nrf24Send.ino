#include <SPI.h>  // incluye libreria SPI para comunicacion con el modulo
#include <RH_NRF24.h> // incluye la seccion NRF24 de la libreria RadioHead
#define LED1 4
#define LED2 3
#define LED3 2
RH_NRF24 nrf24;   // crea objeto con valores por defecto para bus SPI
// y pin digital numero 8 para CE

void setup() {
  //Asignamos los puertos de entrada
  pinMode(LED1, OUTPUT);
  pinMode(LED2, OUTPUT);
  pinMode(LED3, OUTPUT);
  
  //Iniciamos la comunicación con el puerto serie
  Serial.begin(9600);
  if (!nrf24.init())    // si falla inicializacion de modulo muestra texto
    Serial.println("fallo de inicializacion");
  if (!nrf24.setChannel(2)) // si falla establecer canal muestra texto
    Serial.println("fallo en establecer canal");
  if (!nrf24.setRF(RH_NRF24::DataRate2Mbps, RH_NRF24::TransmitPower0dBm)) // si falla opciones
    Serial.println("fallo en opciones RF");             // RF muestra texto

  Serial.println("Base iniciada");  // texto para no comenzar con ventana vacia
}

void loop() {
  if (Serial.available() > 0) {
    int input = Serial.read();
    switch (input) {
      case '1':
        digitalWrite(LED1, HIGH);
        digitalWrite(LED2, LOW);
        digitalWrite(LED3, LOW);
        if (nrf24.available()) {
          uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];  // buffer con longitud maxima de 32 bytes
          uint8_t len = sizeof(buf);      // obtiene longitud de la cadena
          if (nrf24.recv(buf, &len))      // si hay informacion valida en el buffer
          {
            Serial.print("Computadora: ");   // muestra texto
            Serial.println((char*)buf);   // muestra contenido del buffer
            uint8_t data1[] = "Prendido";
            nrf24.send(data1, sizeof(data1));   // envia texto
            nrf24.waitPacketSent();     // espera hasta realizado el envio
          } else {
            Serial.println("fallo en recepcion"); // muestra texto
          }
        }
        break;
      case '2':
        digitalWrite(LED1, HIGH);
        digitalWrite(LED2, HIGH);
        digitalWrite(LED3, LOW);
        if (nrf24.available()) {
          uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];
          uint8_t len = sizeof(buf);
          if (nrf24.recv(buf, &len))
          {
            Serial.print("Computadora: ");
            Serial.println((char*)buf);
            uint8_t data2[] = "Salida";
            nrf24.send(data2, sizeof(data2));
            nrf24.waitPacketSent();
          } else {
            Serial.println("fallo en recepcion");
          }
        }
        break;
      case '0':
        digitalWrite(LED1, HIGH);
        digitalWrite(LED2, LOW);
        digitalWrite(LED3, HIGH);
        if (nrf24.available()) {
          uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];
          uint8_t len = sizeof(buf);
          if (nrf24.recv(buf, &len))
          {
            Serial.print("Computadora: ");
            Serial.println((char*)buf);
            uint8_t data3[] = "Defectuoso";
            nrf24.send(data3, sizeof(data3));
            nrf24.waitPacketSent();
          } else {
            Serial.println("fallo en recepcion");
          }
        }
        break;
      default:
        digitalWrite(LED1, LOW);
        digitalWrite(LED2, LOW);
        digitalWrite(LED3, LOW);
        if (nrf24.available()) {
          uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];
          uint8_t len = sizeof(buf);
          if (nrf24.recv(buf, &len))
          {
            Serial.print("Computadora: ");
            Serial.println((char*)buf);
            uint8_t data1[] = "Apagado";
            nrf24.send(data1, sizeof(data1));
            nrf24.waitPacketSent();
          } else {
            Serial.println("fallo en recepcion");
          }
        }
        break;
    }
  }
}
