codigoJogo

//Vetor de localização dos pontos

int [] dx = new int [12];
int [] dx2 = new int [12];
int [] dx3 = new int [12];

int [] dy = new int [10];
int [] dy2 = new int [10];
int [] dy3 = new int [10];

//Boleano de verifcação de colisão dos pontos
int pontos;

boolean marcaPonto = false;
boolean marcaPonto2 = false;
boolean marcaPonto3 = false;

//Frames da cena
int frame = 0;

//Inicializador da cena
void setup() {
  
  frameRate(10);
  size(720, 700);
  for (int x = 0; x<12; x++) {
    for (int y = 0; y<10; y++) {
      dx[x] = x * 60;
      posX = int(random(dx.length));
      //println(dx[posX]);
      dy[y] = y * 60;
      posY = int(random(dy.length));
    }
  }

  for (int x = 0; x<12; x++) {
    for (int y = 0; y<10; y++) {
      dx2[x] = x * 60;
      posX2 = int(random(dx2.length));
      //println(dx[posX], dx2[posX2]);
      dy2[y] = y * 60;
      posY2 = int(random(dy2.length));
    }
  }

  for (int x = 0; x<12; x++) {
    for (int y = 0; y<10; y++) {
      dx3[x] = x * 60;
      posX3 = int(random(dx3.length));
      //println(dx[posX], dx3[posX2]);
      dy3[y] = y * 60;
      posY3 = int(random(dy3.length));
    }
  }

  for (int y = 0; y<10; y++) {
    ini[y] = y * 60;
    iniY = int(random(ini.length));
  }
    
}

void cenario() {
  background(150);
  //grid
  strokeWeight(1);
  for (int x = 0; x<13; x++) {
    for (int y = 0; y<11; y++) {
      line(x*60, 0, 60*x, 600);
      line(0, y*60, 720, 60*y);
    }
  }
}

void marcaPonto(){
 textSize(50);
  fill(200,200,50);
  text("Score: "+pontos, 250, 660);
}

void contadorFrame(){
frame++;
if(frame == 5) frame = 0;
}

void keyReleased() {
  if ((marcaPonto == true)||(marcaPonto2 == true)||(marcaPonto3 == true)) { 
    pontos+=1;
    marcaPonto = false;
    marcaPonto2 = false;
    marcaPonto3 = false;
  }
}

void keyPressed() {
  if(movi == true){
  if (keyCode == RIGHT && x<=600) x+=60;
  if (keyCode == LEFT && x>0) x-=60;
  if (keyCode == UP && y>=60) y-=60;
  if (keyCode == DOWN && y<540) y+=60;
  }
}
