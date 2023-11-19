
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import manutencao.Fornecedor;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JaqsonUpf
 */
public class TestesColecoes {
    @Test
    public void testColecoes(){
        List<Fornecedor> fornecedores = new ArrayList();
        System.out.println("Tamanho da coleção: "+fornecedores.size());
        fornecedores.add(new Fornecedor(1, "F1"));
        fornecedores.add(new Fornecedor(2, "B1"));
        fornecedores.add(new Fornecedor(3, "A1"));
        fornecedores.add(new Fornecedor(4, "C1"));
        fornecedores.add(new Fornecedor(5, "G1"));
        System.out.println("Tamanho da coleção: "+fornecedores.size());
        System.out.println("Objeto da posição 2: "+fornecedores.get(2));
        System.out.println("--------------------------------------------");
        fornecedores.remove(3);
        System.out.println("Lista: "+fornecedores);
        System.out.println("Tamanho da coleção: "+fornecedores.size());
        System.out.println("--------------------------------------------");
        Fornecedor pesquisar = new Fornecedor(3, "A1");
        boolean existe = fornecedores.contains(pesquisar);
        System.out.println(existe ? "Encontrou" : "Não encontrou" ); 
        Fornecedor pesquisar2 = new Fornecedor(3, "A1");// igual ao anterior
        if (pesquisar.equals(pesquisar2)){
            //if (pesquisar == pesquisar2){ não usar para comparar objetos
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
        System.out.println("--------------------------------------");
        System.out.println("A1 está na posição: "+fornecedores.indexOf(pesquisar));
        System.out.println("Listar na ordem inversa");
        Collections.reverse(fornecedores);
        System.out.println(fornecedores);
        
        System.out.println("Listar na ordem aleatória");
        Collections.shuffle(fornecedores);
        System.out.println(fornecedores);
        
        System.out.println("Listar na ordem do nome");
        Collections.sort(fornecedores, (o1, o2) -> o1.getNome().compareTo(o2.getNome()) );
        System.out.println(fornecedores);

        System.out.println("Listar na ordem do id");
        Collections.sort(fornecedores, (o1, o2) -> o1.getId().compareTo(o2.getId()) );
        System.out.println(fornecedores);
        
    }
}
