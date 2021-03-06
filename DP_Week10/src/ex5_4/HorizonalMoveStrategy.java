package ex5_4;

public class HorizonalMoveStrategy implements DirectionStrategy {

	@Override
	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL, 0);

		while (true) {
			ball.setX(ball.getX() + ball.getXinterval());

			if ((ball.getX() < 0 && ball.getXinterval() < 0)
					|| ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getXinterval() > 0) {
				ball.setIntervals(-ball.getXinterval(), 0);
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}
