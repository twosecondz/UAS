import java.util.ArrayList;

class Akun {
    public String id;

    public Akun(String id) {
        this.id = id;
    }

}

class Admin {

}

class Customer {
    Keranjang keranjang;
    ArrayList<Invoice> invoiceSelesai;

}

abstract class Driver {

}

class AdminDriver extends Driver {
    public Admin akun;
    public ListBarang listBarang;
    public ArrayList<Transaksi> listTransaksi;
}

class CustomerDriver extends Driver {
    public Customer akun;
    public Transaksi transaksi;
    public ListBarang barang;
}

class Keranjang {
    ArrayList<Barang> barang;
}

class Barang {
}

class ListBarang {
    ArrayList<Barang> barang;
}

class Transaksi {
    public Customer akun;
    ArrayList<Barang> barang;
}

class Invoice {
    public Transaksi transaksi;
    Pembayaran pembayaran;
}

abstract class Pembayaran {
    public String id;

    public Pembayaran(String id) {
        this.id = id;
    }

}

class QRIS extends Pembayaran {

    public QRIS(String id) {
        super(id);

    }

}

class Bank extends Pembayaran {

    public Bank(String id) {
        super(id);
    }

}

class COD extends Pembayaran {

    public COD(String id) {
        super(id);
    }

}

public class Main {
    public Akun akun;
    public Driver driverAkun;

    public void login() {
  
    }

    public static void main(String[] args) {

    }

}
