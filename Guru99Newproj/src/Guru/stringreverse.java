package Guru;

public class stringreverse {

	public static void main(String[] args) {
		  String actWord = "Product it a middle data Description ID1 ID2 QTY Rate1 Rate2";
		    String outputWord = null;
		    String[] arr = actWord.split(" ");

		    StringBuffer buf = new StringBuffer();
		    for (int i = 0; i < arr.length; i++) {
		        System.out.println(arr[i] + "=" + (i < arr.length - 5));
		        if (i < arr.length - 5) {
		            buf.append(arr[i] + " ");

		        } else
		            buf.append("|" + arr[i]);
		    }
		    System.out.println("output - " + buf.toString().trim());
	}

}
