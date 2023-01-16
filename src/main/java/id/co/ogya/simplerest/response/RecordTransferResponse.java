package id.co.ogya.simplerest.response;

public class RecordTransferResponse {
	private Boolean success;
	private String referenceNumber;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}
}
