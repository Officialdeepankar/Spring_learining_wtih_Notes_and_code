package com.Spring.DeleteXML;
import org.springframework.beans.factory.annotation.Value;
public class Address {

	
	@Value("Delhi")
	private String city;
	
	
	public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
}
