package spr.beans;



public class StudentRegistration 
{
    private int enrollmentId;
    private String fullName;
    private int dob;
    private String password;
    private long contact;
    private String email;
    private String course;
    private int yearOfAcademics;
    private String address;
    private String city;
    private String state;
    private float tenthPercentage;
    private float twelvePercentage;
    private float graduationPercentage;
    private String resume;
    private String category;
    private int cGPA;

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearOfAcademics() {
        return yearOfAcademics;
    }

    public void setYearOfAcademics(int yearOfAcademics) {
        this.yearOfAcademics = yearOfAcademics;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getTenthPercentage() {
        return tenthPercentage;
    }

    public void setTenthPercentage(float tenthPercentage) {
        this.tenthPercentage = tenthPercentage;
    }

    public float getTwelvePercentage() {
        return twelvePercentage;
    }

    public void setTwelvePercentage(float twelvePercentage) {
        this.twelvePercentage = twelvePercentage;
    }

    public float getGraduationPercentage() {
        return graduationPercentage;
    }

    public void setGraduationPercentage(float graduationPercentage) {
        this.graduationPercentage = graduationPercentage;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getcGPA() {
        return cGPA;
    }

    public void setcGPA(int cGPA) {
        this.cGPA = cGPA;
    }

    public StudentRegistration() {
    }

    public StudentRegistration(int enrollmentId, String fullName, int dob, String password, long contact, String email, String course, int yearOfAcademics, String address, String city, String state, float tenthPercentage, float twelvePercentage, float graduationPercentage, String resume, String category, int cGPA) {
        this.enrollmentId = enrollmentId;
        this.fullName = fullName;
        this.dob = dob;
        this.password = password;
        this.contact = contact;
        this.email = email;
        this.course = course;
        this.yearOfAcademics = yearOfAcademics;
        this.address = address;
        this.city = city;
        this.state = state;
        this.tenthPercentage = tenthPercentage;
        this.twelvePercentage = twelvePercentage;
        this.graduationPercentage = graduationPercentage;
        this.resume = resume;
        this.category = category;
        this.cGPA = cGPA;
    }
    
    
    
    
    
    
}