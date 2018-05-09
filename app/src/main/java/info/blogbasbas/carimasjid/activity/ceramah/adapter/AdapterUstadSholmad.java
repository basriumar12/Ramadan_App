package info.blogbasbas.carimasjid.activity.ceramah.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import info.blogbasbas.carimasjid.R;
import info.blogbasbas.carimasjid.modelceramah.RecordsItem;
import info.blogbasbas.carimasjid.utils.Constant;

/**
 * Created by User on 06/05/2018.
 */

public class AdapterUstadSholmad extends RecyclerView.Adapter<AdapterUstadSholmad.MyHolder> {
    private ClickListener clickListener;
    private List<RecordsItem> dataset;

    public AdapterUstadSholmad(ClickListener clickListener) {
        this.clickListener = clickListener;
        this.dataset = new ArrayList<RecordsItem>();

    }
    public void setWIsata (List<RecordsItem> recordsItems){
        dataset = recordsItems;
        notifyDataSetChanged();
    }
    public RecordsItem getRecordsItem(int position){
        return dataset.get(position);
    }


    public interface ClickListener {
        void onClick (int position);
    }

    @NonNull
    @Override
    public AdapterUstadSholmad.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list,parent,false);
        return new MyHolder(view,clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterUstadSholmad.MyHolder holder, int position) {
        final RecordsItem recordsItem = dataset.get(position);

        holder.tvJudulItem.setText(recordsItem.getJudul());
        holder.tvTanggalItem.setText(recordsItem.getTimestamp());
        holder.tvPenerbitItem.setText(recordsItem.getUploader());

        Picasso.get().load(Constant.BASE_URL+recordsItem.getUrl())
                .placeholder(R.drawable.ic_video_library_black_24dp)
                .error(R.drawable.ic_video_library_black_24dp)
                .into(holder.imgListItem);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imgListItem;
        TextView tvJudulItem, tvTanggalItem, tvPenerbitItem;
        public MyHolder(View itemView,final ClickListener clickListener) {
            super(itemView);

            imgListItem =itemView.findViewById(R.id.img_list_item);
            tvJudulItem=itemView.findViewById(R.id.tv_judul_list_item);
            tvTanggalItem=itemView.findViewById(R.id.tv_tanngal_list_item);
            tvPenerbitItem = itemView.findViewById(R.id.tv_penerbit_list_item);
        }
    }
}
