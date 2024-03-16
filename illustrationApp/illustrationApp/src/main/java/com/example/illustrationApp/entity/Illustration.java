package com.example.illustrationApp.entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="illustration")
@Data
public class Illustration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "image_name")
	private String imageName;
	
	@ManyToOne
	@JoinColumn(name = "category_a")
	private Category categoryA;
	
	@ManyToOne
	@JoinColumn(name = "category_b")
	private Category categoryB;
	
	@ManyToOne
	@JoinColumn(name = "category_c")
	private Category categoryC;
	
	@ManyToOne
	@JoinColumn(name = "category_d")
	private Category categoryD;
	
	@ManyToOne
	@JoinColumn(name = "category_e")
	private Category categoryE;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "finish_date")
	private Date finishDate;
	
	@Column(name = "created_at", insertable = false, updatable = false)
	private Timestamp createdAt;
	
	@Column(name = "updated_at", insertable = false, updatable = false)
	private Timestamp updatedAt;
	
	public void setCategoryA(Category categoryA) {
        this.categoryA = categoryA;
    }

    public void setCategoryB(Category categoryB2) {
        this.categoryB = categoryB2;
    }

    public void setCategoryC(Category categoryC) {
        this.categoryC = categoryC;
    }

    public void setCategoryD(Category categoryD) {
        this.categoryD = categoryD;
    }

    public void setCategoryE(Category categoryE) {
        this.categoryE = categoryE;
    }
}
