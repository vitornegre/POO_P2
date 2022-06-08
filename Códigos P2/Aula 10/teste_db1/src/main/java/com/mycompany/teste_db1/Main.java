package com.mycompany.teste_db1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1: {
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("Email?");
                    Pessoa p = new Pessoa();
                    p.setNome(nome);
                    p.setFone(fone);
                    p.setEmail(email);
                    boolean resultado = p.inserir();
                    if (resultado) {
                        JOptionPane.showMessageDialog(null, "dados inseridos com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "falha na insercao");
                    }

                    break;
                }
                case 2: {
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("Email?");
                    int codigo
                            = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                    Pessoa p = new Pessoa(codigo, nome, fone, email);
                    p.atualizar();
                    break;
                }
                case 3: {
                    int codigo
                            = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                    Pessoa p = new Pessoa();
                    p.setCodigo(codigo);
                    p.apagar();
                    break;
                }
                case 4: {
                    Pessoa p = new Pessoa();
                    String resultado = p.listar();
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                }

                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 0);
    }
}
