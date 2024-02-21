package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="HomeRenovation")
public class Home {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public int serviceId;
    public String serviceName;
    public String servicePrice;
    public String description;
    public int getServiceId() {
        return serviceId;
    }
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getServicePrice() {
        return servicePrice;
    }
    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
 
    // public Home(int serviceId, String serviceName, String servicePrice, String description) {
    //     this.serviceId = serviceId;
    //     this.serviceName = serviceName;
    //     this.servicePrice = servicePrice;
    //     this.description = description;
    // }
}
