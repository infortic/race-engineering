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
public class QualifyingEntity {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
	
	private Long qualifyId;
	private Long raceId;
	private Long drieId;
	private Long constructionId;
	private String number;
	private String position;
	private String q1;
	private String q2;
	private String q3;
	
}
