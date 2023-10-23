package Ejercicio1;

public class TestSistemaSolar {
    public static void main(String[] args) {
        SistemaSolar.getInstance().addPlaneta(new Planeta(1, Tipo.ROCOSO, 0.387, 1000));
        SistemaSolar.getInstance().addPlaneta(new Planeta(2, Tipo.GASEOSO, 0.723, 2000));
        SistemaSolar.getInstance().addPlaneta(new Planeta(3, Tipo.ROCOSO, 1, 3000));
        SistemaSolar.getInstance().addPlaneta(new Planeta(4, Tipo.ROCOSO, 1.524, 4000));
        SistemaSolar.getInstance().addPlaneta(new Planeta(5, Tipo.GASEOSO, 5.203, 5000));
        SistemaSolar.getInstance().addPlaneta(new Planeta(6, Tipo.GASEOSO, 9.537, 6000));
        SistemaSolar.getInstance().addPlaneta(new Planeta(7, Tipo.GASEOSO, 19.191, 7000));
        SistemaSolar.getInstance().addPlaneta(new Planeta(8, Tipo.ROCOSO, 30.069, 8000));

        Telescopio telescopio=new Telescopio();

        for(int i=0;i<8;i++){
            System.out.println(telescopio.distancia(SistemaSolar.getInstance().getPlaneta(i)));
            System.out.println(telescopio.tipo(SistemaSolar.getInstance().getPlaneta(i)));
            System.out.println();
        }
    }
}
