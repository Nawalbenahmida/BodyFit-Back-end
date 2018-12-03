package com.bodyFit.model;

public class Video {
	private int id_video;
	private String name_video;
	private String link_video;
	private Category category;
	
	public void setId_video(int id_video) {
		this.id_video = id_video;
	}

	public int getId_video() {
		return id_video;
	}
	
	public void setName_video(String name_video) {
		this.name_video = name_video;
	}
	
	public String getName_video() {
		return name_video;
	}
	
	public void setLink_video(String link_video) {
		this.link_video = link_video;
	}
	
	public String getLink_video(){
		return link_video;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return category;
	}
	


}
