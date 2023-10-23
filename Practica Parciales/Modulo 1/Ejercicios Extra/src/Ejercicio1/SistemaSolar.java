package Ejercicio1;

public class SistemaSolar {
    private static SistemaSolar instance;

    private Planeta[] planetas;

    private SistemaSolar(){
        planetas=new Planeta[8];
    }


    public static SistemaSolar getInstance(){
        if(instance==null){
            instance=new SistemaSolar();
        }
        return instance;
    }

    public void addPlaneta(Planeta p){
        for(int i=0;i<planetas.length;i++){
            if(planetas[i]==null){
                planetas[i]=p;
                break;
            }
        }
    }

    public Planeta getPlaneta(int i){
        return planetas[i];
    }
}
