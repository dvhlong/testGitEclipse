package FTA;
public class PersonS{
	private String msv;
	private String ho;
	private String ten;
	private String ngaySinh;
	private String noiSinh;
	private String gioiTinh;
	private String queQuan;
	public PersonS(String msv,String ho,String ten,String ngaySinh,String noiSinh,String gioiTinh,String queQuan) {
		this.msv=msv;
		this.ho=ho;
		this.ten=ten;
		this.ngaySinh=ngaySinh;
		this.noiSinh=noiSinh;
		this.gioiTinh=gioiTinh;
		this.queQuan=queQuan;
	}
	public static PersonS parse(String strsplit) {
		String s[]=strsplit.split("\\|");
		PersonS p=new PersonS(s[0],s[1],s[2],s[3],s[4],(s[5].equals("1"))?"Nam":"Nu",s[6]);
		return p;
	}
	public String getMsv() {
		return msv;
	}
	public String getHo() {
		return ho;
	}
	public String getTen() {
		return ten;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public String getNoiSinh() {
		return noiSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s",getMsv(),getHo(),getTen(),getNgaySinh(),getNoiSinh(),getGioiTinh(),getQueQuan());
	}
} 