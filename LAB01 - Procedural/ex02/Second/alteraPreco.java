package Second;
/**
 * altera_preco
 */
public class alteraPreco {
   public int  altera_preco(float preco, float porcentagem) {
        float temp;
    
        if (porcentagem > -100) {
            temp = 1 + porcentagem/100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95 
            preco = temp;  // preço modificado
            return 0;
        } else {
            return -1;
        }
    }
}