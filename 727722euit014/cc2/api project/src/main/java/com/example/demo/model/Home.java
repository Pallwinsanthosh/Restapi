package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name="HomeRenovation")
@Transactional
public class Home {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public int serviceId;
    public String serviceName;
    public String servicePrice;
    public String description;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id")
    List<Users> users=new ArrayList<>();
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
    public List<Users> getUsers() {
        return users;
    }
    public void setUsers(List<Users> users) {
        this.users = users;
    }
    

}
