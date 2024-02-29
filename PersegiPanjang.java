public class PersegiPanjang {
    public int panjang;
    public int lebar;

    //Method untuk mencetak info 
    public void cetakInfo() 
    {
        System.out.println("Persegi panjang, panjang : " + panjang + ", lebar : " + lebar);
    }

    public static void main(String[] args) 
    {
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

        arrayOfPersegiPanjang[0] = new PersegiPanjang();
        arrayOfPersegiPanjang[0].panjang = 110;
        arrayOfPersegiPanjang[0].lebar = 30;

        arrayOfPersegiPanjang[1] = new PersegiPanjang();
        arrayOfPersegiPanjang[1].panjang = 80;
        arrayOfPersegiPanjang[1].lebar = 40;

        arrayOfPersegiPanjang[2] = new PersegiPanjang();
        arrayOfPersegiPanjang[2].panjang = 100;
        arrayOfPersegiPanjang[2].lebar = 20;

        // Memanggil method cetakInfo untuk setiap objek PersegiPanjang
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) 
        {
            System.out.print("Persegi panjang ke-" + (i + 1) + ", ");
            arrayOfPersegiPanjang[i].cetakInfo();
        }
    }
}