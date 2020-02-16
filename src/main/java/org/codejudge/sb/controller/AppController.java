package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;

import org.codejudge.sb.entity.NumberService;
import org.codejudge.sb.entity.Numbers;
import org.codejudge.sb.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

	@Autowired
	NumberService  numberService;
	
    @ApiOperation("This is the hello world api")
    @GetMapping("/")
    public String hello() {
        return "Hello World!!";
    }
    
    
    @ApiOperation("This Api Sum 2 numbers")
    @RequestMapping(method = RequestMethod.POST, value = "/api/add")
	public ResponseEntity<?> addTwoNumbers(@RequestBody Numbers number) {
    	
    	Response response = new Response(numberService.calculateSum(number.getNumber1(), number.getNumber2()));
    	
		return new ResponseEntity<>(response, null, HttpStatus.OK);
    	
    }

}
