package indexelement;

public class IndexElement {

	
	public static int  findIndex (int[] array, int t) {
        if (array == null) return -1;
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] array = {23,12,45,67,90,23,54,67,8,1,14};
      System.out.println("Index position of 45 is: " + findIndex(array, 45));
      System.out.println("Index position of 1 is: " + findIndex(array, 1));
       }
}
