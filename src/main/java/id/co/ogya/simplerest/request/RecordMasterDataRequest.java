package id.co.ogya.simplerest.request;

public class RecordMasterDataRequest {
	private String nama;
	private String alamat;
	private Long nominalSaldo;
	private String telpon;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Long getNominalSaldo() {
		return nominalSaldo;
	}

	public void setNominalSaldo(Long nominalSaldo) {
		this.nominalSaldo = nominalSaldo;
	}

	public String getTelpon() {
		return telpon;
	}

	public void setTelpon(String telpon) {
		this.telpon = telpon;
	}

}
