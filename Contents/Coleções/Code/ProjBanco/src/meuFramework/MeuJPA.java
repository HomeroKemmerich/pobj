package meuFramework;

import java.lang.reflect.Field;

public class MeuJPA {
    
    public static void merge(Object o){
        String sql = "INSERT INTO ";
        System.out.println("------------------------------------");
        System.out.println("Informações do objeto");
        System.out.println("Classe: "+o.getClass().getSimpleName());
        sql += o.getClass().getSimpleName()+" (";
        Field[] fields = o.getClass().getDeclaredFields();
        String s = "";
        for(int i=0; i<fields.length; i++){
           s+= fields[i].getName()+", ";
        }
        // Passo 1 - pegar os valores dos atributos e por no SQL!!
        sql += s + ") VALUES (? ? ? ?)";
        System.out.println("sql: "+sql);
        
        // Passo 2 - incrementar o método merge para pegar os atributos herdados também
    }
    
}
