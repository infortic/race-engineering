package com.race.domin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "with")
public class ListOfAllNationalities {

 
	 private String nationality;
	 private Integer wins;   
	 
	}
	

