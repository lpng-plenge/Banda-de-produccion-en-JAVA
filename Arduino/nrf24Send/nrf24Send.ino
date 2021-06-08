
#include <SPI.h>
#include <RH_NRF24.h>

// Singleton instance of the radio driver
RH_NRF24 nrf24;

void setup()
{
  Serial.begin(9600);
  if (!nrf24.init())
    Serial.println("fallo de inicializacion");
  // Defaults after init are 2.402 GHz (channel 2), 2Mbps, 0dBm
  if (!nrf24.setChannel(2))
    Serial.println("fallo establecer el canal");
  if (!nrf24.setRF(RH_NRF24::DataRate250kbps, RH_NRF24::TransmitPower0dBm))
    Serial.println("fallo opcioner RF");

  Serial.println("Base Iniciada");
}


void loop()
{

  if (nrf24.available())
  {
    if (Serial.available() > 0) {
      int input = Serial.read();
      if (input == '1') {
        uint8_t data[] = "1";
        nrf24.send(data, sizeof(data));
        nrf24.waitPacketSent();
      } else if (input == '2') {
        uint8_t value[] = "2";
        nrf24.send(value, sizeof(value));
        nrf24.waitPacketSent();
      } else {
        uint8_t data1[] = "0";
        nrf24.send(data1, sizeof(data1));
        nrf24.waitPacketSent();
      }
    }
  }
}
