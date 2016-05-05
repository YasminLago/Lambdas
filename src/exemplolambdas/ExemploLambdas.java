package exemplolambdas;

/**
 *
 * @author ylagorebollar
 */
public class ExemploLambdas {
    public static void main(String[] args) {
        
    //Clase anonima
    ILambdas op = new ILambdas(){
        
        public void operacion(int a, int b){
            System.out.println("Op: "+(a*b));
        }
    };
    op.operacion(5, 9);
    op.saudo();
        
    //Expresion Lambda
    ILambdas op2 = (int a, int b)-> System.out.println("Op2: "+a*b);
    op2.operacion(3, 6);
    op2.saudo();
    }
    
}
