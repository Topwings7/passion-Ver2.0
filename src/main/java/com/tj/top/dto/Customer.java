package com.tj.top.dto;

import java.sql.Date;

public class Customer {
	private String cid;
	private String cpass;
	private String cname;
	private String ctel;
	private String cadress;
	private Date crdate;
	public Customer() {
		super();
	}
	public Customer(String cid, String cpass, String cname, String ctel, String cadress, Date crdate) {
		super();
		this.cid = cid;
		this.cpass = cpass;
		this.cname = cname;
		this.ctel = ctel;
		this.cadress = cadress;
		this.crdate = crdate;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtel() {
		return ctel;
	}
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	public String getCadress() {
		return cadress;
	}
	public void setCadress(String cadress) {
		this.cadress = cadress;
	}
	public Date getCrdate() {
		return crdate;
	}
	public void setCrdate(Date crdate) {
		this.crdate = crdate;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cpass=" + cpass + ", cname=" + cname + ", ctel=" + ctel + ", cadress="
				+ cadress + ", crdate=" + crdate + "]";
	}
}
