import static java.lang.Math.sqrt;

public class Operaciones {
    private Double n1;
    private Double n2;

    public Operaciones() {
        this.n1 = n1;
        this.n2 = n2;
    }
    private Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    private Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double Sumar(){return n1 + n2;}

    public Double Raiz1(){return sqrt(n1);}
    public Double Raiz2(){return sqrt(n2);}

    public Double Seno1(){return Math.sin(n1);}
    public Double Cos1(){return Math.cos(n1);}
    public Double Tan1(){return Math.tan(n1);}

    public Double Seno2(){return Math.sin(n2);}
    public Double Cos2(){return Math.cos(n2);}
    public Double Tan2(){return Math.tan(n2);}
}
