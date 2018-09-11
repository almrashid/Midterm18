package design;

public  abstract class EzPaySystem {
  public double salary;
    public double bonus;

    public abstract void payment();

    public abstract void collectInfo();

    public double paySalary(double salary,double bonus){
       this.salary= salary+salary*bonus;

        return salary;
    }






}
