package ca.demo.libraries;

public class Libraries {

	private String nameLibraries;
	private String sizeLibraries;

	public Libraries(String nameLibraries, String sizeLibraries) {
		super();
		this.nameLibraries = nameLibraries;
		this.sizeLibraries = sizeLibraries;
	}

	public String getNameLibraries() {
		return nameLibraries;
	}

	public void setNameLibraries(String nameLibraries) {
		this.nameLibraries = nameLibraries;
	}

	public String getSizeLibraries() {
		return sizeLibraries;
	}

	public void setSizeLibraries(String sizeLibraries) {
		this.sizeLibraries = sizeLibraries;
	}

}
