package com.teamtemplate.io.Metadata;

public class PlayerMetadataJob { //klasse zum einfügen der metadata
								 //string muss dann in jobliste geändert werden

	private int xp = 0;
	private String job = "";
	
	
	public PlayerMetadataJob(int xp, String job) {
		this.xp = xp;
		this.job = job;
	}
	
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	
	public String getJob(){
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void addXp(int amount) {
		xp+=amount;
	}
}
