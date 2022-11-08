public class Ryanfirstgradedassignment extends World{

    public int red;
    public int blue;
    public int green;



    public void circle(int a, int b){
        for (int i = 0; i < 360; i++) {
            plane.move(a);
            plane.turn(b);
        }
    }



    public void go() {
        // plane.showBackGround();
        plane.teleport(0, 0);
        //System.out.println(plane.howMuchRed());
        for (int x = 0; x < 1000; x++) {
            for (int y = 400; y < 800; y++) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red == 0 && green == 0 && blue == 0) {
                    plane.setPixelColor(0, 0, 130);
                }
            }
        }

        for (int x = 0; x < 1000; x++) {
            for (int y = 0; y < 400; y++) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if ((red <= 255 && green <= 255 && blue <= 255)) {
                    plane.setPixelColor(132, 228, 247);
                }
            }
        }

        plane.isTrail = true;
        plane.pausetime = 0;
        plane.setColor(255, 255, 0);
        plane.trailWidth = 70;
        plane.teleport(930, -30);
        for (int i = 0; i < 360; i++) {
            plane.move(10);
            plane.turn(10);
        }

        plane.teleport(450,600);
        plane.isTrail = true;
        plane.setColor(0,0,0);
        rectangle(5,60);

        plane.setColor(241,194,125);
        plane.trailWidth = 10;
        plane.teleport(480,720);
        circle(1,5);

        plane.setColor(0,0,0);
        plane.trailWidth = 7;
        plane.teleport(465,520);
        rectangle(7,90);

        plane.teleport(500,520);
        rectangle(7,90);

        plane.teleport(537,500);
        plane.setColor(196, 67, 73);
        rectangle(150,40);
        for (int x = 370; x < 585; x++) {
            for (int y = 500; y < 550; y++) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if ((red >=0 && green >= 0 && blue >= 0)) {
                    plane.setPixelColor(196, 67, 73);
                }
            }
        }

        plane.setColor(15, 252, 3);
        plane.teleport(725,100);
        rectangle(500,150);
        for (int x = 225; x < 727; x++) {
            for (int y = 102; y < 255; y++) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if ((red >=0 && green >= 0 && blue >= 0)) {
                    plane.setPixelColor(15, 252, 3);
                }
            }
        }

        plane.setColor(255,255,255);
        plane.trailWidth = 2;
        plane.teleport(480,645);
        plane.startingAngle(327);
        turnedrectangle(1,465);
        plane.teleport(480,645);
        plane.startingAngle(350);
        turnedrectangle(1,395);
        plane.teleport(480,645);
        plane.startingAngle(10);
        turnedrectangle(1,395);
        plane.teleport(480,645);
        plane.startingAngle(33);
        turnedrectangle(1,464);

    }



        public void rectangle(int a, int b) {
            plane.startingAngle(180);
            plane.move(a);
            plane.turn(90);
            plane.move(b);
            plane.turn(90);
            plane.move(a);
            plane.turn(90);
            plane.move(b);
            plane.turn(90);
        }

        public void turnedrectangle(int a, int b) {
            plane.move(a);
            plane.turn(90);
            plane.move(b);
            plane.turn(90);
            plane.move(a);
            plane.turn(90);
            plane.move(b);
            plane.turn(90);
            }
}



