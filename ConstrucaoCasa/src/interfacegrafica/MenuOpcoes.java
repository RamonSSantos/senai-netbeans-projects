package interfacegrafica;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import classesobjetoscasa.Casa;
import classesobjetoscasa.Janela;
import classesobjetoscasa.Porta;

import java.util.ArrayList;
import java.util.List;

public class MenuOpcoes {
	
	//Declaracao do método dinamico exibirMenu()
	public void exibirMenu() {
		
		//Criando o objeto casa e instanciando-o para a classe Casa
		Casa casa = new Casa();
		
		//Criando o menu de opcoes
		while(true) {
			
			int acao=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opcao: \n\n"
					+ "1- Construir Casa \n"
					+ "2- Pintar Casa \n"
					+ "3- Mover Porta(s) \n"
					+ "4- Mover Janela(s) \n"
					+ "5- Informacoes da Casa \n"
					+ "6- SAIR \n\n", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
		
			/*
			 * Estrutura condicional que verifica qual opcao do menu foi escolhida
			 */
				
			switch(acao) {
			
			/*
			 * Caso a opcao escolhida seja 1, chamar o método que permitirá fazer as
			 * entradas de dados necessarias para a construcao da casa
			 */
				case 1:
					dadosConstCasa(casa);
				break;
				
				case 2:
					pintarCasa(casa);
				break;
				
				case 3:
					moverPorta(casa);
				break;
				
				case 4:
					moverJanela(casa);
				break;
                                
                                case 5:
                                        exibirInformacoes(casa);
                                break;
				
				case 6:
					System.exit(0);
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opcao Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				break;
			}
		}
	}
	
	private void dadosConstCasa(Casa casa) {
		
		//Entrada de dados
		String descricao=JOptionPane.showInputDialog(null, "Descricao da casa: \n\n", "Informacoes da casa", JOptionPane.QUESTION_MESSAGE);
		String cor=JOptionPane.showInputDialog(null, "Informe a cor da casa: \n\n", "Informacoes da casa", JOptionPane.QUESTION_MESSAGE);
	
		int quantidadePorta=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de portas: \n\n", "Informacoes da casa", JOptionPane.QUESTION_MESSAGE));
		int quantidadeJanela=Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de janelas: \n\n", "Informacoes da casa", JOptionPane.QUESTION_MESSAGE));
	
		//Declaracao do array listaDeJanelas e array listaDePortas
		List<Janela> listaDeJanelas = new ArrayList<Janela>();
		List<Porta> listaDePortas = new ArrayList<Porta>();
		
		for(int i=0; i<quantidadeJanela; i++) {
			
			listaDeJanelas.add(solicitarJanelas(i));
		}
		
		for(int i=0; i<quantidadePorta; i++) {
			
			listaDePortas.add(solicitarPortas(i));
		}
		
		//Armazena os valores das entradas para os atributos do objeto casa
		casa.construirCasa(descricao, cor, listaDeJanelas, listaDePortas);
		
		//Impressao na Console
		//System.out.println(casa.getDescricao());
		//System.out.println(casa.getCor());
		
		for(Janela janela : casa.getListaDeJanelas()) {
			
			//Impressao na Console
			//System.out.println("Descricao: " + janela.getIdentificacao());
			//System.out.println("Situacao" + janela.getStatus());
		}
		
		for(Porta porta : casa.getListaDePortas()) {
			
			//Impressao na Console
			//System.out.println("Descricao" + porta.getIdentificacao());
			//System.out.println("Situacao" + porta.getStatus());
		}
	}
	
	private Janela solicitarJanelas(int i) {
		
		//Cria o objeto janela apontando para a instancia da classe Janela
		Janela janela = new Janela();
		
		//Incrementa a variavel i de 1
		i=i+1;
		
		String identificacao=JOptionPane.showInputDialog(null, "Digite a descricao da janela" + (i) + ": \n\n", "Janela", JOptionPane.QUESTION_MESSAGE);
		int status=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o status da janela " + identificacao + "\n 1 Para aberta: \n 2 Para fechada: \n\n", "Janela", JOptionPane.QUESTION_MESSAGE));
		
		/*
		 * Chama o metodo setIdentificacao() passando como parametro a descricao da janela
		 * processada no momento para que esta seja armazenada no atributo identificacao da classe Janela
		 */
		janela.setIdentificacao(identificacao);
		
		/*
		 * Chama o metodo setStatus() e de acordo com o status informado pelo usuario
		 * repassa o valor para ser armazenado no atributo status da classe Janela
		 */
		
		if(status==1) {
			
			janela.setStatus(1);
		} else {
			
			janela.setStatus(2);
		}
		
		//System.out.println(janela.getIdentificacao());
		//System.out.println(janela.getStatus());
		
		return janela;
	}
	
	private Porta solicitarPortas(int i) {
		
		//Cria o objeto porta apontando para a instancia da classe Porta
		Porta porta = new Porta();
		
		//Incrementa a variavel i de 1
		i=i+1;
		
		String identificacao=JOptionPane.showInputDialog(null, "Digite a descricao da porta" + (i) + ": \n\n", "Porta", JOptionPane.QUESTION_MESSAGE);
		int status=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o status da porta " + identificacao + "\n 1 Para aberta: \n 2 Para fechada: \n\n", "Porta", JOptionPane.QUESTION_MESSAGE));
		
		/*
		 * Chama o metodo setIdentificacao() passando como parametro a descricao da janela
		 * processada no momento para que esta seja armazenada no atributo identificacao da classe Janela
		 */
		porta.setIdentificacao(identificacao);
		
		/*
		 * Chama o metodo setStatus() e de acordo com o status informado pelo usuario
		 * repassa o valor para ser armazenado no atributo status da classe Janela
		 */
		if(status==1) {
			
			porta.setStatus(1);
		} else {
			
			porta.setStatus(2);
		}
		
		//System.out.println(porta.getIdentificacao());
		//System.out.println(porta.getStatus());
		
		return porta;
	}
	
	/*
	 * O metodo pintarCasa() produz uma entrada de dados para receber a cor que o usuario
	 * deseja para a casa. Na sequencia, repassa essa cor para o metodo pintar a casa, 
	 * localizado na classe Casa, por meio do objeto casa
	 */
	private void pintarCasa(Casa casa) {
		
		String cor=JOptionPane.showInputDialog(null, "Digite a cor da casa: ", "Casa", JOptionPane.QUESTION_MESSAGE);
		casa.pintarCasa(cor);
		
		//System.out.println(casa.getCor());
	}
	
	private void moverPorta(Casa casa) {
		
		if(casa.getListaDePortas()==null) {
			
			JOptionPane.showMessageDialog(null, "A casa nao tem Porta(s)", "Erro", JOptionPane.OK_CANCEL_OPTION);
		} else {
			
			JOptionPane.showMessageDialog(null, "A casa tem Porta(s)", "OK", JOptionPane.OK_CANCEL_OPTION);
			
			List list = new ArrayList();
			
			for(Porta porta : casa.getListaDePortas()) {
				
				list.add(porta.getIdentificacao());
			}
			
			JComboBox field1 = new JComboBox(list.toArray());
			String[] listStatus = {"Aberta", "Fechada"};
			
			JComboBox field2 = new JComboBox(listStatus);
			Object[] message = {"Porta:", field1, "Status:", field2};
			
			int option = JOptionPane.showConfirmDialog(null, message, "Porta", JOptionPane.OK_CANCEL_OPTION);
			
			if(option==JOptionPane.OK_OPTION) {
				
				int status;
				
				if(field2.getSelectedIndex()==1) {
					
					status=1;
					
				} else {
					
					status=2;
				}
				casa.movimentarPorta(field1.getSelectedIndex(), status);
			}
		}
	}
	
	private void moverJanela(Casa casa) {
		
		if(casa.getListaDeJanelas()==null) {
			
			JOptionPane.showMessageDialog(null, "A casa nao tem Janela(s)", "Erro", JOptionPane.OK_CANCEL_OPTION);
		} else {
			
			JOptionPane.showMessageDialog(null, "A casa tem Janela(s)", "OK", JOptionPane.OK_CANCEL_OPTION);
			
			List list = new ArrayList();
			
			for(Janela janela : casa.getListaDeJanelas()) {
				
				list.add(janela.getIdentificacao());
			}
			
			JComboBox field1 = new JComboBox(list.toArray());
			String[] listStatus = {"Aberta", "Fechada"};
			
			JComboBox field2 = new JComboBox(listStatus);
			Object[] message = {"Janela:", field1, "Status:", field2};
			
			int option = JOptionPane.showConfirmDialog(null, message, "Janela", JOptionPane.OK_CANCEL_OPTION);
			
			if(option==JOptionPane.OK_OPTION) {
				
				int status;
				
				if(field2.getSelectedIndex()==1) {
					
					status=1;
				} else {
					
					status=2;
				}
				casa.movimentarJanela(field1.getSelectedIndex(), status);
			}
		}
	}
        
        private void exibirInformacoes(Casa casa) {
            
            Porta porta = new Porta();
            Janela janela = new Janela();
            List list = new ArrayList();
        
            JOptionPane.showMessageDialog(null, "Tipo da casa: " 
                    + casa.getDescricao()
                    + "/n Cor da casa: " + casa.getCor()
                    
                    + casa.getListaDePortas().forEach((porta) -> {
                        
                    + "\n Identificacao da(s) porta(s): " + list.add(porta.getIdentificacao());
                    + "\n Descricao da(s) porta(s): " + list.add(porta.getStatus());
                    })
                    //+ "\n Identificacao da(s) porta(s): " + porta.getIdentificacao()
                    //+ "\n Descricao da(s) porta(s): " + porta.getStatus()
                        
                    + casa.getListaDeJanelas().forEach((janela) -> {
                        
                    + "\n Identificacao da(s) janela(s): " + list.add(janela.getIdentificacao());
                    + "\n Descricao da(s) janela(s): " + list.add(janela.getStatus());
                    })
                    //+ "\n Identificacao da(s) janela(s): " + janela.getIdentificacao()      
                    //+ "\n Descricao da(s) janela(s): " + janela.getStatus()
                            
                    , "Informacoes da casa", JOptionPane.INFORMATION_MESSAGE);
        }
}