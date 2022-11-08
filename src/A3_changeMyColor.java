

public class A3_changeMyColor extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(130, 0, 130);
        plane.move(100);
        plane.turn(240);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(20, 80, 10);
        plane.move(100);
        plane.turn(240);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(9, 150, 190);
        plane.move(100);

    }


}
