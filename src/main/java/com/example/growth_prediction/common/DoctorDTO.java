package com.example.growth_prediction.common;

public class DoctorDTO {
    private String doctor_id;
    private String doctor_pw;
    private String doctor_name;
    private String doctor_email;
    private String hospital;
    private String doctor_number;

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_email() {
        return doctor_email;
    }

    public void setDoctor_email(String doctor_email) {
        this.doctor_email = doctor_email;
    }

    public String getDoctor_pw() {
        return doctor_pw;
    }

    public void setDoctor_pw(String doctor_pw) {
        this.doctor_pw = doctor_pw;
    }

    public String getDoctor_number() {
        return doctor_number;
    }

    public void setDoctor_number(String doctor_number) {
        this.doctor_number = doctor_number;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
