
public class R3 {
    public String str;

    public static void main(String[] args) {
        R3 eb = new R3();
        String resultado = eb.Elbuilder("Hola");
        System.out.println(resultado);
    }

    public String Elbuilder(String aconcat){
        this.str = aconcat;
        StringBuilder sb = new StringBuilder();
        sb.append(str + " ");
        sb.append(str + " ");
        sb.append(str);

        return sb.toString();
    }


}