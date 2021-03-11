/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengarangbuku;

/**
 *
 * @author srich
 */
public class PengarangBuku {
    String nama, tempatlahir, nbuku;
    int bbuku,umur;
    
    public PengarangBuku( String nama, String tanggallahir, int bbuku, int umur) {
        this.nama = nama;
        this.tempatlahir= tempatlahir;
        this.umur = umur;
        this.bbuku = bbuku;
    }
    
    public void menulisbuku (){
        System.out.println(this.nama +"menulis buku" + this.nbuku);
    }
    
    public void mengirimkannaskah () {
        System.out.println(this.nama + "mengirim naskah" + this.nbuku);
    }
    
    public int berapabuku () {
        System.out.println(this.nama + "berapa buku " + this.bbuku);  
        return bbuku = 0;
}
}
