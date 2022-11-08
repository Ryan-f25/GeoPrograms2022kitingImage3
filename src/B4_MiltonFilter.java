public class B4_MiltonFilter extends World {

   public int red;
   public int blue;
   public int green;

   public void go() {
      plane.loadBackGround("Spongebob.png");          //*** new method to load a diffrent JPG
      System.out.println("This will be printed to the  window. ");
      plane.teleport(0, 0);
      plane.showBackGround();
      System.out.println(plane.howMuchRed());

      for (int row = 570; row < 760; row++)    //*** this is using new getBackground
      {
         for (int col = 60; col < 616; col++)    //*** this is using new getBackgroun
         {
            plane.teleport(col, row);

            red = plane.howMuchRed();
            green = plane.howMuchGreen();
            blue = plane.howMuchBlue();

            //&& means that all of the statements have to be true for the if statement to work
            //|| is for Or so only one of the statements has to work

            if ((red <= 255 && green <= 255 && blue <= 255)) {
               plane.setPixelColor(30, 70, 160);
            }
         }
      }
   }
}


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/