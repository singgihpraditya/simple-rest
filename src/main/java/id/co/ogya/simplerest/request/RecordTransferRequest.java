package id.co.ogya.simplerest.request;

public class RecordTransferRequest {
	private String noRekeningPengirim;
	private String noRekeningPenerima;
	private Long jumlahTranfer;

	public String getNoRekeningPenerima() {
		return noRekeningPenerima;
	}

	public void setNoRekeningPenerima(String noRekeningPenerima) {
		this.noRekeningPenerima = noRekeningPenerima;
	}

	public String getNoRekeningPengirim() {
		return noRekeningPengirim;
	}

	public void setNoRekeningPengirim(String noRekeningPengirim) {
		this.noRekeningPengirim = noRekeningPengirim;
	}

	public Long getJumlahTranfer() {
		return jumlahTranfer;
	}

	public void setJumlahTranfer(Long jumlahTranfer) {
		this.jumlahTranfer = jumlahTranfer;
	}
}
