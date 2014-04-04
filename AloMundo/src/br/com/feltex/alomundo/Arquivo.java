package br.com.feltex.alomundo;

import java.io.File;
import java.nio.file.Files;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Arquivo {

	
	 public static void main(String[] args) {
		 try{			 
	         JFileChooser abrir = new JFileChooser();  
	         int retorno = abrir.showOpenDialog(null);  
	         abrir.setFileFilter(new FileNameExtensionFilter("txt","TXT")); 
	         if (retorno==JFileChooser.APPROVE_OPTION){  
	             File arquivoSelecionado = abrir.getSelectedFile();//arquivo
	             String numeArquivo = arquivoSelecionado.getName();
	             

	            Files.copy(arquivoSelecionado.toPath(), new File("C:/temp/"+File.separator+numeArquivo).toPath());


	         }
	         else{    
	           JOptionPane.showMessageDialog(null,"Nenhum arquivo selecionado!", "Erro!", JOptionPane.ERROR_MESSAGE);    
	       } 
	           } catch (Exception e) {  
	      JOptionPane.showMessageDialog(null,"Erro: ..."+e);  
	      //e.printStackTrace();  
	    }
	}
}
