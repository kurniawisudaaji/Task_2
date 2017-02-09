/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author KURNIA (1301150068)
 */

public class Mahasiswa 
{
    private String Nama, NIM, Status;
    private int a;
    private char Nilai[];
    
    public  Mahasiswa()
    {
        Status = "Tidak Lulus";
        a = 0;
        Nilai = new char[10];
    }
    
    public  Mahasiswa(String NIM, String Nama)
    {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Status = "Tidak Lulus";
        a = 0;
        Nilai = new char[10];
    }
    
    
    public String getNama()
    {
        return Nama;
    }
    public void setNama(String Nama)
    {
        this.Nama= Nama;
    }
    
    
    public String getNIM()
    {
        return NIM;
    }
    public void setNIM(String NIM)
    {
        this.NIM = NIM;
    }
    
    
    public String getStatus()
    {
        return Status;
    }
    public void setStatus(String Status){
        this.Status= Status;
    }
    
    
    public int geta()
    {
        return a;
    }
    public void seta(int a)
    {
        this.a = a;
    }
    
    
    public char getNilai(int i)
    {
        return Nilai[a];
    }
    public void setNilai(char[] Nilai)
    {
        this.Nilai = Nilai ;
    }
    public void addNilai (char Nilai)
    {
        if (a < 10)
        {
            this.Nilai[a] = Nilai;
            a = a+1;
        }  
    }
       
    @Override
    public String toString()
    {
        String Mahasiswa;
        Mahasiswa = NIM+", "+Nama+", "+Status+", "+" Nilai = ";
        for (int b = 0; b < a; b++)
        {
            Mahasiswa = Mahasiswa + Nilai[b] + ", ";
        }
        return Mahasiswa;
    }
    
    public char cekNilai(Mahasiswa p){
        char i = 0;
        for (char j = 'A'; j < 'E'; j++)
        {
            for (int k = 0; k < a; k++)
            {
                if(Nilai[k] == j)
                {
                    for(int q = 0; q<p.a; q++)
                    {
                        if(p.Nilai[q] == j)
                        {
                            return j;
                        }
                    }
                }
            }
        }
        return i;
    }
}