#include<SoftwareSerial.h>
SoftwareSerial BT(9,10);
const byte ledpin=13;
char val;

void setup() {
   pinMode(ledpin,OUTPUT);
   
   BT.begin(9600);
   BT.print("Serial is ready!");
}

void loop() {
 if( BT.available() ){
    val = BT.read();
    switch(val){
       case'0':
       digitalWrite(ledpin, LOW);
       break;
       case'1':
       digitalWrite(ledpin, HIGH);
       break;
    }
  }

}
