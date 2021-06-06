#include <printf.h>
#include <SPI.h>
#include <nRF24L01.h>
#include <RF24.h>

#define CE_PIN 9
#define CSN_PIN 10

//ledd
const int led = 7;

//potencciometros
const int a0=A0;
float s0=0;
float salida0=0.0;

//NRF 
byte direccion[5]={'c','a','n','a','l'};
RF24 radio(CE_PIN, CSN_PIN);
float datos[3];

void setup() {
 radio.begin();
 Serial.begin(9600);
 radio.openWritingPipe(direccion);
}

void loop() {
  s0 = analogRead(a0);
  salida0=map(s0, 0, 1023, 0, 255);
 
  if(salida0>127.5){
    analogWrite(led, 128);
  }else{
    analogWrite(led,0);
  }
  datos[0]= s0*(5.0 / 1023.0);
  datos[1]=millis()/100000;
  datos[2]=10;
  
  bool input= radio.write(&datos, sizeof(unsigned long));
  
  if(input){
    Serial.println(datos[0]);
    Serial.println(datos[1]);
    Serial.println(datos[2]);
  }else{
    Serial.println("no send");
  }
    
  
  delay(100);
}
