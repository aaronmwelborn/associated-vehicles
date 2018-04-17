package com.example.associatedvehicles.resource;

import com.example.associatedvehicles.entity.MemberVehicles;
import com.example.associatedvehicles.entity.Vehicle;
import com.example.associatedvehicles.repository.AssociatedVehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AssociatedVehiclesResource {

    private final
    MongoOperations mongoOperations;

    @Autowired
    public AssociatedVehiclesResource(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    @PostMapping("/{memberId}/newVehicle")
    public ResponseEntity saveVehicle(@PathVariable("memberId") String memberId,
                                      @RequestBody Vehicle requestVehicle) {

        Query query = new Query(Criteria.where("memberId").is(memberId));
        MemberVehicles selectedMember = mongoOperations.findOne(query, MemberVehicles.class);
        List<Vehicle> vehicles = selectedMember.getVehicles();

        //TODO: Add logic to find image from google

        vehicles.add(requestVehicle);

        mongoOperations.save(selectedMember);

        return ResponseEntity.ok("Vehicle successfully saved");
    }
}
