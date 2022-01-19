import java.util.*;
import java.io.*;
public class MerchandiseInventoryTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<Merchandise> list=new ArrayList<Merchandise>();
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ve00ym348\\Desktop\\ASSESSEMENT 1\\Assessement_1_ym348\\src\\input.dat"));
			
			String m=null;
			
			while((m=br.readLine())!=null)
			{
				String tokens[];
				tokens=m.split(" ");
				//System.out.println(tokens);
				list.add(new Merchandise(tokens[0],Integer.parseInt(tokens[1]),
						Double.parseDouble(tokens[2])));
			
			}
			System.out.println("Before sorting");
			for(Object i:list)
			{
				System.out.println(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Collections.sort(list,new AscendingOrderByName());
		System.out.println("After sorting By name");
		for(Object i:list)
		{
			System.out.println(i);
		}
		
		Collections.sort(list,new DescendingOrderByPrice());
		System.out.println("After sorting By Price");
		for(Object i:list)
		{
			System.out.println(i);
		}
	}

}
