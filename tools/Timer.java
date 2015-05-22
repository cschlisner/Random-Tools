package tools;
public class Timer{
	private long startTime;
	private long endTime;
	private long elapsedTime;
	private boolean running;
	public Timer(){
		startTime = 0;
		endTime = 0;
		elapsedTime = 0;
		running = false;
	}

	public void start(){
		if (!running){
			running = true;
			startTime = System.nanoTime();
		}
		else {
			stop();
			start();
		}
	}

	public void stop(){
		if (running){
			running = false;
			endTime = System.nanoTime();
		}	
	}

	public long getTime(){
		return (running)?(System.nanoTime() - startTime):(endTime - startTime);
	}

	public void printTime(){
		Print.sln("Elapsed time = "+getTime()+"ns = "+(0.000000001*getTime())+" seconds");
	}
} 