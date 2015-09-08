//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);        
  x=  width/4;
  y=  height/3;
  
}

// Next frame:  draw three circles. //
void draw() {
   background(44,235, 240);         // added to smooth out animation   
   // moved, resized, and added shapes to turn into UFO floating in the sky
ellipse(x, y, 200, 25 );                      
 fill(12, 75, 108);     
  ellipse(x+0, y+-40, 125, 75);
  fill(255);
  ellipse(x+90, y+90, 200, 50);  
  fill(255);
   ellipse(x+-150, y+-200, 200, 50); // added to make another cloud 
   fill(176);
        x=  x + 2;  y=  y + 1;
        
        
  
}
