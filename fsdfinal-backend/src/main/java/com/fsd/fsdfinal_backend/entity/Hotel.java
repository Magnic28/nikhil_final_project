package com.fsd.fsdfinal_backend.entity;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String name;

//    @Column
    private Long roomPrice;

    @Column(length = 10000)
    private String imageUrl;

    @Column(length = 200)
    private String description;

//    @Column()
    private Float rating;

    private String city;

//    (regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    private String email;

    private boolean wifi;

    private boolean gym;

    private boolean pool;

    private Long isactive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Long roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public Long getIsactive() {
        return isactive;
    }

    public void setIsactive(Long isactive) {
        this.isactive = isactive;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomPrice=" + roomPrice +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", wifi=" + wifi +
                ", gym=" + gym +
                ", pool=" + pool +
                ", isactive=" + isactive +
                '}';
    }
}
