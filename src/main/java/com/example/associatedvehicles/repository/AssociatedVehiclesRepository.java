package com.example.associatedvehicles.repository;

import com.example.associatedvehicles.entity.MemberVehicles;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "vehicleRepo", path = "vehicleRepo")
public interface AssociatedVehiclesRepository extends MongoRepository<MemberVehicles, String> {
    List<MemberVehicles> findByMemberId(@Param("memberId") String memberId);
}
