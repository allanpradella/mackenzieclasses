package TestaPonto;

public class Ponto {
    private int x, y;

    // construtor que recebe as coordenadas como parametro e atribui as variaveis
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // sobrescreve o metodo tostring da classe object para fornecer a string do
    // objeto
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }

    // calcular a distancia do ponto atual (this) e outroponto
    public double distancia(Ponto outroPonto) {
        // calcula a diferença entre as coordenadas do X sendo ela atual(this) ou o
        // outroponto.
        int deltaX = this.x - outroPonto.x;
        // calcula a diferença entre as coordenadas do Y sendo ela atual(this) ou o
        // outroponto.
        int deltaY = this.y - outroPonto.y;
        // fórmula para calcular a distância euclidiana entre dois pontos (d = sqrt((x2
        // - x1)^2 + (y2 - y1)^2))
        // a função Math.sqrt calcula a raiz quadradada da soma dos quadrados da
        // diferença, o que resulta na dist. euclidiana
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // sobrescreve o método equals da classe object e verifica se o atual é igual ao
    // objeto fornecido, se forem iguais será True
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ponto outroPonto = (Ponto) obj;
        return x == outroPonto.x && y == outroPonto.y;
    }
}
