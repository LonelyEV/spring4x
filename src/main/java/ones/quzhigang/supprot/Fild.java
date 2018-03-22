package ones.quzhigang.supprot;


/**
 * 
 * ClassName: Fild <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年3月21日 下午3:02:13 <br/>
 *
 * @author 屈志刚  
 * @version 
 * @since JDK 1.7
 */
public   class Fild  {

	private String type;  //字段类型 String
	private String fild;   //字段   userName 
	private String property;  //属性  UserName  
	private String columnName;//原始列名
	
	
	
	public Fild(String type, String fild, String property, String columnName) {
		super();
		this.type = type;
		this.fild = fild;
		this.property = property;
		this.columnName = columnName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFild() {
		return fild;
	}
	public void setFild(String fild) {
		this.fild = fild;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	
	

	
	
}