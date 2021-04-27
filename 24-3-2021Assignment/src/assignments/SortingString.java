package assignments;

public class SortingString {

	public static void main(String[] args) {

		String input[]={"java","PHP","python","c#","C programming","c++"};
		for(String h:input){
			System.out.println(h);
		}
		String s=" ";
		for(int i=0;i<input.length-1;i++){
			for(int j=0;j<input.length-1-i;j++){
				if(input[i].compareTo(input[j])<1){
					s=input[j];
					input[j]=input[j+1];
					input[j+1]=s;
				}
			}
		}
		System.out.println("+++++++++++++++++++");
		for(String h:input){
			System.out.println(h);
		}
	}
}
//outputjava
/*PHP
python
c#
C programming
c++
+++++++++++++++++++
C programming
c++
c#
PHP
python
java*/
