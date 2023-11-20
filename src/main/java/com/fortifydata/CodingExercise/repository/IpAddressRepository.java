package com.fortifydata.CodingExercise.repository;

import com.fortifydata.CodingExercise.model.IpAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IpAddressRepository extends JpaRepository<IpAddress, Long> {


}
