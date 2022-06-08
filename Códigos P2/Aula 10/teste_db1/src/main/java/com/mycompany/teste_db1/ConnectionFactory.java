package com.mycompany.teste_db1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "Ruiba278";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoas";

    public Connection obtemConexao() {
        try {
           /* Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                    usuario,
                    senha
            );*/
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pessoas?useTimezone=true&serverTimezone=UTC&user=root&password=Ruiba278");System.out.println("Conexão estabelecida");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }
}
