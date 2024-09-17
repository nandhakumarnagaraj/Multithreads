
public class ThreadTwo extends Thread {

	private MyApp app;
	
	ThreadTwo(MyApp app)
	{
		this.app = app;
	}
	
	public void run()
	{
		String result="";
		int n = Integer.valueOf(app.txt2.getText());
		for(int i=1;i<=20;i++)
		{
			result= app.txt4.getText();
			result+=i+"x"+n+"="+i*n+"\n";
			try {sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			app.txt4.setText(result);
		}
	}
}
