import processing.core.PApplet;

public class Ball extends PApplet {
    private int speed ;
    private int diameter;
    private int distance;
    private int position;

    public Ball(int speed, int distance) {
        this.speed = speed;
        this.distance = distance;
        this.diameter = 14;
        this.position = 0;
    }

    void drawBall(PApplet pApplet){
        pApplet.ellipse(this.position,this.distance,this.diameter,this.diameter);
        this.position += this.speed;
    }

}