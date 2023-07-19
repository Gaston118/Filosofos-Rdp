public class Main {
    public static void main(String[] args) {
        Tenedor [] tenedores = new Tenedor[5];
        for(int i=0; i<tenedores.length; i++){
            tenedores[i]=new Tenedor(i);
        }
        Silla s = new Silla();

        Filosofo filosofos[] = new Filosofo[5];
        for(int i=0; i<filosofos.length; i++){
            filosofos[i]=new Filosofo(i, tenedores[i], tenedores[(i+1)%5], s);
        }

        for(int i=0; i<filosofos.length; i++){
            filosofos[i].start();
        }
    }
}