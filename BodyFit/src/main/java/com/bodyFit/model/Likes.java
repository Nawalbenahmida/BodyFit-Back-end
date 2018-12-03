package com.bodyFit.model;

public class Likes {
	private int fk_id_user ;
	private int fk_id_video;
	private Video video;
	private Users users;
	
	public void setFk_id_user(int fk_id_user) {
		this.fk_id_user = fk_id_user;
	}
	
	public int getFk_id_user() {
		return fk_id_user;
	}
	
	public void setFk_id_video(int fk_id_video) {
		this.fk_id_video = fk_id_video;
	}
	
	public int getFk_id_video() {
		return fk_id_video;
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
