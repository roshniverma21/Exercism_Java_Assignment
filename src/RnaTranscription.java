class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        
        String rnaStrand = "";
        for(int i =0;i<dnaStrand.length();i++){
            char ch = dnaStrand.charAt(i);
            if(ch == 'G' )
                rnaStrand += 'C';
            else if(ch == 'C' )
                rnaStrand += 'G';
            else if(ch == 'T' )
                rnaStrand += 'A';
            else if(ch == 'A' )
                rnaStrand += 'U';
            else 
    			throw new IllegalArgumentException("Invalid input");
    		}
        return rnaStrand;
    }

}
