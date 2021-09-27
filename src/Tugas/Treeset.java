package Tugas;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		 TreeSet<String> ts = new TreeSet<String>();
		    ts.add("Adlan");
		    ts.add("Vida");
		    ts.add("Ridho");
		    
		    System.out.println("Tiga nama untuk treeset:" + ts);
		    ts.remove("Ridho");
		    System.out.println("Hapus Ridho : " + ts);
		    
		    TreeSet<String> t = new TreeSet<String>();
		    t.add("Ari");
		    t.add("Suryadi");
		    
		    ts.addAll(t);
		    
		    System.out.println("Elements in the TreeSet after addAll operation: " + ts);
		    ts.removeAll(t);
		    
		    System.out.println("Treeset hapus semua sebelum method: " + ts);
		    ts.pollFirst();
		    System.out.println("Hapus nama ke 1: " + ts);
		    ts.pollLast();
		    System.out.println("Hapus nama ke 2 (jadi habis): " + ts);

	}

}
