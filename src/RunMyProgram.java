

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new Ryanfirstgradedassignment()   );
        run.planeIcon = "plane.png";
       //run.pictureFileName="eye.jpg";
        run.HEIGHT=800;
        run.WIDTH=1000;
        run.Refresh();

        //new Thread(run).start();
    }
}
