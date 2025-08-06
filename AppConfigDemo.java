class AppConfig{
	static String appName;
	static{
		appName="MyApp";
		System.out.println("static block exceuted");
	}
	static void ShowAppName(){
		System.out.println("App Name"+appName);
	}
}
public class AppConfigDemo{
	public static void main(String args[]){
		AppConfig.ShowAppName();
	}
}
