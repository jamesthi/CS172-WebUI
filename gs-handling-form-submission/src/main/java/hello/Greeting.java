package hello;

public class Greeting {

    private String content;
    private String results;
    private String numResults;

    public String getContent() {
        return content;
    }
    
    public String getResults() {
    	return results;
    }
    
    public String getNumResults() {
    	return numResults;
    }
    
    public void setNumResults(String s)
    {
    	this.numResults = s;
    }
    
    public void setResults(String r)
    {
    	this.results = r;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
