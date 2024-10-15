package com.example.GoogleForm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usersdata {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String name;
	private String contact;
	private String alternatecontact;
	private String email;
	private String gender;
	private String city;
	private String college;
	private String percentage;
	private String iseducationgap;
	private String technology;
	private String company;
	private String ctc;
	private String state;
	private String project;
	private String institute;
	private String isshortlisted;
	private String isrelocate;
	private String isapply;
	
	
	public Usersdata() {}


	public Usersdata(int id, String name, String contact, String alternatecontact, String email, String gender,
			String city, String college, String percentage, String iseducationgap, String technology, String company,
			String ctc, String state, String project, String institute, String isshortlisted, String isrelocate,
			String isapply) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.alternatecontact = alternatecontact;
		this.email = email;
		this.gender = gender;
		this.city = city;
		this.college = college;
		this.percentage = percentage;
		this.iseducationgap = iseducationgap;
		this.technology = technology;
		this.company = company;
		this.ctc = ctc;
		this.state = state;
		this.project = project;
		this.institute = institute;
		this.isshortlisted = isshortlisted;
		this.isrelocate = isrelocate;
		this.isapply = isapply;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getAlternatecontact() {
		return alternatecontact;
	}


	public void setAlternatecontact(String alternatecontact) {
		this.alternatecontact = alternatecontact;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getPercentage() {
		return percentage;
	}


	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}


	public String getIseducationgap() {
		return iseducationgap;
	}


	public void setIseducationgap(String iseducationgap) {
		this.iseducationgap = iseducationgap;
	}


	public String getTechnology() {
		return technology;
	}


	public void setTechnology(String technology) {
		this.technology = technology;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getCtc() {
		return ctc;
	}


	public void setCtc(String ctc) {
		this.ctc = ctc;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getProject() {
		return project;
	}


	public void setProject(String project) {
		this.project = project;
	}


	public String getInstitute() {
		return institute;
	}


	public void setInstitute(String institute) {
		this.institute = institute;
	}


	public String getIsshortlisted() {
		return isshortlisted;
	}


	public void setIsshortlisted(String isshortlisted) {
		this.isshortlisted = isshortlisted;
	}


	public String getIsrelocate() {
		return isrelocate;
	}


	public void setIsrelocate(String isrelocate) {
		this.isrelocate = isrelocate;
	}


	public String getIsapply() {
		return isapply;
	}


	public void setIsapply(String isapply) {
		this.isapply = isapply;
	}


	@Override
	public String toString() {
		return "Usersdata [id=" + id + ", name=" + name + ", contact=" + contact + ", alternatecontact="
				+ alternatecontact + ", email=" + email + ", gender=" + gender + ", city=" + city + ", college="
				+ college + ", percentage=" + percentage + ", iseducationgap=" + iseducationgap + ", technology="
				+ technology + ", company=" + company + ", ctc=" + ctc + ", state=" + state + ", project=" + project
				+ ", institute=" + institute + ", isshortlisted=" + isshortlisted + ", isrelocate=" + isrelocate
				+ ", isapply=" + isapply + "]";
	}


	


	
	
	
}
