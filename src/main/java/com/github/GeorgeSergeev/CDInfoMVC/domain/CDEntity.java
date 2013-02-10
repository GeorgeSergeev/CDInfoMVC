package com.github.GeorgeSergeev.CDInfoMVC.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CD")
public class CDEntity {
	
	@Id
	@Column(name="IDCD")
	@GeneratedValue
	private Integer idCD;
	public Integer getIdCD() {
		return idCD;
	}
	public void setIdCD(Integer idCD) {
		this.idCD = idCD;
	}
	@Column(name="TITLE")
	private String Title;
	@Column(name="ARTIST")
	private String Artist;
	@Column(name="COUNTRY")
	private String Country;
	@Column(name="COMPANY")
	private String  Company;
	@Column(name="PRICE")
	private Float  Price;
	@Column(name="YEAR")
	private Integer  Year;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		Artist = artist;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public Float getPrice() {
		return Price;
	}
	public void setPrice(Float price) {
		Price = price;
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer year) {
		Year = year;
	}
    
}
