package com.xpense.mvcweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "entry_date")
	private Date entrydate;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "month")
	private String month;
	
	@Column(name = "bill_img")
	private String bill_url;
	
	@Transient
	private MultipartFile file;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getBill_url() {
		return bill_url;
	}

	public void setBill_url(String bill_url) {
		this.bill_url = bill_url;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
}
