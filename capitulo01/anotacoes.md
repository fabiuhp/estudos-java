## Conhecendo a máquina virtual Java

- Linguagem pré-compilada.
- JVM - Necessária para rodar o Java.
- Por conta da JVM, torna o processo de produção muito mais fácil.

## JRE e JDK: qual é a diferença?

- Java Runtime Environment (JRE)
  - Ambiente de execução de programas Java.
  - Necessário instalar nas máquinas que irão rodas os códigos Java.
- Java Development Kit (JDK)
  - Kit para desenvolver programas Java.
  - Inclui compilador e outras ferramentas e utilitários para auxiliar o desenvolvedor Java.
  - Inclui nele, o JRE, para que seja possível rodar os programas criados.

## Linha do tempo das versões do Java

- Começou em 1995.
- No começo, as versões do Java demoravam muito para serem lançadas! O Java 6 foi lançado em 2006, por exemplo.
- Java 7 foi lançado em 2011, 5 anos após o Java 6. Muito tempo sem nenhuma versão nova.
- Java 8 foi o grande divisor de águas do Java, lançado 3 anos depois do Java 7. Foram implementadas diversas novidades que são muito usadas até hoje.
- No Java 9, setembro de 2017, a Oracle decidiu lançar novas versões do Java a cada 6 meses. Podendo ser versão ***FR(feature release)*** ou ***LTS(long term support)***. Essa versão foi uma FR. Serve para demonstrar novas funcionalidades, sem compromisso que esses novos recursos serão efetivamente inseridos no Java e só recebem suporte até o novo lançamento de uma nova versão.
- Java 10, março de 2018, também uma FR.
- Java 11, setembro de 2018, uma ***LTS***, previsto para ter atualização até 2027.
- As versões da 12 até 16 foram ***FR***.
- Java 17, a ***LTS*** mais recente. Lançada em setembro de 2021. Veio com todas as funcionalidades acumuladas e aprovadas das versões ***FR*** anteriores.
- Em 2021, a Oracle propos lançar uma LTS a cada 2 anos. O Java 21 provavelmente será uma LTS. Em setembro de 2023.

## Conhecendo as distribuições de JDKs e licenças de uso

- Existem diversas opções o que faz com que você não dependa de apenas um fornecedor.
- Existe o Java Community Process, um site que cria as regras e padrões que definem como uma instituição ou empresa, tem que seguir.
- OpenJDK por exemplo, é a implementação das referências da JCP. O código fonte é aberto.
- Existem vários: Oracle OpenJDK, Eclipse Temurin, Amazon Corretto, etc...