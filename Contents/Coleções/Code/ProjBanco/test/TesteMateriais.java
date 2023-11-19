
import java.util.ArrayList;
import java.util.List;
import manutencao.Fornecedor;
import manutencao.Material;
import manutencao.MaterialPreco;
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
public class TesteMateriais {
    @Test
    public void testMateriaisFornededores(){
        ArrayList<Material> materiais = new ArrayList<>();
        List<Fornecedor> fornecedores = new ArrayList<>();
        List<MaterialPreco> precos = new ArrayList<>();
        
        materiais.add(new Material(1, "Mouse"));
        materiais.add(new Material(2, "Tonner"));
        
        fornecedores.add(new Fornecedor(1, "Fornecedor 1"));
        fornecedores.add(new Fornecedor(2, "Fornecedor 2"));
        
        precos.add(new MaterialPreco(55.50, materiais.get(0), fornecedores.get(1)));
        precos.add(new MaterialPreco(58.30, materiais.get(0), fornecedores.get(0)));
        precos.add(new MaterialPreco(150.00, materiais.get(1), fornecedores.get(1)));
        
    }
}
