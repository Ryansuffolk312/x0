//// Wild circles #3.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Bruce Alan Martin";

// GLOBAL VARIABLES //
float x,y;
int h,w;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);
  x=  width/2;
  y=  height/2;
  w=  80;          // width of ellipse.
  h=  80;          // height of ellipse
}

// Next frame. //
void draw() 
{ fill(176);
  rect(100, 250, 100, 25);                    // left arm
  rect(200, 250, 200, 25);                    // right arm
  fill(240, 55, 22);                         
  rect(200, 250, 100, 100, 7);                // torso
  fill(176);
  rect(200, 350, 25, 100);                    // left leg
  rect(275, 350, 25, 100);                    // right leg 
  fill(230);
  triangle(100,300,150,230,75,240);           // left knife
  triangle(400,300,450,230,375,240);          // right knife 
  fill (24, 32, 316);
  ellipse(250, 250, 100, 100);                // head
  fill(0);
  text("Slasher",225,325);                   // moved name to torso
  fill(255);                                 // couldn't figure out how to keep color change
  text( title, 10, 10 );
  text( subtitle, width/2, 10 );
  text( author, 10, height-10 );
  text( w+"x"+h, width/2,height-10 );
  //
  }


//  Handle mouse clicks //
void mousePressed() {
  x=  mouseX;
  y=  mouseY;
}


//  Handle keyboard //
void keyPressed() {
  // Erase everything, change size & color. //
  background( random(255), random(255), random(255) );
  fill( random(255), random(255), random(255) );
  w=  int( random(50,150) );
  h=  int( random(50,150) );
}
  
  
  
