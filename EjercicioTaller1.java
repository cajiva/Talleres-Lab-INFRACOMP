import java.util.*;
public class EjercicioTaller1 extends Thread {
    
    private int n;
    private int opcion;

    public EjercicioTaller1(int n, int opcion)
    {
        this.n = n;
        this.opcion = opcion;
    }

    @Override
    public void run()
    {
        if(opcion == 1)
        {
            for (int i = 1; i <=n; i+=2) {
                System.out.println("Impar "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        else
        {
            for (int i = 2; i <=n; i+=2) {
                System.out.println("Par "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar Limite");
        int lim = sc.nextInt();

        EjercicioTaller1 t1 = new EjercicioTaller1(lim, 1);
        EjercicioTaller1 t2 = new EjercicioTaller1(lim, 2);

        t1.start();
        t2.start();

    }

}
