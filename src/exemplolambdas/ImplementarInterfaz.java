package exemplolambdas;

/**
 *
 * @author ylagorebollar
 */
public class ImplementarInterfaz implements ILambdas{

    @Override
    public void operacion(int a, int b) {
        System.out.println(a*b);
    }
    
}
