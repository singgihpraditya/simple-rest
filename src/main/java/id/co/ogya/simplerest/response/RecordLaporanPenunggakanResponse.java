package id.co.ogya.simplerest.response;

public class RecordLaporanPenunggakanResponse {
	private Boolean success;
	private String referenceNumber;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
}
