package com.example.growth_prediction.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.growth_prediction.util.DatabaseUtil;

public class DoctorDAO {
    public int join(String doctor_id, String doctor_pw, String doctor_name, String doctor_email,
            String hospital, String doctor_number) {
        String SQL = "INSERT INTO doctor VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = DatabaseUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, doctor_id);
            pstmt.setString(2, doctor_name);
            pstmt.setString(3, doctor_email);
            pstmt.setString(4, doctor_pw);
            pstmt.setString(5, doctor_number);
            pstmt.setString(6, hospital);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static int login(String doctor_id, String doctor_pw) {
        String SQL = "SELECT doctor_pw FROM doctor WHERE doctor_id = ?";
        try {
            Connection conn = DatabaseUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, doctor_id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                if (rs.getString(1).contentEquals(doctor_pw)) {
                    return 1; // 로그인 성공
                } else {
                    return 0; // 비밀번호 불일치
                }
            }
            return -1;// 아이디가 없음

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -2;// DB오류
    }

    public void logout() {

    }
}
