package com.fsd.fsdfinal_backend.service;

import com.fsd.fsdfinal_backend.entity.Hotel;
import com.fsd.fsdfinal_backend.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    public Object getAllHotels(){
        return hotelRepository.findAll();
    }

    public Object saveHotel(Hotel hotel){
        return hotelRepository.save(hotel);
    }

    public Object updateHotel(Hotel hotel, Long hotelId){
        Optional<Hotel> hotel1 = hotelRepository.findById(hotelId);
        if(hotel1.isPresent()){
            Hotel hotelUpdated = hotel1.get();
            hotelUpdated.setIsactive(hotel.getIsactive());
            hotelUpdated.setCity(hotel.getCity());
            hotelUpdated.setDescription(hotel.getDescription());
            hotelUpdated.setEmail(hotel.getEmail());
            hotelUpdated.setGym(hotel.isGym());
//            hotelUpdated.setId(hotel.);
            hotelUpdated.setName(hotel.getName());
           return hotelRepository.save(hotelUpdated);
        }
        return null;

    }

    public Object deteleHotel(Long id){
        hotelRepository.deleteById(id);
//        Optional<Hotel> hotel = new hotelRepository.findById(id);
        return "Delete Successful";

    }
}
