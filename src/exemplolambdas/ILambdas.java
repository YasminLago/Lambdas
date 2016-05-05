package exemplolambdas;
@FunctionalInterface
/**
 *
 * @author ylagorebollar
 */
public interface ILambdas {
    //Interfaz funcional: So poden ter un metodo abstracto
    public abstract void operacion(int a, int b);
    
    default void saudo(){
        System.out.println("Saudo dende un metodo default");
    }
        
    
}
