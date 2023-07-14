# Notas gerais a respeito da linguagem Java

Notas rápidas de pontos importantes destacados na linguagem.

## Gerais

- Java não analisa valor mas sim tipos - exemplo: uma variável do tipo int com valor 4 cabe em uma variável do tipo byte, mas dá erro pelos tipos serem diferentes
- Recomendado utilizar `equals()` para comparar valores
- `Break` rotulado, insere-se um nome para os laços for no caso de break especifica-se qual laço deverá ser quebrado (curso Cod3r- aula 83). Continue tbm tem essa funcionalidade

## Estrutura de dados

- **Arrays**: Tamanho fixo e homogêno (mesmos tipos) e indexado
- **Collections**: Tamanho variável, não homogêneo (tipos variáveis), não suporta tipos primitivos (usar Wrappers)
- **Set**: Não indexado, não ordenado, não aceita repetição
- **List**: Indexada, aceita repetição
- **Map**: Chave/valor, chave não aceita repetição, valor aceita repetição
- **Queue**: Fila (FIFO)
- **Stack**: Pilha (LIFO)

final => cria uma constante, em métodos não deixa ser sobrescrito
var => infere o tipo pelo valor da variável
tipos primitivos => byte, short, int, long, float, double, char, boolean
print => mostra o log na mesma linha
println => a nova llinha só é acrescida no final do texto, ou seja, só o próximo print será colocado na linha de baixo
printf => formata os valores passados, não quebra a linha para isso utilizar \n
nextLine() => escaneia valores de entrada do tipo String
nextInt() => escaneia valores de entrada do tipo int (este método  não lê a quebra de linha ou enter se tiver, para resolver basta dar um nextLine() depois de um nextInt())

OO
==

super() => chamar método super na classe filha invoca o construtor padrão da classe pai
this() => referencia um método construtor dentro de outro método construtor dentro de uma classe

** Uma classe herda apenas de uma outra classe, não possui multipla herança em Java
** Classes abstratas geralmente são para serem herdadas, classes abstratas não podem ser instânciadas
** Uma classe pode implementar várias interfaces tudo em interfaces são public e abstract
** Não pode diminuir a visibilidade de um método sobrescrito (public -> protected), somente aumentar a visibilidade
** Geralmente atributos constantes (final) são do tipo public
** Polimorfismo estático é o mesmo que sobrecarga de métodos, só que os tipos dos parâmetros já são inferidos na classe, ingessando a mesma
** Interfaces funcionais só podem ter um método dentro do arquivo - decorator @FuncionalInterface
** Interfaces funcionais podem ter mais de um método desde que os outros métodos sejam default, ou seja, com implementação, assim também como métodos static
** Generics tem que ser a classe (Wrapper) e não o tipo primitivo

** Streams geralmente são a partir de Lists, collections, objetos iteraveis
** Streams os métodos map, filter, reduce, etc.. são a partir de streams e não são utilizadas em métodos de Array como Arrays, List etc... 

** Erros - RunTimeException não são obrigadas a ser tratadas

** Blocos estáticos - servem para inicializar e fazer alguma lógica sem ser no construtor, mas que é inicializado quando a classe é instanciada, como o construtor

** Em API'S a lógica de negócio são inseridas dentro de arquivos services

https://www.guj.com.br/t/o-que-e-a-classe-stringbuilder/36995/2
