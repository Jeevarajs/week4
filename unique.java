package week4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;

import net.bytebuddy.description.method.MethodDescription.ForLoadedMethod;

public class unique {
	public static void main(String[] args) {
		String name="babub";
		int length=name.length();
		char[] charArray = name.toCharArray();
		//System.out.println(charArray);
	for (int i = 0; i < length-1; i++) {
		
	}
	Set<Character>val=new HashSet<Character>();
	val.add('b');
	val.add('a');
	val.add('b');
	val.add('u');
	val.add('b');
	String[] split = name.split("b");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);	
	}	
	}
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


