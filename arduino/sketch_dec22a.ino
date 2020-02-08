#include <SoftwareSerial.h>
#include <Wire.h>

//the maximum received command length from an Android system (over the bluetooth)
#define MAX_BTCMDLEN 128

//HC-06 Arduino
//TX RX/Pin9
//RX TX/Pin10
SoftwareSerial BTSerial(10,11);//Arduino RX/TX

byte cmd[MAX_BTCMDLEN];//received 128bytes from an Arduino system
int len = 0;//received command length


void setup() {  
   Serial.begin(9600); //Arduino起始鮑率:9600
   BTSerial.begin(9600);

}

void loop() {
  char str[MAX_BTCMDLEN];
  int insize,ii;
  int tick=0;
  while(tick<MAX_BTCMDLEN)
    if((insize=(BTSerial.available()))>0){
      for(ii=0;ii<insize;ii++){
         cmd[(len++)%MAX_BTCMDLEN]=
char(BTSerial.read());
      }
    }else{
       tick++;
     }
   }              
   
     
