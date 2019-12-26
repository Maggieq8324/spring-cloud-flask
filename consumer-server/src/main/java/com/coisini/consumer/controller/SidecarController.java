package com.coisini.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coisini.consumer.client.SidecarAPIClient;


@RestController
public class SidecarController {
	
    private SidecarAPIClient sidecarAPIClient;
    
    @Autowired
    public SidecarController(SidecarAPIClient sidecarAPIClient) {
        this.sidecarAPIClient = sidecarAPIClient;
    }
    
    @GetMapping("/getUser")
    public Object getUser() {
    	return this.sidecarAPIClient.getUser();
    }

}
