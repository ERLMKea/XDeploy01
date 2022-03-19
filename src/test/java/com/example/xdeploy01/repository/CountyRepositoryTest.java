package com.example.xdeploy01.repository;

import com.example.xdeploy01.model.County;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CountyRepositoryTest {

    @Autowired
    CountyRepository countyRepository;

    @BeforeEach
    void beforeEach() {
        County county = new County();
        county.setName("Roskilde");
        county.setCountyCode("0265");
        county.setHref("http://localhost:8080/county/0265");
        countyRepository.save(county);
    }

    @Test
    void testFunc() {
        List<County> counties = countyRepository.findAll();
        Assertions.assertEquals(true, counties.size()>0);
    }


}