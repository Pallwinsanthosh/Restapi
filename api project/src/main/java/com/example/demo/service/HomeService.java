package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Home;
import com.example.demo.repository.HomeRepo;

@Service
public class HomeService {
    @Autowired
    HomeRepo homeRepo;

    public Home addservice(Home home)
    {
        return homeRepo.save(home);
    }

    public List<Home> getservice()
    {
        return homeRepo.findAll();
    }
    public Optional<Home> getserviceid(int id)
    {
        return homeRepo.findById(id);
    }

    public String del(int id)
    {
        homeRepo.deleteById(id);
        return("Service Data Removed Succesfully");
    }

    public Home put(int id,Home home)
    {
        Home homeValid=homeRepo.findById(id).orElse(null);
        if(homeValid!=null)
        {
            homeValid.setServiceId(home.getServiceId());
            homeValid.setServiceName(home.getServiceName());
            homeValid.setServicePrice(home.getServicePrice());
            homeValid.setDescription(home.getDescription());
            
            return homeRepo.saveAndFlush(homeValid);
        }
        else
        return null;
    }


}
