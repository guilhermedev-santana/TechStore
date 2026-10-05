# 💻 TechStore

Projeto de **Loja de Eletrônicos** desenvolvido em Java com foco na aplicação dos conceitos de **Programação Orientada a Objetos (POO)**.

O sistema simula o gerenciamento de produtos de uma loja de eletrônicos, permitindo adicionar, remover, buscar, listar produtos e atualizar seus preços.

## 🎯 Objetivo

O objetivo do projeto é desenvolver um sistema de gerenciamento de estoque aplicando conceitos fundamentais da Programação Orientada a Objetos, como:

* Abstração
* Encapsulamento
* Herança
* Polimorfismo
* Classes abstratas
* Enum
* Interface
* `ArrayList`
* Métodos estáticos
* Sobrescrita de métodos

## 🛒 Sobre o projeto

O **TechStore** representa uma loja de produtos eletrônicos.

Os produtos possuem informações como:

* ID
* Nome
* Marca
* Preço
* Categoria
* Estado do produto

A classe `Produto` é abstrata e serve como base para os diferentes tipos de produtos da loja.

Atualmente, o projeto possui a implementação de **Laptop**, que herda de `Produto` e adiciona características específicas, como tamanho da tela e modelo do processador.

## 📂 Estrutura do projeto

```text
src/
├── Produto.java
├── Laptop.java
├── CategoriaProdutos.java
├── EstadoProduto.java
├── FormatadorUtilitario.java
└── Inventario.java
```

## 📦 Produto

A classe `Produto` é uma classe abstrata responsável por representar as características comuns dos produtos.

Entre seus atributos estão:

* ID do produto
* Nome
* Marca
* Preço
* Categoria
* Estado

O ID é gerado automaticamente por meio de um atributo estático, assim como existe um contador da quantidade total de produtos criados.

A classe também possui o método abstrato:

```java
public abstract void fichaTecnica();
```

Esse método permite que cada tipo de produto apresente suas próprias informações.

## 💻 Laptop

A classe `Laptop` herda da classe `Produto`.

Além das características herdadas, possui:

* Tamanho da tela
* Modelo do processador

A categoria do produto é definida automaticamente como `LAPTOP`.

A ficha técnica apresenta informações como ID, modelo, marca, preço, categoria, estado, processador e tamanho da tela.

## 🏷️ Categorias

As categorias disponíveis no sistema são definidas pelo `enum CategoriaProdutos`:

```java
SMARTPHONE,
LAPTOP,
TABLET
```

Isso permite que o sistema seja posteriormente expandido para outros tipos de eletrônicos.

## 📊 Estados dos produtos

O estado de cada produto é definido pelo `enum EstadoProduto`:

```java
NOVO,
MONSTRUARIO,
RECONDICIONADO
```

Dessa forma, o sistema consegue diferenciar produtos novos, de mostruário e recondicionados.

## 📋 Inventário

A classe `Inventario` é responsável pelo gerenciamento dos produtos utilizando um:

```java
ArrayList<Produto>
```

Entre as operações disponíveis estão:

### ➕ Adicionar produto

Adiciona um produto ao inventário verificando se ele já está cadastrado.

### 🗑️ Remover produto

Remove um produto utilizando seu ID.

### 🔎 Buscar produto

Permite localizar um produto específico através do seu ID.

### 🏷️ Buscar por categoria

Realiza uma busca utilizando a categoria do produto e retorna os produtos encontrados.

### 💰 Atualizar preço

Permite atualizar o preço de um produto através do seu ID.

O sistema também realiza uma validação para impedir preços menores ou iguais a zero.

### 📦 Listar produtos

Exibe todos os produtos cadastrados no inventário.

Caso o inventário esteja vazio, o sistema informa ao usuário.

## 💰 Formatação de valores

A classe `FormatadorUtilitario` é responsável por formatar valores monetários utilizando o padrão brasileiro:

```text
R$ 1.500,00
```

Para isso, utiliza `NumberFormat` com a localidade `pt-BR`.

## 🧩 Conceitos de POO aplicados

### Abstração

A classe `Produto` é abstrata e representa as características comuns dos produtos da loja.

### Herança

A classe `Laptop` herda as características e comportamentos de `Produto`:

```java
public class Laptop extends Produto
```

### Encapsulamento

Os atributos das classes são privados e acessados através de métodos `get` e `set`.

### Polimorfismo

O método:

```java
fichaTecnica()
```

é declarado de forma abstrata em `Produto` e implementado pela classe `Laptop`.

### Enum

Os `enum` `CategoriaProdutos` e `EstadoProduto` são utilizados para representar opções previamente definidas no sistema.

### Coleções

O inventário utiliza `ArrayList` para armazenar os produtos dinamicamente.

## 🛠️ Tecnologias utilizadas

* **Java**
* **Programação Orientada a Objetos**
* **IntelliJ IDEA**
* **ArrayList**
* **Enum**
* **Interface**
* **Herança**
* **Abstração**
* **Encapsulamento**
* **Polimorfismo**

## 🚀 Possíveis melhorias

O projeto pode ser expandido futuramente com:

* Cadastro de smartphones;
* Cadastro de tablets;
* Menu interativo;
* Busca por nome ou marca;
* Filtro por estado do produto;
* Controle de quantidade em estoque;
* Cálculo do valor total do estoque;
* Sistema de vendas;
* Persistência dos dados em banco de dados;
* Interface gráfica.

## 👨‍💻 Autor

**Guilherme de Carvalho Santana**

Projeto desenvolvido para fins acadêmicos, com foco no aprendizado e aplicação prática dos conceitos de **Programação Orientada a Objetos em Java**.
