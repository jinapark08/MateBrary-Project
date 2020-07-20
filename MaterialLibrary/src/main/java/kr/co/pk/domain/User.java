package kr.co.pk.domain;

import java.util.Date;

	public class User {
		// user공통사항
		// 일련번호,아이디,비밀번호,가입날짜,마지막로그인날짜,수정날짜
		private int userNo;
		private String userId;
		private String userPw;
		private Date userDate;
		private Date userLastdate;
		private Date userUpdate;

		public int getUserNo() {
			return userNo;
		}

		public void setUserNo(int userNo) {
			this.userNo = userNo;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserPw() {
			return userPw;
		}

		public void setUserPw(String userPw) {
			this.userPw = userPw;
		}

		public Date getUserDate() {
			return userDate;
		}

		public void setUserDate(Date userDate) {
			this.userDate = userDate;
		}

		public Date getUserLastdate() {
			return userLastdate;
		}

		public void setUserLastdate(Date userLastdate) {
			this.userLastdate = userLastdate;
		}

		public Date getUserUpdate() {
			return userUpdate;
		}

		public void setUserUpdate(Date userUpdate) {
			this.userUpdate = userUpdate;
		}

		@Override
		public String toString() {
			return "User [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userDate=" + userDate
					+ ", userLastdate=" + userLastdate + ", userUpdate=" + userUpdate + "]";
		}

	}

