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
  if (!nrf24.setRF(RH_NRF24::DataRate2Mbps, RH_NRF24::TransmitPower0dBm))
    Serial.println("fallo opcioner RF");
}


void loop()
{
  uint8_t data[] = "Recibido!";
  nrf24.send(data, sizeof(data));
  nrf24.waitPacketSent();
  // Now wait for a reply
  uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];
  uint8_t len = sizeof(buf);
  
  if (nrf24.available())
  {
    if (nrf24.recv(buf, &len))
    {
      Serial.print("Recibido: ");
      Serial.println((char*)buf);
    }
    else
    {
      Serial.println("fallo en recepcion");
    }
  }
  delay(100);
}
