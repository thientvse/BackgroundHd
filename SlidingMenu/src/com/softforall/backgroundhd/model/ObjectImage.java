package com.softforall.backgroundhd.model;

public class ObjectImage {
	private String imageIcon;
	private String title;
	private String countTilte;
	
	
	
	

	public ObjectImage(String imageIcon, String title, String countTilte) {
		super();
		this.imageIcon = imageIcon;
		this.title = title;
		this.countTilte = countTilte;
	}

	public String getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(String imageIcon) {
		this.imageIcon = imageIcon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCountTilte() {
		return countTilte;
	}

	public void setCountTilte(String countTilte) {
		this.countTilte = countTilte;
	}

}
