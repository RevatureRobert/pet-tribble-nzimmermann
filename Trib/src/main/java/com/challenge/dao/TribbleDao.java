package com.challenge.dao;

import com.challenge.config.ConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TribbleDao {



    //public getTribble();

    public void getTribbleColor(int id){
        ResultSet rs;

        try {
            String sql = "select color from tribbles where id="+id;
            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
            rs = st.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getObject(1));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void addTribble(int id, int labId, String name, String color){
        ResultSet rs;
        try {
            String sql = "insert into tribbles values(" +
                    id + ", " +
                    labId + ", " +
                    name + ", " +
                    color + ");";

            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public String checkData(String s){
        ResultSet rs;
        try {
            String sql = "select username from users";
            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
            rs = st.executeQuery(sql);

            ArrayList<String> usernames = new ArrayList<>();

            while(rs.next()){
                String temp = (String) rs.getObject(1);
                //System.out.println(rs.getObject(1));
                //System.out.println(temp);
                usernames.add(temp);
            }

            System.out.println(usernames);

            return "uhh...";

        } catch (SQLException e) {
            e.printStackTrace();
            return "something went wrong";
        }

    }

}
