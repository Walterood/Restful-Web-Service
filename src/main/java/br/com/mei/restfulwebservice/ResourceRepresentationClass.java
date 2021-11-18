package br.com.mei.restfulwebservice;

// Classe de representação dos recursos do serviço web.
public class ResourceRepresentationClass {
	
	private final long idMessageWS;
	private final String contentMessageWS;
	
	public ResourceRepresentationClass(long idMessageWS, 
			String contentMessageWS) {
		this.idMessageWS = idMessageWS;
		this.contentMessageWS = contentMessageWS;
	}

	public long getIdMessageWS() {
		return idMessageWS;
	}

	public String getContentMessageWS() {
		return contentMessageWS;
	}
	
}