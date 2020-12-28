package com.tj.top.dto;

public class Master {
	private String mid;
	private String mpass;
	public Master() {
	}
	public Master(String mid, String mpass) {
		this.mid = mid;
		this.mpass = mpass;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpass() {
		return mpass;
	}
	public void setMpass(String mpass) {
		this.mpass = mpass;
	}
	@Override
	public String toString() {
		return "Master [mid=" + mid + ", mpass=" + mpass + "]";
	}
}
