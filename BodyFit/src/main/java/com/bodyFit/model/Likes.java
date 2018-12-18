package com.bodyFit.model;

public class Likes {
	private int fkIdUser ;
	private int fkIdVideo;
	private Video video;
	private Users users;
	
	public void setFkIdUser(int fkIdUser) {
		this.fkIdUser = fkIdUser;
	}
	
	public int getFkIdUser() {
		return fkIdUser;
	}
	
	public void setFkIdVideo(int fkIdVideo) {
		this.fkIdVideo = fkIdVideo;
	}
	
	public int getFkIdVideo() {
		return fkIdVideo;
	}
	
	public void setVideo(Video video) {
		this.video = video;
	}
	
	public Video getVideo() {
		return video;
	}
	
	public void setUsers(Users users) {
		this.users = users;
	}
	
	public Users getUsers() {
		return users;
	}

}
