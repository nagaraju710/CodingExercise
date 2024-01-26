package com.fortifydata.CodingExercise.controller;


import com.fortifydata.CodingExercise.model.IpAddress;
import com.fortifydata.CodingExercise.service.IpAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ip-addresses")
public class UserController {

    @Autowired
    private IpAddressService ipAddressService;

    @GetMapping
    public List<IpAddress> getAll() {
        return ipAddressService.findAll();
    }

    @PatchMapping("/save")
    public IpAddress save(@RequestParam String email) {
        // TODO: validate email pattern
        return ipAddressService.save(email);
    }
}
