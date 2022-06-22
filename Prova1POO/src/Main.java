class Ponto {
    float x;
    float y;
}

class Circulo {
    Ponto p = new Ponto();

    public static float perimetro(float r) {
        float p = 2 * 3.14 * r;
        return p;
    }

    public float area(float r) {
        float a = 3.14 * r * r;
        return a;
    }

    public void calcularArea(float raio) {
        System.out.printf("O valor da area " + area(raio));
    }

    public void calcularPerimetro(float raio) {
        System.out.printf("O valor do perimetro é: " + perimetro(raio));
    }
}

class CalcularCirculos {
    Circulo[] circulos = new Circulo();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status;
        while (status == "S") {
            float raio;
            System.out.println("Informe o raio do circulo: ");
            raio = sc.nextFloat();
            circulos.calcularArea(raio);
            circulos.calcularArea(raio);
            System.out.println("Deseja informar outras informações de circulo? Responda S ou N.");
            status = sc.nextLine();
        }
    }
}