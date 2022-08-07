public class MovablePoint {
    int x;
    int y;
    int  xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUP(int y){
        moveUP(y -=ySpeed);
    }
    public void moveDown(int y ){
        moveDown(y += ySpeed);

    }
    public void moveLeft(int x){
        moveLeft(x-=xSpeed);
    }
    public void moveRight(int x){
        moveRight(x += xSpeed);
    }
}


