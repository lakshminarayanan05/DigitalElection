package com.example.digitalelection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class VotingMachineDAO {
    public static void addVote(String party) throws Exception {
        Connection con = DataBaseConnection.getConnection();
        String query = "update parties set votecount = votecount +1 where partyname = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,party);
        ps.executeUpdate();
    }
}
