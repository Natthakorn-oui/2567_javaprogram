
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car(){
		companyName = "Unknow";
		modelName = "Unkonw";
		year = 2000;
		mileage = 0.0;
		//this.("Unkonw","Unkonw",2000,0.0);
	}
	//paramitersize construtor
	Car(String companyName, String modleName, int year, double mileage){
		this.companyName = companyName;
		this.modelName = modleName;
		this.year = year < 1886 ? 2000:year;
		this.mileage = mileage;
	}
	public void setcompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}
		else {
			System.out.println("Error : invalid company or model name!");
		}
	}
	public void setmodelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}
		else {
			System.out.println("Error : invalid company or model name!");
		}
	}
	public void setyear(int yaer) {
		if(yaer < 1886) {
			System.out.println("Error : invalid yaer!");
			this.year = yaer;
		}
		else {
			this.year = yaer;
		}
	}
	public void getmileage(double mileage) {
		this.mileage = mileage;
	}
	public String toString() {
		return "Company Name : " + companyName + "\nModel Name : " + modelName + "\nYear : " + year + "\nMileage : " + mileage;
	}
	public String showData() {
		return "Company Name : " + companyName + "\nModel Name : " + modelName + "\nYear : " + year;
	}
}
