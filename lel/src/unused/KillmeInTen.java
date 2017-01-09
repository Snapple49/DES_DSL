package unused;

import root.Mission;

public class KillmeInTen extends Thread{
	int timeToLive;
	Mission mission;
	public KillmeInTen(Mission m){
		timeToLive = 10000;
		mission = m;
	}
	
	public void run(){
		try {
			Thread.sleep(timeToLive);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mission.StopArbitrator();
		
	}
}
