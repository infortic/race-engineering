package com.race.domin.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "with")
public class TenRidersWhoDroveForTheMostTeams {

	private String driverId; 
	private String givenName; 
    private String familyName;
    private String dateOfBirth;
    private String nationality;
	private List<String> constructors;
}