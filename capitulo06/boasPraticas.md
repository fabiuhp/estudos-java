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