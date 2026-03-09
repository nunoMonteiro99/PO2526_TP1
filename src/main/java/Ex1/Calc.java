package Ex1;

public class Calc {

    private double heigth;
    private double weigth;
    private double radius;

    public Calc(double heigth, double weigth){
       if (heigth == 0 || weigth == 0){
           throw new IllegalArgumentException("height or weigth can´t be 0 ");
       }
        this.heigth = heigth;
        this.weigth = heigth;
    }
    public Calc(double radius){
        if (radius == 0){
            throw new IllegalArgumentException("radius can´t be 0 ");
        }
        this.radius = radius;
    }

    /**
     * @return area do retangulo
     */
    public double areaRectangle(){
        return this.heigth * this.weigth;
    }

    /**
     * @return area do circulo
     */
    public double areaCircle(){
        return Math.PI * this.radius * this.radius;
    }

    /**
     * @return area do triangulo
     */
    public double areaTriangle(){
        return (this.heigth * this.weigth)/2;
    }
}

