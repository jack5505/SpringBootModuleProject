package com.example.persistence;

import com.example.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sabirov Jahongir
 **/
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
