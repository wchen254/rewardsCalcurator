package com.example.service.rewardCalcurator.model;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class Reward {

	@JsonInclude
	@Transient
	protected Double points;

	public abstract Double getPoints();

}
