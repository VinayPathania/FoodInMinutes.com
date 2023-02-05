package com.foodinminutes.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CurrentLoginSession {
	
	@Id
	@Column(unique =  true)
	private Integer userId;
	
	private String uuid;
	
	private LocalDateTime localDateTime;
	
	
	

}
