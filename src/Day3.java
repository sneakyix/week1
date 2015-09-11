import TurtleGraphics.*;

public class Day3 {
    
    public static void main(String[] args) {
        SketchPadWindow win = new SketchPadWindow(600,400);
        Pen p = new WiggleRainbowPen(win);
        p.setWidth(10);
        int size = 100;
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        //move over and make another square
        p.up();
        p.move(250);
        p.down();
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        //move over and make another square
        p.up();
        p.move(150);
        p.down();
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        //move over and make another square
        p.up();
        p.move(150);
        p.down();
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
    }
    
}
