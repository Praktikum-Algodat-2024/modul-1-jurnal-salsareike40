//kelas ManusiaViral
public class ManusiaViral {
    String nama;
    String keterampilan;
    int usia;
    String hobi;
    ManusiaViral next;

    public ManusiaViral(String nama, String keterampilan, int usia, String hobi) {
        this.nama = nama;
        this.keterampilan = keterampilan;
        this.usia = usia;
        this.hobi = hobi;
        this.next = null;
    }
}

//kelas singlelinkedlist
public class SingleLinkedList {
    private ManusiaViral kepala;

    public SingleLinkedList() {
        this.kepala = null;
    }

    public void tambahDepan(String nama, String keterampilan, int usia, String hobi) {
        ManusiaViral manusiaBaru = new ManusiaViral(nama, keterampilan, usia, hobi); 
        manusiaBaru.next = kepala;
        kepala = manusiaBaru;
    }

    public void tambahBelakang(String nama, String keterampilan, int usia, String hobi) {
        ManusiaViral manusiaBaru = new ManusiaViral(nama, keterampilan, usia, hobi);
        if (kepala == null) {
            kepala = manusiaBaru;
        } else {
            ManusiaViral temp = kepala;
            while (temp.next != null) {
                temp = temp.next; 
            }
            temp.next = manusiaBaru;
        }
    }

    public void hapusDepan() {
        if (kepala != null) {
            kepala = kepala.next;
        }
    }

    public void hapusBelakang() {
        if (kepala != null) {
            if (kepala.next == null) {
                kepala = null;
            } else {
                ManusiaViral temp = kepala;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public void tampilkanDaftar() {
        ManusiaViral temp = kepala;
        while (temp != null) {
            System.out.println("Nama: " + temp.nama + ", Keterampilan: " + temp.keterampilan + ", Usia: " + temp.usia + ", Hobi: " + temp.hobi);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList daftar = new SingleLinkedList(); 
        daftar.tambahDepan("Kak Gem", "Kasi Faham", 32, "Bikin Meme"); 
        daftar.tambahBelakang("Vadel", "Dance Getter", 18, "Dance");
        daftar.tambahBelakang("Loli",
