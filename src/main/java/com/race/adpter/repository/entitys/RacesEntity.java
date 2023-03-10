package com.race.adpter.repository.entitys;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice.Return;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "with")
public class RacesEntity {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
	
	private Long raceId;
	private Long driverId;
	private String yearTextss;
	private Integer round;
	private Long circuitId;
	private String name;
	private String date;
	private String time;
	private String url;
	private String fp1Date;
	private String fp1Time;
	private String fp2Date;
	private String fp2Time;
	private String fp3Date;
	private String fp3Time;
	private String qualiDate;
	private String qualiTime;
	private String sprintDate;
	private String sprintTime;
}
