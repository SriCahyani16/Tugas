/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengarangbuku;
import java.util.Scanner;

/**
 *
 * @author srich
 */
public class uji {
    
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan nama : ");
        String nama = input.nextLine();
        System.out.print("Masukan Tempat lahir : ");
        String tempatlahir = input.nextLine();
        System.out.print("Masukan umur : ");
        int  umur = input.nextInt();
        System.out.print("Masukan banyaknya buku : ");
        int bbuku = input.nextInt();
        
        
        PengarangBuku pb = new PengarangBuku (nama, tempatlahir, umur, bbuku);
        pb.menulisbuku();
        pb.mengirimkannaskah();
        pb.berapabuku();
    }
    
}
