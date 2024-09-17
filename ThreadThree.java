
public class ThreadThree extends Thread {

	private MyApp app;
	
	ThreadThree(MyApp app)
	{
		this.app = app;
	}
	
	public void run()
	{
		String result="";
		int n = Integer.valueOf(app.txt2.getText());
		for(int i=1;i<=20;i++)
		{
			result= app.txt5.getText();
			result+=i+"x"+n+"="+i*n+"\n";
			try {sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			app.txt5.setText(result);
		}
	}
}
