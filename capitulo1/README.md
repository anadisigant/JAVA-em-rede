# CAPÍTULO 1
## PROGRAMANDO EM JAVA

Este capítulo apresenta os fundamentos da linguagem Java, abordando conceitos estruturais, tipos de dados, operadores e mecanismos essenciais para construção de aplicações. A organização segue a lógica progressiva do livro: primeiro estrutura da linguagem, depois manipulação de dados, operações, controle de fluxo e, por fim, aspectos mais avançados como entrada/saída e concorrência.

---

### ORIENTAÇÃO A OBJETOS 

Java é uma linguagem orientada a objetos. Isso significa que todo comportamento é organizado em classes e objetos, e o acesso aos seus membros é controlado por modificadores específicos.

| Modificador | Característica                            |
|:---------   |:------                                    |
| Public      | Pode ser acessado por qualquer objeto     |
| Protected   | Pode ser acessado por qualquer objeto de uma classe que esteja no mesmo pacote ou por objetos de classes que estejam na mesma hierarquia de herança.      |
| Default     | Acessado por qualquer objeto de uma classe que esteja no mesmo pacote. O acesso default não é estabelecido explicitamente, sendo válido caso não seja utilizado o modificador public, private ou protected.      |
| Private     | Acessado só por objetos da classe que contêm o elemento private.      |

Esses modificadores definem o nível de encapsulamento, um dos pilares da orientação a objetos. A escolha correta impacta diretamente na segurança e na organização do código.

A classe `String`, embora pareça primitiva no uso cotidiano, é um objeto imutável amplamente utilizado. Seus métodos oferecem recursos para manipulação textual.


| Método                    | Descrição |
|---------------------------|------------|
| charArray()               | Retorna um array do tipo char contendo os caracteres que formam a String. |
| charAt(int)               | Retorna um caractere da String de acordo com a posição especificada. |
| compareTo()               | Compara o valor textual de dois objetos String. Retorna 0 se forem iguais; valor maior ou menor que zero caso contrário. A comparação segue a ordem alfabética do idioma. |
| concat()                  | Utilizado para concatenar o valor textual de dois objetos String. |
| equals()                  | Compara o valor textual de dois objetos String. Retorna true se forem iguais; false caso contrário. |
| equalsIgnoreCase()        | Compara o valor textual de dois objetos String ignorando diferenças entre maiúsculas e minúsculas. Retorna true se forem iguais; false caso contrário. |
| getChars()                | Copia caracteres de uma String para outra. |
| indexOf()                 | Retorna a posição do caractere passado como parâmetro em relação à String. Caso o caractere não seja encontrado, retorna -1. |
| lastIndexOf()             | Retorna a posição do caractere passado como parâmetro em relação à String considerando a última ocorrência. Caso não seja encontrado, retorna -1. |
| length()                  | Retorna o número de caracteres da String. |
| regionMatches()           | Compara apenas parte da String, conforme especificado. |
| replace()                 | Troca um caractere por outro. |
| substring()               | Retorna parte de uma String extraída conforme os parâmetros do método. |
| toLowerCase()             | Retorna um objeto String com todos os caracteres em minúsculo. |
| toString()                | Retorna uma String contendo o valor textual do objeto. |
| toUpperCase()             | Retorna um objeto String com todos os caracteres em maiúsculo. |
| trim()                    | Remove espaços em branco no início e no fim do valor textual associado ao objeto. |
| valueOf()                 | Converte o parâmetro em String, invocando para isso o método toString() da classe correspondente. |

---

### TIPOS PRIMITIVOS

Os tipos primitivos representam valores básicos manipulados diretamente pela linguagem. Eles não são objetos e possuem tamanho fixo na memória.

| Tipo     | Tamanho (bits) | Valores suportados                          |
|----------|----------------|---------------------------------------------|
| boolean  | 1              | true ou false                               |
| char     | 16             | Unicode (0 a 2^16 - 1)                      |
| byte     | 8              | -2^7 a 2^7 - 1                              |
| short    | 16             | -2^15 a 2^15 - 1                            |
| int      | 32             | -2^31 a 2^31 - 1                            |
| long     | 64             | -2^63 a 2^63 - 1                            |
| float    | 32             | ±1.4E-45 a ±3.4E38 (ponto flutuante)        |
| double   | 64             | ±4.9E-324 a ±1.7E308 (ponto flutuante)      |

Além do tipo, a linguagem define diferentes formas de representação literal.

| Tipo         | Representação                           | Exemplo        |
|--------------|------------------------------------------|---------------|
| octal        | Número precedido de 0                    | 07, 098       |
| hexadecimal  | Número precedido de 0x                   | 0x54c         |
| int          | Padrão para números inteiros             | 25, -463      |
| long         | Número inteiro terminado com L           | 56L           |
| char         | Literal entre aspas simples              | 'a', 'T'      |
| float        | Número terminado com f                   | 8.6f          |
| double       | Padrão para ponto flutuante              | 5.87, -34.567 |

Para integração com APIs e coleções, os tipos primitivos possuem classes equivalentes (wrappers).

| Tipo primitivo | Classe equivalente     | Método de conversão        |
|---------------|------------------------|----------------------------|
| boolean       | java.lang.Boolean      | -                          |
| byte          | java.lang.Byte         | Byte.parseByte()           |
| short         | java.lang.Short        | Short.parseShort()         |
| int           | java.lang.Integer      | Integer.parseInt()         |
| long          | java.lang.Long         | Long.parseLong()           |
| char          | java.lang.Character    | -                          |
| float         | java.lang.Float        | Float.parseFloat()         |
| double        | java.lang.Double       | Double.parseDouble()       |

---

### OPERADORES

| Operador | Significado |
|----------|------------|
| **Operadores unários** | |
| ++ | Soma ao operando o valor 1, atribuindo o resultado ao operando. |
| -- | Subtrai do operando o valor 1, atribuindo o resultado ao operando. |
| +  | Altera o sinal do número/expressão para positivo. |
| -  | Altera o sinal do número/expressão para negativo. |
| !  | Inverte o valor de um literal/expressão de tipo boolean. |
| ( ) | Delimita escopo. |
| **Operadores aritméticos** | |
| *  | Multiplicação numérica. |
| /  | Divisão numérica. |
| +  | Soma numérica. |
| -  | Subtração numérica. |
| %  | Resto da divisão de números inteiros. |
| **Operadores de comparação** | |
| == | Igualdade. |
| != | Diferença. |
| <  | Menor que. |
| >  | Maior que. |
| <= | Menor ou igual a. |
| >= | Maior ou igual a. |
| **Operadores sobre bits** | |
| &  | AND bit a bit. |
| \| | OR bit a bit. |
| ^  | XOR bit a bit. |
| ~  | Complemento dos bits (altera 0 para 1 e vice-versa). |
| << | Deslocamento de bits para esquerda. |
| >> | Deslocamento de bits para direita. |
| >>>| Deslocamento de bits para direita sem sinal. |
| **Operadores de atribuição** | |
| =   | Atribuição. |
| +=  | Soma com posterior atribuição. |
| -=  | Subtração com posterior atribuição. |
| *=  | Multiplicação com posterior atribuição. |
| /=  | Divisão com posterior atribuição. |
| %=  | Resto com posterior atribuição. |
| &=  | AND bit a bit com posterior atribuição. |
| \|= | OR bit a bit com posterior atribuição. |
| ^=  | XOR bit a bit com posterior atribuição. |
| <<= | Deslocamento à esquerda com posterior atribuição. |
| >>= | Deslocamento à direita com posterior atribuição. |
| >>>=| Deslocamento à direita sem sinal com posterior atribuição. |
| **Operadores lógicos** | |
| && | AND lógico condicional. |
| \||\| | OR lógico condicional. |
| !  | Negação lógica. |
| &  | AND lógico não condicional. |
| \|\ | OR lógico não condicional. |

### ESTRUTURAS DE CONTROLE  

As estruturas de controle determinam a ordem de execução das instruções em um programa. Elas permitem criar decisões, repetições e desvios no fluxo lógico, tornando possível modelar comportamentos dinâmicos.

Em Java, o fluxo padrão é sequencial. As estruturas abaixo permitem alterar esse fluxo conforme condições ou necessidades específicas.

#### Estruturas Condicionais

Permitem executar blocos de código com base em expressões booleanas.

```java
if (condicao) {
    // bloco executado se verdadeiro
} else {
    // bloco executado se falso
}
```

```java
switch (variavel) {
    case valor1:
        break;
    case valor2:
        break;
    default:
        break;
}
```

As estruturas condicionais avaliam expressões booleanas e direcionam o fluxo do programa conforme o resultado da avaliação. O `if` é indicado para decisões simples ou encadeadas, enquanto o `switch` é recomendado quando há múltiplos valores possíveis para uma mesma variável.

---

#### Estruturas de Repetição

Permitem executar um bloco de código múltiplas vezes.

```java
for (int i = 0; i < 10; i++) {
    // repetição controlada
}
```

```java
while (condicao) {
    // executa enquanto for verdadeiro
}
```

```java
do {
    // executa ao menos uma vez
} while (condicao);
```

As estruturas de repetição controlam a execução iterativa. O `for` é mais apropriado quando se conhece previamente o número de repetições. O `while` é utilizado quando a condição deve ser verificada antes da execução do bloco. O `do-while` garante pelo menos uma execução, pois a verificação ocorre ao final.

---

#### Desvios de Fluxo

Permitem interromper ou alterar a execução de laços.

- `break` → encerra o bloco de repetição ou `switch`.  
- `continue` → interrompe a iteração atual e segue para a próxima.  

Esses comandos oferecem controle fino sobre o comportamento de laços, permitindo interromper execuções ou pular etapas conforme a necessidade lógica do algoritmo.

---

### TRATAMENTO DE EXCEÇÕES  

O tratamento de exceções permite lidar com erros que ocorrem durante a execução do programa. Em vez de interromper abruptamente o sistema, é possível capturar e tratar situações inesperadas de forma controlada.

Em Java, exceções são objetos que representam condições anormais que surgem durante a execução.

#### Estrutura Básica

```java
try {
    // código que pode gerar exceção
} catch (TipoDaExcecao e) {
    // tratamento do erro
} finally {
    // executa independentemente de erro
}
```

- `try` → bloco que pode lançar exceção.  
- `catch` → captura e trata a exceção.  
- `finally` → executa sempre, ocorrendo erro ou não.  

O bloco `try` contém o código potencialmente problemático. Caso ocorra uma exceção, o fluxo é direcionado ao `catch` correspondente. O `finally` é geralmente utilizado para liberar recursos, como conexões ou arquivos.

---

#### Lançamento de Exceções

```java
throw new IllegalArgumentException("Valor inválido");
```

O método pode ainda indicar que propaga uma exceção:

```java
public void metodo() throws IOException {
    // código
}
```

O uso de `throw` permite lançar explicitamente uma exceção. A cláusula `throws` informa que o método não trata a exceção internamente, delegando a responsabilidade ao método chamador.

---

#### Hierarquia de Exceções

- `Exception` → exceções verificadas (checked).  
- `RuntimeException` → exceções não verificadas (unchecked).  

Exceções verificadas devem ser obrigatoriamente tratadas ou declaradas com `throws`. Exceções não verificadas normalmente indicam erros de lógica ou falhas de programação.

O tratamento adequado de exceções contribui para robustez, previsibilidade e manutenção do sistema, sendo parte fundamental do desenvolvimento orientado a boas práticas.


### OPERAÇÕES DE ENTRADA E SAÍDA

Em aplicações que se comunicam via arquivos ou rede, é fundamental definir previamente o tipo de dado que será enviado e como será interpretado no destino.

A comunicação ocorre por meio de streams (fluxos de bytes). O stream não interpreta o conteúdo; ele apenas transporta bytes. A interpretação depende da classe utilizada para leitura.

| Classe            | Descrição |
| ----------------- | --------- |
| ObjectInputStream | Recebe uma sequência de bytes e interpreta como um objeto. |
| ObjectOutputStream | Envia um objeto "convertendo-o" em uma sequência de bytes. |
| DataInputStream | Recebe uma sequência de bytes e interpreta como um tipo primitivo. |
| DataOutputStream | Envia um tipo primitivo "convertendo-o" em uma sequência de bytes. |
| FileInputStream | Entrada de dados a partir de arquivos. |
| FileOutputStream | Saída de dados para arquivos. |

---

### PROGRAMAÇÃO CONCORRENTE

A programação concorrente permite a execução simultânea de múltiplos fluxos de execução (threads). Esse modelo é essencial para aplicações modernas, como servidores e sistemas distribuídos.