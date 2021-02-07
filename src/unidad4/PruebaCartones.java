package unidad4;

public class PruebaCartones {
public static void main(String[] args) {
	int [][][] cartones = {
			{{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1}},
			{{2,2,2,2,2,2,2,2,2},
					{2,2,2,2,2,2,2,2,2},
					{2,2,2,2,2,2,2,2,2}}
			};
	System.out.println(cartones.length);
	System.out.println(cartones[0].length);
	System.out.println(cartones[0][0].length);
}
}
