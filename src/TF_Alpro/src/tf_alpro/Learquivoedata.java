/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tf_alpro;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
//import learquivoedata.Acidente;

/**
 *
 * @author tessis
 */
public class Learquivoedata {

    private ListDoubleLinked lista;
   // private ListDoubleLinked lista1;

 
    public Learquivoedata(){
        
        lista = new ListDoubleLinked();
        //lista1 = new ListDoubleLinked();
        
    }
        
    


    public void leArquivo() {

        // TODO code application logic here
        /**
         * exemplo de substr var str = "Hello world!"; var res =
         * str.substring(0, 1)
         *
         * The result of res will be: H DATA_HORA 20090101 04:00 AV ASSIS
         * BRASIL;ABALROAMENTO;20090101
         * 04:00;QUINTA-FEIRA;0;0;0;0;2;0;0;0;0;0;0;0;0;BOM;NOITE;NORTE 20
         * campos
         */
        
        //lê arquivo - esta fixo, temos que mudar para receber por parâmetro
        Path path = Paths.get("acidentes.csv");
        try (BufferedReader br = Files.newBufferedReader(path,
                Charset.defaultCharset())) {
            String linha = null;
            linha = br.readLine();
            while ((linha = br.readLine()) != null) {
                // separador: ;
                Scanner sc = new Scanner(linha).useDelimiter(";");
                //String x = sc.next();
                String rua = sc.next();
                String rv[] = rua.split(" ");
                String ruatipo = rv[0];
                String ruanome = rv[1];
                
                String tipo = sc.next();

                //tratamento da data
                String dataHora = sc.next();
                SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd HH:mm");
                Date date = null;
                try {
                    date = df.parse(dataHora);

                } catch (Exception ex) {
                    System.out.println(ex);
                }

                String diaSemana = sc.next();

                //converter para inteiro
                int feridos = Integer.parseInt(sc.next());
                int mortes = Integer.parseInt(sc.next());
                int mortesPos = Integer.parseInt(sc.next());
                int fatais = Integer.parseInt(sc.next());
                int auto = Integer.parseInt(sc.next());
                int taxi = Integer.parseInt(sc.next());
                int lotacao = Integer.parseInt(sc.next());
                int onibusUrb = Integer.parseInt(sc.next());
                int onibusInt = Integer.parseInt(sc.next());
                int caminhao = Integer.parseInt(sc.next());
                int moto = Integer.parseInt(sc.next());
                int carroca = Integer.parseInt(sc.next());
                int bicicleta = Integer.parseInt(sc.next());
                //fim das conversoes

                String tempo = sc.next();
                String noiteDia = sc.next();
                String regiao = sc.next();

                //System.out.println(sc.next() + "; " + sc.next() + "; " + sc.next());
                //System.out.println(date);
               // System.out.println("teste");

                //cria acidente
                Acidente a1 = new Acidente(rua,ruatipo, ruanome, tipo, date,
                        diaSemana, feridos, mortes, mortesPos, fatais,
                        auto, taxi, lotacao, onibusUrb, onibusInt,
                        caminhao, moto, carroca, bicicleta, tempo, noiteDia, regiao);
                
                //ordenar por rua
                               
                
                //insere na lista
                lista.add(a1);
                //Collections.(lista);
                //teste rua avenida
                //lista.add(rv[0]);
                //lista.add(rv[1]);
            }
        } catch (IOException e) {
            System.out.println("Problema na leitura do arquivo" + e);
        }
        System.out.println(lista);
    }

}
