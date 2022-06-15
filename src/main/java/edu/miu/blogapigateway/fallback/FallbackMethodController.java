package edu.miu.blogapigateway.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "User service is taking longer than expected. Please try again later";
    }

    @GetMapping("/postServiceFallback")
    public String postServiceFallbackMethod(){
        return "Post service is taking longer than expected. Please try again later";
    }

    @GetMapping("/commentServiceFallback")
    public String commentServiceFallbackMethod(){
        return "Comment service is taking longer than expected. Please try again later";
    }
}
