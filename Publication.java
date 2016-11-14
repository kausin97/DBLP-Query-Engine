import java.util.Date;

public class Publication {
	
	String key = new String();
	String mDate = new String();
	String author = new String();
	String title = new String();
	String pages = new String();
	int year;
	int volume;
	String journal = new String();
	int number;
	String ee = new String();
	String url = new String();

	public void setKey(String x)
	{
		key=x;
	}
	public void setDate(String x)
	{
		mDate=x;
	}
	public void setAuthor(String x)
	{
		author=x;
	}
	public void setTitle(String x)
	{
		title=x;
	}
	public void setPages(String x)
	{
		pages=x;
	}
	public void setYear(int x)
	{
		year=x;
	}
	public void setVolume(int x)
	{
		volume=x;
	}
	public void setJournal(String x)
	{
		journal=x;
	}
	public void setNumber(int x)
	{
		number=x;
	}
	public void setEE(String x)
	{
		ee=x;
	}
	public void setURL(String x)
	{
		url=x;
	}
	
}
