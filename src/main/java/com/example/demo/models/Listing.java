package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by student on 6/21/17.
 */
@Entity
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Size(min=2, max=40)
    private String address;

    @NotNull
    @Size(min=2, max=40)
    private String City;

    @NotNull
    @Size(min=2, max=2)
    private String State;

    @NotNull
    private float price;

    @NotNull
    @Size(min=2, max=40)
    private String description;

    @NotNull
    @Size(min=2, max=40)
    private String rules;

    @NotNull
    @Size(min=2, max=3)
    private String wifi;

    @NotNull
    @Size(min=4, max=7)
    private String cable;

    @NotNull
    @Size(min=2, max=3)
    private String privateBathroom;

    @NotNull
    @Size(min=2, max=3)
    private String isRented;


    public Listing()
    {

    }







    @Override
    public String toString() {
        return "Listing{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", rules='" + rules + '\'' +
                ", wifi='" + wifi + '\'' +
                ", cable='" + cable + '\'' +
                ", privateBathroom='" + privateBathroom + '\'' +
                ", isRented='" + isRented + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public String getPrivateBathroom() {
        return privateBathroom;
    }

    public void setPrivateBathroom(String privateBathroom) {
        this.privateBathroom = privateBathroom;
    }

    public String getIsRented() {
        return isRented;
    }

    public void setIsRented(String isRented) {
        this.isRented = isRented;
    }
}
