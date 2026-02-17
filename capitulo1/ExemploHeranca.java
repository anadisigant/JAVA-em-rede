package capitulo1;

public class ExemploHeranca {

    // Construtor padrão (não faz nada explicitamente)
    public ExemploHeranca() {}

    public static void main(String[] args) {

        // Cria um objeto Quadrado com lado = 10
        Quadrado q = new Quadrado(10);

        // Chama o método area().
        // Como Quadrado NÃO sobrescreve area(),
        // o método herdado de Forma será utilizado.
        System.out.println("Área do quadrado de lado 10: " + q.area());

        // Cria um objeto Triangulo com base = 6 e altura = 3
        Triangulo t = new Triangulo(6, 3);

        // Chama o método area().
        // Como Triangulo sobrescreve area(),
        // será executado o método da própria classe Triangulo.
        System.out.println("Área do triângulo de base 6 e altura 3: " + t.area());
    }
}

// Classe base (superclasse)
class Forma {

    // Atributo herdado pelas subclasses
    double lado;

    // Método padrão de cálculo de área
    // Aqui considera área como lado * lado
    // (faz sentido para quadrado, mas não para todas as formas)
    public double area() {
        return lado * lado;
    }
}

// Classe Quadrado herda de Forma
class Quadrado extends Forma {

    // Construtor recebe o valor do lado
    public Quadrado(double l) {

        // "this" refere-se ao objeto atual
        // Atribui o valor ao atributo herdado da superclasse
        this.lado = l;
    }

    // Não há sobrescrita do método area().
    // Portanto, utiliza o método herdado de Forma.
}

// Classe Triangulo herda de Forma
class Triangulo extends Forma {

    // Atributos próprios do Triangulo
    double base, altura;

    // Construtor recebe base e altura
    public Triangulo(double b, double a) {

        // Inicializa os atributos específicos do Triangulo
        this.base = b;
        this.altura = a;
    }

    // Sobrescreve o método area() da superclasse
    @Override
    public double area() {

        // Calcula a área do triângulo
        return (base * altura) / 2;
    }
}