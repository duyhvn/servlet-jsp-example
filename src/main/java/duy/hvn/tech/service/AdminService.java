package duy.hvn.tech.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private String location="Vietnam";
    private String city="Hue";
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