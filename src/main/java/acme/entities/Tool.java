/*
 * Consumer.java
 *
 * Copyright (C) 2012-2022 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;


import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tool extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(min = 0, max = 100)
	protected String name
	
	@Column(unique=true)
	@Pattern(regexp="^[A-Z]{3}-[0-9]{3}(-[A-Z])?$")
	protected String code;
	
	@NotBlank
	@Length(min = 0, max = 100)
	protected String technology
	
	@NotBlank
	@Length(min = 0, max = 255)
	protected String description;
	
	@Min(0)
	protected Double retailPrice;
	
	@URL
	protected String link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
