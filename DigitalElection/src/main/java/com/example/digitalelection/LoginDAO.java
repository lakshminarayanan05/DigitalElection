package com.example.digitalelection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public static boolean isValid(int voterid, String userPin) throws Exception {
        Connection con = DataBaseConnection.getConnection();
        String query = "select * from voters where voterid = ? and password = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,voterid);
        ps.setString(2,userPin);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            return true;
        return false;
    }
}
