//// Wild circles #0.

// Setup:  screen size. //
void setup() {
  size(400, 350);                // Made screen bigger and wider
}
               
// Next frame:  circle at (x,y). //
void draw() {
  ellipse( 200, 225, 150,200 );       // increased circle's size, moved it towards center

//decided to give it a face
  rect( 150, 175, 25, 50 );           //left eye                
  
  rect( 225, 175, 25, 50);           //right eye
 
  rect(150, 250, 100, 25);           // mouth
  
  ellipse(200, 345, 125, 90);        // body  

rect(150, 300, 100, 25, 7);         // neck thingy (technical term)
}
