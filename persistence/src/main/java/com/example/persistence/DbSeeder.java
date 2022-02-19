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
        List<Hotel> list = new ArrayList<>();
        list.add(generateHOtel("jack",5,false));
        list.add(generateHOtel("HayatRegency",4,true));
        list.add(generateHOtel("Hilton",5,true));
        hotelRepository.saveAll(list);
    }

    private Hotel generateHOtel(String name, int classification, boolean openClose){
        Hotel hotel = new Hotel();
        hotel.setName(name);
        hotel.setClassification(classification);
        hotel.setOpen(openClose);
        return hotel;
    }
}
