public class Filosofo extends Thread{
    private int id;
    private Tenedor izq, der;
    private Silla s;

    public Filosofo(int id, Tenedor i, Tenedor d, Silla s)
    {
        this.id=id;
        this.izq=i;
        this.der=d;
        this.s=s;
    }

    public void run(){
        while (true){
            try {
                s.qSilla(id);
                izq.qTenedor(id);
                der.qTenedor(id);
                //Come

                der.sTenedor(id);
                izq.sTenedor(id);
                s.sSilla(id);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
