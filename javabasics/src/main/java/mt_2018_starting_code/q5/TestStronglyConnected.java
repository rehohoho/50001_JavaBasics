package mt_2018_starting_code.q5;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStronglyConnected	{
    public static void main	(String[]	args){
        int nodecount=5;
        int linkcount=5;
        ArrayList<Integer>	listOfLink	=	new ArrayList<Integer>	(	Arrays.asList(0,1,		1,2,		2,3,		3,4,		4,0));
        System.out.println(StronglyConnected.isStronglyConnected(nodecount,	linkcount,	listOfLink));
    }
}
