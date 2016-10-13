/**
 * Created by Alexandre LEFAILLET on 13/10/2016.
 */

import java.io.*;
import java.util.*;

public class mapred {
    public static void main(String[] args) {

        String ligne = "";
        String fichier = "\\res\\prenoms.csv";
        ArrayList<Integer> counter = new ArrayList<Integer>(10);
        for(int i = 0; i<10; i++){
            counter.set(i,0);
        }

        InputStream ips = new FileInputStream(fichier);
        InputStreamReader ipsr = new InputStreamReader(ips);
        BufferedReader br = new BufferedReader(ipsr);

        while ((ligne=br.readLine())!=null){
            String[] parts = ligne.split(";");
            counter.set(parts.length,counter.get(parts.length)+1);
        }
        br.close();
        //answer are the couples i && counter.get(i)
    }

}
