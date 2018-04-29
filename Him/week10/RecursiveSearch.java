import java.util.*;
public class RecursiveSearch{
	public static void main(String[] args) {
		System.out.println("asd");
		Scanner kb = new Scanner(System.in);
		int num[] = Arrays.stream(kb.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(num));
		int find = kb.nextInt();
		System.out.println(findIndex(find,num,"",0));
		kb.close();
	}

	public static String findIndex(int num, int array[], String res, int index){
		if(index >= array.length)
			return res.equals("")?"-1":res;
		else if( num == array[index] )
			return findIndex(num,array,(res+(res.equals("")?index:","+index)),++index);
		return findIndex(num,array,res,index);
		//return (index >= array.length)?(res.equals("")?"-1":res):( num == array[index] )?findIndex(num,array,(res+(res.equals("")?index:","+index)),++index):findIndex(num,array,res,++index);
	}
}