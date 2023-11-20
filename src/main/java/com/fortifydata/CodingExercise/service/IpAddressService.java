package com.fortifydata.CodingExercise.service;

import com.fortifydata.CodingExercise.model.IpAddress;
import com.fortifydata.CodingExercise.repository.IpAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IpAddressService {

    @Qualifier
    private IpAddressRepository ipAddressRepository;

    public List<IpAddress> findAll() {
        return ipAddressRepository.findAll();
    }

    /* Call http://ip.jsontest.com/ and get IpAddress,
        use email part of request param to save entity*/
    public IpAddress save(String email) {
        return null;
    }
}
