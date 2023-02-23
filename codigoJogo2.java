//Vetores e variáves para criação dos personagens do jogo e movimentação

int [] ini = new int [10];
int iniY;
int iniPos;
int iniPosX = 300;
int iniPosY = 360;

int posX, posY;
int posX2, posY2;
int posX3, posY3;

int x, y;
int ingx = 0;

//Boleano que verifaca colisão do personagem controlaveu e dos inimigos

boolean acertou = false;
boolean acertou2 = false;
boolean acertou3 = false;

boolean iniAcertou = false;
boolean iniAcertou2 = false;
boolean iniAcertou3 = false;

boolean ini2Acertou = false;
boolean ini2Acertou2 = false;
boolean ini2Acertou3 = false;

//Variáveis de paramentros para gerar o contato entre os personagens

float d, d2, d3;
float inid, inid2, inid3;
float ini2d, ini2d2, ini2d3;

//Variáveis de start e game over

float gameOver1;
float gameOver2;
boolean gameOver = false;
boolean movi = true;
boolean moviIni = true;
boolean moviIni2 = true;

//Função que "chama" as funções a cada frame
void draw() {
  cenario();
  player();
  point1();
  point2();
  point3();
  marcaPonto();
  contadorFrame();
  inimigo1();
  inimigo2();
  gameOver();
  println(frame);
}

void player() {
  strokeWeight(2);
  rectMode(CENTER);
  fill(100, 170, 100);
  rect(x+30, y+30, 20, 20);
}

void inimigo1() {
  fill(200, 100, 200);  
  ellipse(30+ingx, ini[iniY]+30, 60, 60);
  fill(0);
  ellipse(ingx+15, ini[iniY]+15, 5, 15);
  ellipse(ingx+45, ini[iniY]+15, 5, 15);
  ellipse(ingx+30, ini[iniY]+45, 15, 5);

  gameOver1 = dist(ingx+30, ini[iniY]+45, x+30, y+30);

  if (gameOver1 <= 30) {
    println("morreu");
    gameOver = true;
  }

  if (ingx == 720) { 
    iniY++;
    ingx = 0;
  }
  if (iniY >= 10) iniY = 0;
  if (frame == 2 && moviIni == true) ingx+=60;
}

void inimigo2() {
  fill(50, 200, 50);  
  ellipse(iniPosX+30, iniPosY+30, 60, 60);
  fill(0);
  ellipse(iniPosX+15, iniPosY+15, 5, 15);
  ellipse(iniPosX+45, iniPosY+15, 5, 15);
  ellipse(iniPosX+30, iniPosY+45, 15, 5);

  if (frame == 2 && moviIni2 == true) {
    iniPos = int(random(4));
    if (iniPos == 0 && iniPosX<=600) iniPosX += 60; 
    if (iniPos == 1 && iniPosX>=60) iniPosX -= 60;
    if (iniPos == 2 && iniPosY<=480) iniPosY += 60; 
    if (iniPos == 3 && iniPosY>=60) iniPosY -= 60;
  }  
 
  gameOver2 = dist(iniPosX+30, iniPosY+30, x+30, y+30);

  if (gameOver2 <= 30) {
    println("morreu");
    gameOver = true;
  }
}

void point1() {

    fill(200, 50, 50);
  ellipseMode(CENTER);
  ellipse(dx[posX]+30, dy[posY]+30, 15, 15);
  d = dist(dx[posX]+30, dy[posY]+30, x+30, y+30);
  inid = dist(dx[posX]+30, dy[posY]+30, 30+ingx, ini[iniY]+30);
  ini2d = dist(dx[posX]+30, dy[posY]+30, iniPosX+30, iniPosY+30);

  if (d <= 15) {
    acertou = true;
    println("acertou");
    marcaPonto = true;
  }

  if (acertou == true) { 
    posX = int(random(dx.length));
    posY = int(random(dy.length));
    acertou = false;
  }

  if (inid <= 30) {
    iniAcertou = true;
    println("acertou");
  }

  if (iniAcertou == true) { 
    posX = int(random(dx.length));
    posY = int(random(dy.length));
    pontos-=1;
    iniAcertou = false;
  }

  if (ini2d <= 30) {
    ini2Acertou = true;
    println("acertou");
  }

  if (ini2Acertou == true) { 
    posX = int(random(dx.length));
    posY = int(random(dy.length));
    pontos-=1;
    ini2Acertou = false;
  }
}

void point2() {

  fill(200, 50, 50);
  ellipseMode(CENTER);
  ellipse(dx2[posX2]+30, dy2[posY2]+30, 15, 15);
  d2 = dist(dx2[posX2]+30, dy2[posY2]+30, x+30, y+30);
  inid2 = dist(dx2[posX2]+30, dy2[posY2]+30, 30+ingx, ini[iniY]+30);
  ini2d2 = dist(dx2[posX2]+30, dy2[posY2]+30, iniPosX+30, iniPosY+30);

  if (d2 <= 15) {
    acertou2 = true;
    println("acertou");
    marcaPonto2 =  true;
  }

  if (acertou2 == true) { 
    posX2 = int(random(dx.length));
    posY2 = int(random(dy.length));
    acertou2 = false;
  }

  if (inid2 <= 30) {
    iniAcertou2 = true;
    println("acertou");
  }

  if (iniAcertou2 == true) { 
    posX2 = int(random(dx.length));
    posY2 = int(random(dy.length));
    pontos-=1;
    iniAcertou2 = false;
  }

  if (ini2d2 <= 30) {
    ini2Acertou2 = true;
    println("acertou");
  }

  if (ini2Acertou2 == true) { 
    posX2 = int(random(dx.length));
    posY2 = int(random(dy.length));
    pontos-=1;
    ini2Acertou2 = false;
  }
}

void point3() {

    fill(200, 50, 50);
  ellipseMode(CENTER);
  ellipse(dx3[posX3]+30, dy2[posY3]+30, 15, 15);
  d3 = dist(dx3[posX3]+30, dy3[posY3]+30, x+30, y+30);
  inid3 = dist(dx3[posX3]+30, dy3[posY3]+30, 30+ingx, ini[iniY]+30);
  ini2d3 = dist(dx3[posX3]+30, dy3[posY3]+30, iniPosX+30, iniPosY+30);

  if (d3 <= 15) {
    acertou3 = true;
    println("acertou");
    marcaPonto3 = true;
  }
  
   if (acertou3 == true) { 
    posX3 = int(random(dx.length));
    posY3 = int(random(dy.length));
    acertou3 = false;
  }

  if (inid3 <= 30) {
    iniAcertou3 = true;
    println("acertou");
  }

  if (iniAcertou3 == true) { 
    posX3 = int(random(dx.length));
    posY3 = int(random(dy.length));
    pontos-=1;
    iniAcertou3 = false;
  }

   if (ini2d3 <= 30) {
    ini2Acertou3 = true;
    println("acertou");
  }

  if (ini2Acertou3 == true) { 
    posX3 = int(random(dx.length));
    posY3 = int(random(dy.length));
    pontos-=1;
    ini2Acertou3 = false;
  }
}

