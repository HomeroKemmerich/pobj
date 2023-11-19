# Exercício Controle Carro

A atividade consiste em desenvolver um software orientado a objetos para controlar instâncias de carros automáticos.

O software deverá permitir instanciar objetos com as
características definidas na classe abaixo.

![](./Screenshot%20from%202023-11-19%2014-02-20.png)

As operações que poderão ser realizadas com cada instância de carro deverão obedecer aos requisitos especificados abaixo.

- As possíveis marchas do carro são: P (Park), 1, 2, 3, 4, 5, 6 (seis marchas).
- As rpm do carro podem variar de 0 (zero) a 8000.
- Ao instanciar um carro, deve-se informar a placa via método construtor. Os demais atributos devem ser
inicializados de modo que o carro fique desligado, 0 (zero) rpm e em marcha P.
- O método `power()`` deve ligar ou desligar o carro.
    - Se estiver ligado, desliga e se estiver desligado, liga.
    - Para ligar ou desligar deve estar em marcha P.
    - Ao ligar o carro deve setar rpm para 1000. Só pode ligar se estiver com 0 (zero) rpm.
    - Ao desligar setar rpm para 0 (zero). Só pode desligar se estiver com 1000 rpm
- O método `acelerar()`, deve incrementar rpm de 1000 em 1000 até no máximo 8000.
    - Só pode acelerar se estiver ligado.
    - Sempre que acelerar e passar de 4000 rpm deve incrementar uma marcha e retornar o rpm para 2000,
respeitando a marcha e rpm máximos.
- O método `desacelerar()`, deve decrementar rpm de 1000 em 1000 até no mínimo 1000.
    - Só pode desacelerar se estiver ligado e marcha diferente de P.
    - Sempre que estiver acima da segunda marcha e desacelerar, quando as rpm chegarem em 2000 deve
decrementar a marcha e setar rpm para 4000.
    - Quando estiver em marcha 1 pode desacelerar até 1000 rpm, neste caso setar a marca para P.
- Sempre que alguma regra for quebrada deve gerar uma Exceção com mensagem adequada.

---

- Criar um projeto para a atividade. Pode ser implementado com UI Console.
- No projeto, em um pacote “br.upf.ccc.classes”, implemente a classe `Carro.java`. Faça o encapsulamento dos atributos e implemente os métodos definidos, de modo que atenda as regras de funcionamento do carro.
- Implemente a UI console para:
  - Permitir que o usuário consiga inserir um carro para controlar.
  - Ao inserir um carro, ler a placa do usuário, instanciar o objeto e inicializar o objeto pelo seu método construtor, conforme regras estabelecidas.
  - Permitir ao usuário poder realizar as operações de ligar, desligar, acelerar e desacelerar, sempre mostrando o estado atual do objeto após cada operação.

