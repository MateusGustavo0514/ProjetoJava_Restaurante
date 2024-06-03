
public class beta {
//backup do laço arrumado
                    
           //CONDICIONAL CLIENTE
             /**if(op == 1 ){
                System.out.printf("\nSEJA BEM VINDO(A)   \nJÁ POSSUI CADASTRO?  \n1.Sim  \n2.Nao \n3.Voltar \nInsira aqui: ");
                op = leitura_tela.nextInt();
                    //LOGIN CLIENTE
                        if(op == 1){
                            Cliente cliente = new Cliente();
                            System.out.println("PARA ACESSAR SUA CONTA INFORME EMAIL E SENHA");
                            new Cliente_Acesso().Cliente_Login(cliente);
                                if(op == 3){

                                }
                            //TELA DO CLIENTE
                            
                    //CADASTRO CLIENTE
                        }else{
                            Cliente cliente = new Cliente();
                            System.out.println("PARA CRIAR UMA CONTA PREENCHA AS INFORMACOES A BAIXO ");
                            new Cliente_Acesso().CadastrarCliente(cliente);
                            op = leitura_tela.nextInt();
                            System.out.printf("SEU CADASTRO FOI REALIZADO COM SUCESSO \n3.Voltar para o menu inicial \nInsira aqui: ");
                            op = leitura_tela.nextInt();
                        }
            //CONDICIONAL FUNCIONARIO
            }else{
                System.out.printf("<<<<<< AREA DOS FUNCIONARIOS >>>>>> \n1.Já sou funcionario \n2.Sou funcionario novo \nInsira aqui: ");
                op = leitura_tela.nextInt();
                //LOGIN FUNCIONARIO
                    if (op == 1) {
                        Funcionario funcionario = new Funcionario();
                        System.out.println("<<<<<< LOGIN FUNCIONARIO >>>>>>");
                        new Funcionario_Acesso().Funcionario_Login(funcionario);
                //CADASTRO FUNCIONARIO    
                }else{
                    Funcionario funcionarios = new Funcionario();
                    System.out.println("<<<<<< CADASTRO DE NOVOS FUNCIONARIOS >>>>>>");
                    new Funcionario_Acesso().CadastrarFuncionario(funcionarios);
                    System.out.printf("SEU CADASTRO FOI REALIZADO COM SUCESSO \n3.Voltar para o menu inicial \nInsira aqui: ");
                }        
            }*/
}
