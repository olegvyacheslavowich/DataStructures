/**
 * Created by Олег on 20.12.2016.
 */
public class MainClass {
    public static void main(String[] args){
        String s = new String ("oelg");
        String o = new String ("o");
        if (s.hashCode() == o.hashCode()) System.out.println(s.hashCode() + " = " + o.hashCode());
      else
        System.out.println(s.hashCode() + " != " + o.hashCode());

        if (s.equals(o)) System.out.println(s + " = " + o);
        else System.out.println(s + " != " + o );

    }
}
