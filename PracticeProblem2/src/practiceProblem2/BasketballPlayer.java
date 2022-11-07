package practiceProblem2;


public class BasketballPlayer implements Comparable<BasketballPlayer>

{
//variables being declared (ppg means points per game)
private String firstName;
private String lastName;
private double ppg;

//constructor for variables 
public BasketballPlayer(String first,String last,double ppg)
{
	
firstName=first;
lastName=last;
this.ppg=ppg;

}
//used to return last name first name and points per game (ppg)
public String toString() 
{
	
return lastName +", "+ firstName + ", (" + ppg +")";

}
//this method called compareto does just that compares firstname lastname and ppg makes 
//makes sure they are equal
public int compareTo(BasketballPlayer BBP)

{
	
if(ppg==BBP.ppg)
	
{
	
int last = lastName.compareTo(BBP.lastName);

if (last == 0)
{
	
int first = firstName.compareTo(BBP.firstName);
// this checks all data is equal to 0 then return 
return ((first == 0) ? firstName.compareTo(BBP.firstName) : first);
}

return (lastName.compareTo(BBP.lastName));
}

else if(ppg>BBP.ppg)
	
{ 
return -1;
} 
else	
{ 
return 1;
}
	}
		}