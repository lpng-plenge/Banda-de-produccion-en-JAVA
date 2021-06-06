void setup() {
  pinMode(8,OUTPUT);
  //Iniciamos la comunicación con el puerto serie
  Serial.begin(9600);
}

void loop() {

  if(Serial.available()>0){
   int input = Serial.read();
    if(input=='1'){
      digitalWrite(8,HIGH);
    }else{
      digitalWrite(8,LOW);
    }
  }
}
