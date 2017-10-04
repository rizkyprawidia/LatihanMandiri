/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.indocyber.project;

/**
 *
 * @author user
 */
public class Person {

    /**
     * @param noHp the noHp to set
     */
    private String kode;
    private String nama;
    private String noHp;
    private String gender;
    private Boolean married;
    private Integer age;
    private double salary;
    private String pekerjaan;
    private String alamat; 

    public Person() {
    }

    public Person(String kode,String nama,String noHp, String gender, Boolean married, Integer age, double salary, String pekerjaan, String alamat) {
        this.kode=kode;
        this.nama = nama;
        this.noHp= noHp;
        this.gender = gender;
        this.married = married;
        this.age = age;
        this.salary = salary;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the noHp
     */
    public String getNoHp() {
        return noHp;
    }

    /**
     * @param noHp the noHp to set
     */
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public Boolean getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(Boolean married) {
        this.married = married;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


      
}
