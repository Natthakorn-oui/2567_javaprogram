
public class Smartphone {
	private String brand ;
	private String model ;
	private int storageCapacity ;
	private int MAX_STORAGE_CAPACITY = 512 ;
	
	public String getBrand(String brand) {
		return this.brand;
	}
	public String getModel(String model) {
		return this.model;
	}
	public int getStorageCapacity(int MAX_STORAGE_CAPACITY) {
		return this.MAX_STORAGE_CAPACITY;
	}
	public void setBrand(String brand) {
		int count =0;
		for(int i =1; i < brand.length() ; i++) {
			count++;
		}
		if(count<2) {
			System.out.println("Error Brand must have at least 2 characters!");
		}
		else {
			this.brand = brand;
		}
	}
	public void setModel(String model) {
		int count =0;
		for(int i =1; i < model.length() ; i++) {
			count++;
		}
		if(count<2) {
			System.out.println("Error Model must have at least 2 characters!");
		}
		else {
			this.model = model;
		}
	}
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity<1 || storageCapacity>512) {
			System.out.println("\"Error: Storage capacity must be between " + "1 and 512 GB!");
		}
		else {
			this.storageCapacity = storageCapacity;
		}
	}
	 public void increaseStorage(int additionalStorage) {
	        if (storageCapacity + additionalStorage > MAX_STORAGE_CAPACITY) {
	            System.out.println("Error: Storage capacity cannot exceed "+ "512 GB!");
	            return;
	        }
	        if (additionalStorage < 1) {
	            System.out.println("Error: Additional storage must be positive!");
	            return;
	        }
	        storageCapacity += additionalStorage;
	    }
	    public int getRemainingStorage(int usedStorage) {
	        if (usedStorage < 0 || usedStorage > storageCapacity) {
	            System.out.println("Error: Used storage must be between 0 and "+storageCapacity+" GB!");
	            return -1;
	        }
	        return storageCapacity - usedStorage;
	    }
	    public void printDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Storage Capacity: " + storageCapacity + " GB");
	    }
	
	
	
}
