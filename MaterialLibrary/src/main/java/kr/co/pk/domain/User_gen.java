package kr.co.pk.domain;

import java.util.Date;

public abstract class User_gen extends User {
	// user 일반회원가입
	// 이름,닉네임,생년월일,전화번호,소속회사
	private String genName;
	private String genNickname;
	private Date genBirth;
	private String genPhone;
	private String genCompany;

	public String getGenName() {
		return genName;
	}

	public void setGenName(String genName) {
		this.genName = genName;
	}

	public String getGenNickname() {
		return genNickname;
	}

	public void setGenNickname(String genNickname) {
		this.genNickname = genNickname;
	}

	public Date getGenBirth() {
		return genBirth;
	}

	public void setGenBirth(Date genBirth) {
		this.genBirth = genBirth;
	}

	public String getGenPhone() {
		return genPhone;
	}

	public void setGenPhone(String genPhone) {
		this.genPhone = genPhone;
	}

	public String getGenCompany() {
		return genCompany;
	}

	public void setGenCompany(String genCompany) {
		this.genCompany = genCompany;
	}

	@Override
	public String toString() {
		return "User_gen [genName=" + genName + ", genNickname=" + genNickname + ", genBirth=" + genBirth
				+ ", genPhone=" + genPhone + ", genCompany=" + genCompany + "]";
	}
}
