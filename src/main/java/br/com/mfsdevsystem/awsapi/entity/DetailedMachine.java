package br.com.mfsdevsystem.awsapi.entity;

import java.io.Serializable;


public class DetailedMachine extends Machine implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String javaVersion;
	private String javaVendor;
	private String javaVendorUrl;
	
	
	public DetailedMachine() {
	}

	public DetailedMachine(String ip, String name, String os, String architecture, String osVersion, String javaVersion, String javaVendor, String javaVendorUrl) {
		super(ip, name, os, architecture, osVersion);

		this.javaVersion = javaVersion;
		this.javaVendor = javaVendor;
		this.javaVendorUrl = javaVendorUrl;
	}


	public String getJavaVersion() {
		return javaVersion;
	}


	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}


	public String getJavaVendor() {
		return javaVendor;
	}


	public void setJavaVendor(String javaVendor) {
		this.javaVendor = javaVendor;
	}


	public String getJavaVendorUrl() {
		return javaVendorUrl;
	}


	public void setJavaVendorUrl(String javaVendorUrl) {
		this.javaVendorUrl = javaVendorUrl;
	}

	
}
