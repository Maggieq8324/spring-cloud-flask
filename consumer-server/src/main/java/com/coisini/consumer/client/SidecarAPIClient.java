package com.coisini.consumer.client;

import com.coisini.consumer.config.FeignConfigure;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="sidecar-server", configuration = FeignConfigure.class)
public interface SidecarAPIClient {
    
    @GetMapping("/getUser")
    Object getUser();
    
}
