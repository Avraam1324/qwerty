package org.example;
/**
 * @aurthor Avraam Turkene
 * @ID 328767181
 * @date 15/01/23
 */

import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class Main {
    public static void main(String[] args) {
        myConnection con=new myConnection();
        con.getConnection();
        System.out.println("Hello World");
    }
}