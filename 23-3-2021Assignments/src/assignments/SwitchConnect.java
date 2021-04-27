package assignments;

public class SwitchConnect {
public static void main(String[] args) {
	for(int i=0;i<args.length;i++){
		
	switch (args[i]){
	case "a":
		System.out.println("connecting.....");
		break;
	case "b":
		System.out.println("connected.....");
		break;
	case "c":
		System.out.println("Cancelling.....");
		break;
	case "d":
		System.out.println("diconnected....");
		break;
	default:
		System.out.println("invalid");
		
	}
}
}
}
