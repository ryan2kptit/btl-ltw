package com.example.btlltw.controller;


import com.example.btlltw.service.RouteService;
import com.example.btlltw.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salarys")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;

    @GetMapping(params = "id")
    public ResponseEntity<?> getSalaryById(@RequestParam(name = "id") int id){
        return new ResponseEntity<>(salaryService.getSalaryById(id), HttpStatus.OK);
    }
}
