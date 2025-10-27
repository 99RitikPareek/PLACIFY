package spr.beans;


public class JobDesc 
{
    private String companyName;
    private int pkgOffered;
    private String course;
    private String branch; //if any
    private boolean uG_pG;
    private int currentCgpa;
    private String admissionYear; 
    private String passoutYear;
    private float sSC;
    private float hSSC;
    private String graduation;
    private int gradCgpa;
    private String language;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPkgOffered() {
        return pkgOffered;
    }

    public void setPkgOffered(int pkgOffered) {
        this.pkgOffered = pkgOffered;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public boolean isuG_pG() {
        return uG_pG;
    }

    public void setuG_pG(boolean uG_pG) {
        this.uG_pG = uG_pG;
    }

    public int getCurrentCgpa() {
        return currentCgpa;
    }

    public void setCurrentCgpa(int currentCgpa) {
        this.currentCgpa = currentCgpa;
    }

    public String getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(String admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getPassoutYear() {
        return passoutYear;
    }

    public void setPassoutYear(String passoutYear) {
        this.passoutYear = passoutYear;
    }

    public float getsSC() {
        return sSC;
    }

    public void setsSC(float sSC) {
        this.sSC = sSC;
    }

    public float gethSSC() {
        return hSSC;
    }

    public void sethSSC(float hSSC) {
        this.hSSC = hSSC;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public int getGradCgpa() {
        return gradCgpa;
    }

    public void setGradCgpa(int gradCgpa) {
        this.gradCgpa = gradCgpa;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public JobDesc() {
    }

    public JobDesc(String companyName, int pkgOffered, String course, String branch, boolean uG_pG, int currentCgpa, String admissionYear, String passoutYear, float sSC, float hSSC, String graduation, int gradCgpa, String language) {
        this.companyName = companyName;
        this.pkgOffered = pkgOffered;
        this.course = course;
        this.branch = branch;
        this.uG_pG = uG_pG;
        this.currentCgpa = currentCgpa;
        this.admissionYear = admissionYear;
        this.passoutYear = passoutYear;
        this.sSC = sSC;
        this.hSSC = hSSC;
        this.graduation = graduation;
        this.gradCgpa = gradCgpa;
        this.language = language;
    }


    
    
}