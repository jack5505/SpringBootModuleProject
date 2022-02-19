package com.example.persistence;

import com.example.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sabirov Jahongir
 **/
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
