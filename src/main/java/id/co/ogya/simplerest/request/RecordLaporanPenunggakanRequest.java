package id.co.ogya.simplerest.request;

public class RecordLaporanPenunggakanRequest {

	private String namaPelanggan;
	private Integer bulanTunggakan;
	private Integer tahunTagihan;
	private Long tagihan;
	private String status;

	public String getNamaPelanggan() {
		return namaPelanggan;
	}

	public void setNamaPelanggan(String namaPelanggan) {
		this.namaPelanggan = namaPelanggan;
	}

	public Integer getBulanTunggakan() {
		return bulanTunggakan;
	}

	public void setBulanTunggakan(Integer bulanTunggakan) {
		this.bulanTunggakan = bulanTunggakan;
	}

	public Integer getTahunTagihan() {
		return tahunTagihan;
	}

	public void setTahunTagihan(Integer tahunTagihan) {
		this.tahunTagihan = tahunTagihan;
	}

	public Long getTagihan() {
		return tagihan;
	}

	public void setTagihan(Long tagihan) {
		this.tagihan = tagihan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
