package com.example.Interview.Task1;

import javax.persistence.*;
import java.util.List;
import java.util.Map;;

@Entity
public class Product {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String description;
	private double price;
	
	@ElementCollection
	@CollectionTable(name = "product_categories", joinColumns = @JoinColumn(name="product_id"))
	@Column
	private List<String> categories;
	
	@ElementCollection
	@CollectionTable(name = "product_attributes", joinColumns = @JoinColumn(name="product_id"))
	@MapKeyColumn(name="attribute_key")
	@Column(name = "attribute_value")
	private Map<String, String> attributes;
	
	@Embedded
	private Availability availability;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private List<Rating> ratings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public java.util.List<String> getCategories() {
		return categories;
	}

	public void setCategories(java.util.List<String> categories) {
		this.categories = categories;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
  }




	

