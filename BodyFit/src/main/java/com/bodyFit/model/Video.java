package com.bodyFit.model;

public class Video {
	private int idVideo;
	private String nameVideo;
	private String linkVideo;
	private String classVideo;
	private String blockVideo;
	private int fkIdCategory;
	public int getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(int idVideo) {
		this.idVideo = idVideo;
	}
	public String getNameVideo() {
		return nameVideo;
	}
	public void setNameVideo(String nameVideo) {
		this.nameVideo = nameVideo;
	}
	public String getLinkVideo() {
		return linkVideo;
	}
	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}
	public String getClassVideo() {
		return classVideo;
	}
	public void setClassVideo(String classVideo) {
		this.classVideo = classVideo;
	}
	public String getBlockVideo() {
		return blockVideo;
	}
	public void setBlockVideo(String blockVideo) {
		this.blockVideo = blockVideo;
	}
	public int getFkIdCategory() {
		return fkIdCategory;
	}
	public void setFkIdCategory(int fkIdCategory) {
		this.fkIdCategory = fkIdCategory;
	}
	
	
	



}
