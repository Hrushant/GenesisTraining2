public class SoftwareEnggTest {

	public static void main(String[] args) {

		SoftwareEngg softwareEngg = new SoftwareEngg();
		softwareEngg.setName("Hrushant");
		System.out.println(softwareEngg.name + " is a software engineering");

		Application app = new Application("VSCode");
		System.out.println("He is using " + app.appName + " for creating application");

		Laptop lap = new Laptop();
		lap.setOperatingSystem("Windows");
		lap.setRAM(8);
		lap.details();

		app.executeCode();

		CreateApp createApp = new CreateApp(app);
		createApp.solveProblem();

		lap.closeApp();
	}

}

class Software {

}

class Laptop {
	String operatingSystem; // hasA
	int RAM; // hasA
	Software software = new Software(); // hasA

	void details()
	{
		System.out.println("Laptop's OS : "+operatingSystem);
		System.out.println("Laptop's RAM : "+RAM);
		System.out.println("Now application is ready...");
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	void closeApp() {
		System.out.println("Application is Created...");
	}

}

class Person {
	char gender;
	int age;
	String name;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class SoftwareEngg extends Person // isA
{
	Laptop lap1 = new Laptop();// hasA

	// passing object as an argument knowsn as UsesA
	CreateApp execute(Application a) {

		CreateApp createApp = new CreateApp(a);
		return createApp; // ProducesA
	}
}

class CreateApp {
	Application a;

	public CreateApp(Application a) {
		this.a = a;
	}

	void solveProblem() {
		System.out.println("Problem will be solved on " + a.appName);
	}
}

class Application {
	String appName;

	public Application(String appName) {
		this.appName = appName;
	}

	void executeCode() {
		System.out.println("The code will be running on " + appName);
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
