package cn.tju.edu.js;

public class DispatcherController {
	
	public String PageDispatcher() {
		return pageTag.trim();
	}
	
	public String Word2HtmlDispatcher() {
		return documentName.trim();
	}
	
	public String DocumentDispatcher() {
		return documentName.trim();
	}
	
	public String getPageTag() {
		return pageTag;
	}

	public void setPageTag(String pageTag) {
		this.pageTag = pageTag;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	private String pageTag;
	private String documentName;
}
