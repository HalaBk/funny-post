package entite;

public class post {
	private int id_poste;
	private String title;
	private String body;
	
	public post(int id_poste , String title, String body ) {
		this.id_poste=id_poste;
		this.title=title;
		this.body=body;
	}
	public int getId() {
		return id_poste;
	}
	public void setId(int id_poste) {
		this.id_poste = id_poste;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
