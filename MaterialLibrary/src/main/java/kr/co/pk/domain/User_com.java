package kr.co.pk.domain;

public abstract class User_com extends User {
	// user 기업회원 회원가입
	// 회사이름,사업자등록번호,대표번호,회사주소,담당자이름,담당자전화번호,담당자메일주소
	private String comName;
	private int comLicense;
	private String comPhone;
	private String comAddr;
	private String comSite;
	private String com_mgrName;
	private String com_mgrPhone;
	private String com_mgrMail;

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public int getComLicense() {
		return comLicense;
	}

	public void setComLicense(int comLicense) {
		this.comLicense = comLicense;
	}

	public String getComPhone() {
		return comPhone;
	}

	public void setComPhone(String comPhone) {
		this.comPhone = comPhone;
	}

	public String getComAddr() {
		return comAddr;
	}

	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}

	public String getComSite() {
		return comSite;
	}

	public void setComSite(String comSite) {
		this.comSite = comSite;
	}

	public String getCom_mgrName() {
		return com_mgrName;
	}

	public void setCom_mgrName(String com_mgrName) {
		this.com_mgrName = com_mgrName;
	}

	public String getCom_mgrPhone() {
		return com_mgrPhone;
	}

	public void setCom_mgrPhone(String com_mgrPhone) {
		this.com_mgrPhone = com_mgrPhone;
	}

	public String getCom_mgrMail() {
		return com_mgrMail;
	}

	public void setCom_mgrMail(String com_mgrMail) {
		this.com_mgrMail = com_mgrMail;
	}

	@Override
	public String toString() {
		return "user_com [comName=" + comName + ", comLicense=" + comLicense + ", comPhone=" + comPhone + ", comAddr="
				+ comAddr + ", comSite=" + comSite + ", com_mgrName=" + com_mgrName + ", com_mgrPhone=" + com_mgrPhone
				+ ", com_mgrMail=" + com_mgrMail + "]";
	}
}
