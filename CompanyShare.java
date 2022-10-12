package com.gl.caseStudy3.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyShare {
	
	@Id
	private Long companyId;
	private String companyName;
	private Double sharePrice;
	
	public CompanyShare() {
		super();
	
	}

	public CompanyShare(Long companyId, String companyName, Double sharePrice) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.sharePrice = sharePrice;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
}
