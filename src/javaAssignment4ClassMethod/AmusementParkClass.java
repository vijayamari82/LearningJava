package javaAssignment4ClassMethod;

class AmusementParkClass //sub-class
{
    int height1, weight1;
	void check1()
	{
		if (height1 > 90 && height1 < 200)
		{
			if(weight1 > 15 && weight1 < 95)
			{
				System.out.println("You are allowed to Ride");
			}
			else  //Weight Else Block
			{
				System.out.println("You are not Eligble to Ride");
			}
		}
		else //Height Else Block
		{
			System.out.println("You are not Eligble to Ride");
		}
	}
}

