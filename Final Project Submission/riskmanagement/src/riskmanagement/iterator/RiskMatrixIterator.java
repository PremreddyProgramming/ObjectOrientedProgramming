package riskmanagement.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import riskmanagement.enums.LikelihoodEnum;
import riskmanagement.enums.Rating;
import riskmanagement.enums.SeverityEnum;
import riskmanagement.model.RiskMatrixEntry;

public class RiskMatrixIterator implements Iterable<RiskMatrixEntry>{
	
	List<LikelihoodEnum> likelihoodlist = Arrays.asList(LikelihoodEnum.values());
	List<SeverityEnum> severitylist = Arrays.asList(SeverityEnum.values());

	@Override
	public Iterator<RiskMatrixEntry> iterator() {
		return new RiskMatrixEntryIterator();
	}

	class RiskMatrixEntryIterator implements Iterator<RiskMatrixEntry> {
	    
		int count =0;
		
	    // constructor
		RiskMatrixEntryIterator() {
	        count =0;
	    }
	      
	    // Checks if the next element exists
	    public boolean hasNext() {
	    	return count<5;
	    }
	      
	    // moves the cursor/iterator to next element
	    public RiskMatrixEntry next() {
	    	int value = (likelihoodlist.get(count).getValue() *severitylist.get(count).getValue());
	    	Rating rating = calculateRating(value);
	    	RiskMatrixEntry riskMatrix = new RiskMatrixEntry(likelihoodlist.get(count),severitylist.get(count),value,rating );
	    	count++;
	    	return riskMatrix;
	    }

		private Rating calculateRating(int value) {
			if(value<=4) return Rating.LOW;
			if(value>4 && value<12) return Rating.MEDIUM;
			if(value>12 && value<16) return Rating.HIGH;
			return Rating.VERYHIGH;
		}
	      
	    
	}
}
