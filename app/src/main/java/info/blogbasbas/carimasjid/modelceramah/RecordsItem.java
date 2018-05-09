package info.blogbasbas.carimasjid.modelceramah;

import com.google.gson.annotations.SerializedName;

public class RecordsItem{

	@SerializedName("UrlImage")
	private String urlImage;

	@SerializedName("Judul")
	private String judul;

	@SerializedName("Deskripsi")
	private String deskripsi;

	@SerializedName("Timestamp")
	private String timestamp;

	@SerializedName("Uploader")
	private String uploader;

	@SerializedName("Url")
	private String url;

	public void setUrlImage(String urlImage){
		this.urlImage = urlImage;
	}

	public String getUrlImage(){
		return urlImage;
	}

	public void setJudul(String judul){
		this.judul = judul;
	}

	public String getJudul(){
		return judul;
	}

	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	public String getTimestamp(){
		return timestamp;
	}

	public void setUploader(String uploader){
		this.uploader = uploader;
	}

	public String getUploader(){
		return uploader;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"RecordsItem{" + 
			"urlImage = '" + urlImage + '\'' + 
			",judul = '" + judul + '\'' + 
			",deskripsi = '" + deskripsi + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			",uploader = '" + uploader + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}