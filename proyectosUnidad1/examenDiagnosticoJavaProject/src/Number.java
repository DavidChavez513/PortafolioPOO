public class Number {
    private int num1, num2, num3;
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public static boolean validateNumbers(int num){ // METODO PARA VALIDAR QUE EL NUMERO SEA DE 3 DIGITOS
        boolean is3Digits;
        if (num > 99 && num < 1000) {
            is3Digits = true;
        } else {
            is3Digits = false;
        }

        return is3Digits;
    }

    public void ordenar() {
        int nume1, nume2,nume3;
        if (this.num1 >= this.num2 && this.num1 >= this.num3) {

            nume1 = this.num1 * 1000000;
            setNum1(nume1);
            if (this.num2 > this.num3){
                nume2 = this.num2 * 1000;
                setNum2(nume2);
                
            } else {
                nume3 = this.num3 * 1000;
                setNum3(nume3);
            }
        } else if (this.num1 >= this.num2 && this.num1 <= this.num3) {
            nume1 = this.num1 * 1000;
            setNum1(nume1);
            if (this.num2 > this.num3){
                nume2 = this.num2 * 1000000;
                setNum2(nume2);

            } else {
                nume3 = this.num3 * 1000000;
                setNum3(nume3);
            }
        } else if (this.num1 <= this.num2 && this.num1 <= this.num3) {

            if (this.num2 > this.num3){
                nume2 = this.num2 * 1000000;
                setNum2(nume2);
                nume3 = this.num3 * 1000;
                setNum3(nume3);
            } else {
                nume3 = this.num3 * 1000000;
                setNum3(nume3);
                nume2 = this.num2 * 1000;
                setNum2(nume2);
            }
        }
    }

    public long calcularNumero(){
        long numeroCalculado;
        ordenar();
        numeroCalculado = this.num1 + this.num2 + this.num3;

        return numeroCalculado;
    }

}
