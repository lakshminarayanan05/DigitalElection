package com.example.digitalelection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
    public static void addUser(Voters voter) throws Exception {
        Connection con = DataBaseConnection.getConnection();
        String query = "insert into voters(name,gender,voterid,phone,taluk,state,password) values(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1,voter.getName());
        ps.setString(2,voter.getGender());
        ps.setLong(3,voter.getVoterId());
        ps.setLong(4,voter.getPhone());
        ps.setString(5,voter.getTaluk());
        ps.setString(6,voter.getState());
        ps.setString(7,voter.getPassword());

        ps.executeUpdate();
    }
}
