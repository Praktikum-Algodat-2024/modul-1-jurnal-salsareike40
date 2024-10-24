public class SingleLinkedList {
    private ManusiaViral head;

    public SingleLinkedList() {
        this.head = null;
    }

    public void addFirst(String nama, String skills, int umur, String hobi) {
        ManusiaViral newManusiaViral = new ManusiaViral(nama, skills, umur, hobi); 
        newManusiaViral.next = head;
        head = newManusiaViral;
    }

    public void addLast(String nama, String skills, int umur, String hobi) {
        ManusiaViral newManusiaViral = new ManusiaViral(nama, skills, umur, hobi);
        if (head == null) {
            head = newManusiaViral;
        } else {
            ManusiaViral temp = head;
            while (temp.next != null) {
                temp = temp.next; 
            }
            temp.next = newManusiaViral;
        }
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                ManusiaViral temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public void displayList() {
        ManusiaViral temp = head;
        while (temp != null) {
            System.out.println("Nama: " + temp.nama + ", Skills: " + temp.skills + ", Umur: " + temp.umur + ", Hobi: " + temp.hobi);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList(); 
        list.addFirst("Kak Gem", "Kasi Faham", 32, "Bikin Meme"); 
        list.addLast("Vadel", "Dance Getter", 18, "Dance");
        list.addLast("Loli", "ATM Berjalan", 35, "Donasi");
        list.addLast("Agus", "Roasting", 35, "Donasi");
        list.addLast("Fufu Fafa", "Buka Kaskus", 30, "Buka Kaskus");
        list.deleteLast();
        list.deleteFirst();
        list.displayList();
    }
}