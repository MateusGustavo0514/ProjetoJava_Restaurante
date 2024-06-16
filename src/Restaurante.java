import java.util.Scanner;
import Acesso_Dados.Cliente_Acesso;
import Acesso_Dados.Funcionario_Acesso;
import Hierarquia.Cliente;
import Hierarquia.Funcionario;


public class Restaurante {
    public static void main(String[] args){
        
        //Variaveis
        int op;
        boolean saida = false;
        boolean login = false;

        //Scanners
        Scanner leitura_tela = new Scanner(System.in);
   
    //TELA INICIAL  CLIENTE/FUNCIONARIO    
    while (!saida) {
        System.out.println("-------------  RESTAURANTE PAPA PIZZA  -------------");
        System.out.println("          ESCOLHA UMA DAS OPÇÕES A BAIXO    \n 1.Cliente \n 2.Funcionario \n 3.Saída");
        System.out.printf(" \nInsira aqui: ");
        op = leitura_tela.nextInt();

        switch (op){
            case 1: 
                handleCliente(leitura_tela);
                break;
            case 2:
                handleFuncionario(leitura_tela);
                break;

            case 3:
                saida = true;
                System.out.println("SAINDO DO PROGRAMA...");
                break;

            default:
                System.out.println("ALTERNATIVA INVALIDA"); 
            }    
        }
        leitura_tela.close();
    }

    //LOGIN / CADASTRO DO CLIENTE 
    private static void handleCliente(Scanner leitura_tela) {  

    boolean menu = false;

    while(!menu){
        System.out.printf("\nSEJA BEM VINDO(A)   \nJÁ POSSUI CADASTRO?  \n1.Sim  \n2.Nao \n3.Voltar \nInsira aqui: ");
        int op = leitura_tela.nextInt();
        boolean login;
        
        if(op == 1){
            Cliente cliente = new Cliente();
            System.out.println("PARA ACESSAR SUA CONTA INFORME EMAIL E SENHA");  
            login = new Cliente_Acesso().Cliente_Login(cliente);  

            if(login){
                menuCliente(leitura_tela, cliente);
            }else{
                System.out.println("Falha ao autenticar dados!!!");
            }   
        } else if(op == 2){
            Cliente cliente = new Cliente();
            System.out.println("PARA CRIAR UMA CONTA PREENCHA AS INFORMACOES A BAIXO ");
            new Cliente_Acesso().CadastrarCliente(cliente);
            System.out.printf("SEU CADASTRO FOI REALIZADO COM SUCESSO \n3.Voltar para o menu inicial \nInsira aqui: ");
            op = leitura_tela.nextInt();
        } else if(op == 3){
            continue;
        } 
    }
}

    //MENU E RESERVA DO CLIENTE
    private static void menuCliente(Scanner leitura_tela, Cliente cliente){

    boolean menu = false;

    while(!menu){
        System.out.printf("------- PAPA PIZZA ------- \n1.FAZER RESERVAS \n2.VER MESAS E PEDIDOS \n3.SAIR  \n\nInsira aqui: ");
        int op = leitura_tela.nextInt();

        if (op == 1 ){
            System.out.println("AQUI ESTÁ A LISTA DE MESAS PARA RESERVA:\nMesa1\nMesa2\nMesa3\nMesa4\nMesa5\nMesa6\nMesa7\nMesa8\nMesa9\nMesa10");
            new Cliente_Acesso().CadastrarReserva(cliente);
            System.out.println("Reserva feita com sucesso!!! Voltando ao menu :)");
            continue; 
        }else if(op == 2){
            System.out.println("-------- AQUI ESTÃO A SUAS RESERVAS --------");
            //DESENVOLVER CODIGO
        }else if(op == 3){
            continue;
        } 
    }
}

    //ÁREA DO FUNCIONARIO 
    private static void handleFuncionario(Scanner leitura_tela){

    boolean menu = false;

    while (!menu) {
        System.out.printf("<<<<<< AREA DOS FUNCIONARIOS >>>>>> \n1.Já sou funcionario \n2.Sou funcionario novo \n3.Voltar \nInsira aqui: ");   
        int op = leitura_tela.nextInt();
        boolean login;
            if(op == 1){
                Funcionario funcionario = new Funcionario();
                System.out.println("<<<<<< LOGIN FUNCIONARIO >>>>>>");
                login = new Funcionario_Acesso().Funcionario_Login(funcionario);
            
                if(login){
                    telaFuncionario(leitura_tela, funcionario);
                }else{
                    System.out.println("Falha ao autenticar dados!!!");
                }
            }else if(op == 2){
                Cliente cliente = new Cliente();
                System.out.println("PARA CRIAR UMA CONTA PREENCHA AS INFORMACOES A BAIXO ");
                new Cliente_Acesso().CadastrarCliente(cliente);
                System.out.printf("SEU CADASTRO FOI REALIZADO COM SUCESSO \n3.Voltar para o menu inicial \nInsira aqui: ");
                op = leitura_tela.nextInt(); 
            }else if(op == 3){
                continue;
            }         
        }
    }
    
    private static void telaFuncionario(Scanner leitura_tela, Funcionario funcionario){
        System.out.println("-------- FUNCIONARIO --------");
        System.out.println("   SEJA BEM VINDO DE VOLTA, AQUI ESTÃO A RESERVAS DE HOJE   ");

    }
}


        

