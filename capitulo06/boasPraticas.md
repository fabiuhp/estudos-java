A maior parte do trabalho de um programador é sobre **ler** código e não sobre escrever.

Quem define o que é uma boa prática? O que é um código bem feito?
Existem referencias muito conhecidas, que nos ajudam a definir essas regras.

Effective Java (Java Efetivo) - Joshua Bloch. R\$408,81
Clean Code (Código Limpo) - Robert C. Martin. R\$202,71

Código Limpo: escolha bons nomes para as coisas.
- Voce precisa entender o código.
- Quanto mais legível, melhor a leitura.
- Será que outra pessoa vai entender isso?
- Nomear coisas é muito difícil.

***ruim***
int d;
int dias;

***bom***
int tempoGastoEmDias;
int diasGastosParaEntrega;
___
***ruim***
Cliente cliente1;
Cliente cliente2;

***bom***
Cliente clienteCadastrado;
Cliente novoCliente;

Com as linguagens modernas, o uso de comentários passou a ser cada vez menos necessário. Porém, em alguns casos, pode ser necessário para explicar coisas muito específicas.
Quanto mais descritivo for seu código, menos comentários se fazem necessários.

Esse exemplo abaixo, mostra que os comentários são ***desnecessários***, visto que está claro o que cada variável é.

~~~java
public class Contribuinte {
    //idade do contribuinte
    int idade;
    //tempo de contribuição em anos do contribuinte
    int tempoContribuicaoEmAnos;
}
~~~

Além disso, existe o risco dos programadores refatorarem os códigos explicativos. Normalmente fazemos um refat nas variáveis e nomes de métodos por meio da IDE, mas ela não tem como adivinhar e refatorar os comentários.

Métodos devem ser especializados. Fazer o minimo necessário e abstrair responsabilidades sempre que possível.

Valide os argumentos passados em métodos, principalmente metodos publicos. Os privados, dependendo da situação, ainda podem passar sem a validação.

Wrappers são objetos que 'embrulham' o tipo primitivo dentro dela. Possibilitando por exemplo que um valor int receba null. São casos muito específicos, mas que podem acontecer.
Todo tipo primitivo tem um wrapper.
Lembrar de usar os métodos estáticos de classe para fazer a conversão dos valores.
Exemplo:
~~~java
Integer valor = Integer.valueOf(25);
Integer valor = Integer.valueOf("25");
~~~

No trecho de código a seguir, ocorre um evento muito peculiar.

~~~java
Integer valor1 = 127;
Integer valor2 = 127;

System.out.println(valor1 == valor2); // true;

Integer valor3 = 127;
Integer valor4 = 127;

System.out.println(valor3 == valor4); // false;
~~~

Isso ocorre por que o operador de comparação `==` quando utilizado em objetos(classe Integer) compara o endereço de memória, mas no caso do valor 127 ele dá true pois existe um cache da classe Integer.valueOf(). Ou seja, ele reaproveita o espaçõ em memória para os dois, com o intuito de tornar a execução mais rápida.

O mesmo ocorre com Strings, onde existe uma `String pool` no java, caso você insira o mesmo valor para duas strings, o Java vai utilizar o mesmo espaço em memória para agilizar o processo.