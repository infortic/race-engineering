package com.race.domin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "with")
public class PilotsWithVictory {
	
	private String driverId;
	private String givenName;
	private String familyName;
	private String  dateOfBirth;
	private String nationality;
	private Integer wins;

}
