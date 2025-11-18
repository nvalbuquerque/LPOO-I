import java.util.Arrays;

public class C_12 extends C implements I1, I2 {
    float[][] atributo3;
    
    public C_12() {
        super();
        this.atributo3 = new float[2][2];
    }
    
    public C_12 (String atributo1, float atributo2) {
        super(atributo1, atributo2);
        this.atributo3 = new float[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.atributo3[i][j] = 1.0f;
            }
        }
    }
    
    @Override
    public void operacao1() {
        System.out.println("Passou pelo metodo operacao 1()");
        System.out.println("Atributo 1: " + this.atributo1);
        System.out.println("Atributo 2: " + this.atributo2);
        System.out.println("Atributo3: " + Arrays.deepToString(this.atributo3));
    }
    
    @Override
    public void operacao2() {
        System.out.println("Passou pelo metodo operacao2()");
    }
}