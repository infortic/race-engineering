
package com.race.adpter.repository.entitys;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
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
public class PitStopsEntity {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
	
	private Long raceId;
	private Long driverId;
	private Integer Stop;
	private Integer lap; 
	private String time;
	private String duration;
	private Integer milliseconds;
	
	
}
