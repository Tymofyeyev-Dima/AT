package spanEng;


import java.io.File;
import java.io.IOException;


public class SpanRunner{
	public static void main( String args[] ) throws IOException{
            SpanishToEnglish test = new SpanishToEnglish(new File("H:\\workspace\\src\\maps\\spanEng\\spantoeng.dat"));
            System.out.println(test.translate("yo quiero una ordenador virus"));
            System.out.println(test.translate("todas de los muchachos tienen interno memoria"));
            System.out.println(test.translate("mi pelo es cafe"));
            System.out.println(test.translate("tu quieres tinta con su papel"));
            System.out.println(test.translate("rearrancar el ordenador a vacio el pantalla"));
	}
}