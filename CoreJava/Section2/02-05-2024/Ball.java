class Ball
{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double volumeCalculator(){
        return (4/3)*(22/7)*radius*radius*radius;
    }
}
class BasketBall extends Ball
{
    // int BasketBallNum;

    // private String BallName = BasketBall;
    BasketBall(){
        super.setRadius(12); //12cm
        // this.BallName = BallName;
    }
    // public void showGame(){
    // 	System.out.println("Game is played With "+ BasketBallNum + " "+ BallName +(BasketBallNum > 1)? " BasketBalls" : " BasketBall");
    // }
}
class TennisBall extends Ball
{
    // int TennisBallNum;
    // private String BallName = BasketBall;
    TennisBall(){
        super.setRadius(3.35);// 3.35cm
        // this.BallName = BallName;
    }
    // public void showGame(){
    // 	System.out.println("Game is played With "+ TennisBallNum + " " + BallName + (TennisBallNum > 1)? " Tennis Balls" : " Tennis Ball");
    // }
}