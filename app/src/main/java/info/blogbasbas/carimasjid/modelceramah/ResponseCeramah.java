package info.blogbasbas.carimasjid.modelceramah;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseCeramah{

	@SerializedName("records")
	private List<RecordsItem> records;

	public void setRecords(List<RecordsItem> records){
		this.records = records;
	}

	public List<RecordsItem> getRecords(){
		return records;
	}

	@Override
 	public String toString(){
		return 
			"ResponseCeramah{" + 
			"records = '" + records + '\'' + 
			"}";
		}
}