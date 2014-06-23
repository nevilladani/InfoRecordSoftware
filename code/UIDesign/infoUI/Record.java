package infoUI;

public class Record {


	private String Fname;
	private String Lname;
	private String MName;
	private String Add1;
	private String Add2;
	private String City;
	private String State;
	private String Zip;
	private String Ph;
	private String Cntry;
	private String Eml;

	public Record(String fname, String mName, String lname, String add1,
			String add2, String city, String state, String zip, String ph, String cntry, String eml) {
		super();
		Fname = fname;
		Lname = lname;
		MName = mName;
		Add1 = add1;
		Add2 = add2;
		City = city;
		State = state;
		Zip = zip;
		Ph = ph;
		Cntry = cntry;
		Eml = eml;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public String getAdd1() {
		return Add1;
	}
	public void setAdd1(String add1) {
		Add1 = add1;
	}
	public String getAdd2() {
		return Add2;
	}
	public void setAdd2(String add2) {
		Add2 = add2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getPh() {
		return Ph;
	}
	public void setPh(String ph) {
		Ph = ph;
	}
	public String getCntry() {
		return Cntry;
	}
	public void setCntry(String cntry) {
		Cntry = cntry;
	}
	public String getEml() {
		return Eml;
	}
	public void setEml(String eml) {
		Eml = eml;
	}
	


}
