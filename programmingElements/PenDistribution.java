class PenDistribution{
	public static void main(String[] args){
		int pens= 14;
		int students =3;
	//distributing pen among the students and also find the non distributed ones
		int per_person =14/3;
		int non_distributed_pens = 14%3;
		System.out.println("The Pen Per Student is "+ per_person+" and the remaining pen not distributed is "+ non_distributed_pens);
	}
}