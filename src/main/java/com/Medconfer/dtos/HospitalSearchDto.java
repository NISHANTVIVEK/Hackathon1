package com.Medconfer.dtos;

public class HospitalSearchDto {
	private Long treatementId;
	private Long price;
	private String locationCode;
	private Long sortId;
	public Long getTreatementId() {
		return treatementId;
	}
	public void setTreatementId(Long treatementId) {
		this.treatementId = treatementId;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public Long getSortId() {
		return sortId;
	}
	public void setSortId(Long sortId) {
		this.sortId = sortId;
	}
}
