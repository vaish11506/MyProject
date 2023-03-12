package programmingMethod;

public class Student {
    //private int rollNum;
	private String name;
    private String clgName;
    private String city;
    private double percentage;

    public Student(){

    }

    /*public Student(String name, String clgName, String city, double percentage)
    {
        //this.rollNum=rollNum;
        this.name = name;
        this.clgName = clgName;
        this.city = city;
        this.percentage = percentage;
    }*/

    public Student(String name,/*String gender,int age,*/String clgName, String city, double percentage) 
    {
        //this.rollNum = rollNum;
    	this.name = name;
    	//this.gender=gender;
    	//this.age=age;
        this.name = name;
        this.clgName = clgName;
        this.city = city;
        this.percentage = percentage;
    }
   

    /*public int getRollNum() 
    {
        return rollNum;
    }
    
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*public String getGender()
    {
        return gender;	
    }
    public void setGender(String gender)
    {
    	this.gender=gender;
    }
    public int getAge()
    {
    	return age;	
    }
    public void setAge(int age)
    {
    	this.age=age;
    }
     */
    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                 ", clgName='" + clgName + '\'' +
                ", city='" + city + '\'' +
                ", percentage=" + percentage +
                '}';
    }
	
}
