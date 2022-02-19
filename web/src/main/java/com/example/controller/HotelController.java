package com.example.controller;

import com.example.domain.Hotel;
import com.example.persistence.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Sabirov Jahongir
 **/

@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;
    
    @RequestMapping(value = "/hotels",method = RequestMethod.GET)
    public List<Hotel> getHotels(){
      return hotelRepository.findAll();
    }


}
