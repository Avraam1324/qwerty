package org.example;
/**
 * @aurthor Avraam Turkene
 * @ID 328767181
 * @date 15/01/23
 */


public class Main {
    public static void main(String[] args) {
        myConnection con=new myConnection();
        con.getConnection();
//        con.select();
//        con.insert("avraam");
//        con.Update("ishumbl",3);
          con.user_list();
          con.select();

    }
}