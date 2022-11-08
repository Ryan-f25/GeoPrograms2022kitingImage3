public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime =0;
        plane.trailWidth = 2;
        plane.isTrail = true;
        for (int row = 0; row < 20; row = row + 1)
        {
            for (int col = 0; col < 20; col = col + 1) {

                int a = (int) (Math.random() * 255);
                System.out.println(row);
                plane.teleport(30 * col + 20, row*30+100);
                plane.setColor(row*12, col*12, 175);
                plane.house(10);


            }
        }
    }
}







