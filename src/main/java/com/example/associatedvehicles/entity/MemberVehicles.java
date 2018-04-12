package com.example.associatedvehicles.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "memberVehicles")
public class MemberVehicles {
    @Id
    private String id;

    private String memberId;
    private List<Vehicle> vehicles;

    public MemberVehicles(String memberId, List<Vehicle> vehicles) {
        this.memberId = memberId;
        this.vehicles = vehicles;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
