//Ryan Beebe p2
public class num3{

	private double rad;
	
		public num3(){
			rad=0;
		}
			public num3(double r){
				rad=r;
			}
				public double volume(){
					double volume;
						volume = (4.0/3) * 3.14 * rad*rad*rad;
							return volume;
				}
					public double SurAr(){
						double sa;
							sa = 4 * 3.14 * rad * rad;
								return sa;
					}
						public double GC(){
							double greatc;
								greatc = 3.14*rad*rad;
									return greatc;
						}
							public String toString(){
								String str;
									str = "Volume:" + volume() + "\n" + "Surface Area: " + SurAr() + "\n" + "Great Circle: " + GC();
										return str;
							}
	}
	