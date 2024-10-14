package com.fsd.fsdfinal_backend.repository;

import com.fsd.fsdfinal_backend.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    @Override
    Optional<Hotel> findById(Long id);



}
