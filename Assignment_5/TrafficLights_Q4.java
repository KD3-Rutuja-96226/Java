enum Traffic{
	RED(10),GREEN(20),YELLOW(30);
	
	
	private Traffic(int duration)
	{
		this.duration=duration;
	}
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
}
public class TrafficLights {
public static void main(String[] args) {
	Traffic r=Traffic.RED;
	int red_duration=r.getDuration();
	System.out.println(r);
	System.out.println("Duration : "+red_duration);
	
	Traffic g=Traffic.GREEN;
	int Green_duration=g.getDuration();
	System.out.println(g);
	System.out.println("Duration : "+Green_duration);
	
	Traffic y=Traffic.YELLOW;
	int yellow_duration=y.getDuration();
	System.out.println(y);
	System.out.println("Duration : "+yellow_duration);
	
	
	
}
}
