package com.example.persistence;

import com.example.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sabirov Jahongir
 **/
@Component
public class DbSeeder implements CommandLineRunner {

    @Autowired
    public HotelRepository hotelRepository;

    @Override
    public void run(String... args) throws Exception {
        hotelRepository.save(generateHOtel("jack",5,false));
        hotelRepository.save(generateHOtel("HayatRegency",4,true));
        hotelRepository.save(generateHOtel("Hilton",5,true));
    }

    private Hotel generateHOtel(String name, int classification, boolean openClose){
        Hotel hotel = new Hotel();
        hotel.setName(name);
        hotel.setClassification(classification);
        hotel.setOpen(openClose);
        return hotel;
    }
}
