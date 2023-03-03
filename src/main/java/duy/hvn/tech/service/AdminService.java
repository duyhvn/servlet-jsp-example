package duy.hvn.tech.service;

import org.springframework.stereotype.Component;

@Component
public class AdminService {
    private String location="Mount Road";
    private String city="Chennai";
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}