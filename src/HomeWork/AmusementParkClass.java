package HomeWork;

class AmusementParkClass //sub-class
{
    int height, weight;
	void check()
	{
		if (height > 90 && height < 200)
		{
			if(weight > 15 && weight < 95)
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

