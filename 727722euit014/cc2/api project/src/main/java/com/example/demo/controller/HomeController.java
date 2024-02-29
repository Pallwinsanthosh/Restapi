package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Home;
import com.example.demo.service.HomeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class HomeController {
    @Autowired

    HomeService homeService;
    @PostMapping("/addservice")
    public ResponseEntity<Home> PostMethod(@RequestBody Home home)
    {
        return new ResponseEntity<>(homeService.addservice(home),HttpStatus.CREATED);
    }
     
    @GetMapping("/getservice")
    public ResponseEntity<List<Home>> getMethod()
    {
        return new ResponseEntity<>(homeService.getservice(),HttpStatus.OK);
    }

    @GetMapping("/getserviceid/{serviceId}")
    public ResponseEntity<Optional<Home>> getById(@PathVariable int serviceId)
    {
        return new ResponseEntity<>(homeService.getserviceid(serviceId),HttpStatus.OK);
    }
    
    @DeleteMapping("/deleteservice/{serviceId}")
    public String detMethod(@PathVariable int serviceId)
    {
        return homeService.del(serviceId);
    }

     

    @PutMapping("/putservice/{serviceId}")
    public Home putMethod(@PathVariable int serviceId, @RequestBody Home h) {
        return homeService.put(serviceId,h);
    }

    @GetMapping("/page/{pageNo}/{pageSize}")
    public List<Home> getMethodName(@PathVariable int pageNo,@PathVariable int pageSize)
     {
        return homeService.getPage(pageNo,pageSize);
    }

    @GetMapping("/sort/{field}")
    public List<Home> getMe(@PathVariable String field) {
        return homeService.getSort(field);
    }

    @GetMapping("/pageandsort/{pageNo}/{pageSize}/{field}")
    public List<Home> getMethodName(@PathVariable int pageNo,@PathVariable int pageSize,@PathVariable String field) {
        return homeService.PageandSort(pageNo, pageSize, field);
    }
    
    
    

    
}
