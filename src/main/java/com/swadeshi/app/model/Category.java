package com.swadeshi.app.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cat_id;

    @ManyToOne
    @JoinColumn(name = "state_id", nullable = true)
    private State state;

    @Column
    private String catName;

    @Column
    private LocalDate add_date;

    @Column
    private LocalDate upd_date;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Sub_category> subCategories;

	public long getCat_id() {
		return cat_id;
	}

	public void setCat_id(long cat_id) {
		this.cat_id = cat_id;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getCat_name() {
		return catName;
	}

	public void setCat_name(String cat_name) {
		this.catName = cat_name;
	}

	public LocalDate getAdd_date() {
		return add_date;
	}

	public void setAdd_date(LocalDate add_date) {
		this.add_date = add_date;
	}

	public LocalDate getUpd_date() {
		return upd_date;
	}

	public void setUpd_date(LocalDate upd_date) {
		this.upd_date = upd_date;
	}

	public List<Sub_category> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<Sub_category> subCategories) {
		this.subCategories = subCategories;
	}

}
