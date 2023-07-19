public class Silla {
    private int sillaLibre=4;

    public synchronized void qSilla(int i) throws InterruptedException{
        while (sillaLibre==0){
            wait();
            System.out.println("Filosofo "+i+" agarra una silla" );
            sillaLibre--;
        }
    }

    public synchronized void sSilla(int i) throws InterruptedException{
        sillaLibre++;
        System.out.println("Filosofo "+i+" suelta una silla" );
        notify();
    }
}
