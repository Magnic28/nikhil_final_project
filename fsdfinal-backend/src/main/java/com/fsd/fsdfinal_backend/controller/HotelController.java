package com.fsd.fsdfinal_backend.controller;


import com.fsd.fsdfinal_backend.bean.GlobalResponseHandler;
import com.fsd.fsdfinal_backend.entity.Hotel;
import com.fsd.fsdfinal_backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/v1/hotels")
    public ResponseEntity<?> getAllHotels(){
//        return hotelService.getAllHotels();
    return GlobalResponseHandler.createResponse("SUCCESS",hotelService.getAllHotels(), HttpStatus.OK);
    }


    @PostMapping("/v1/hotels")
    public Object saveHotel(@RequestBody Hotel hotel){
        return hotelService.saveHotel(hotel);
    }

    @DeleteMapping("/v1/hotels/{id}")
    public Object deleteHotel(@PathVariable Long id){
        return hotelService.deteleHotel(id);
    }

    @PutMapping("/v1/hotels/{id}")
    public Object updateHotel(@PathVariable Long id, @RequestBody Hotel hotel){
        return hotelService.updateHotel(hotel,id);
    }

}
