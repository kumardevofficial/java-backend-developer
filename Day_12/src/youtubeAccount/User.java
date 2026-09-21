package youtubeAccount;

public class User {
	
	public static void main(String args[])
	{
		YoutubeAccount ya = new YoutubeAccount();
		System.out.println(ya.showUserName());
		System.out.println(ya.email);
		System.out.println(ya.showPassword());
		System.out.println(ya.subscriberCount);
		System.out.println(ya.channelName);
	}
}
