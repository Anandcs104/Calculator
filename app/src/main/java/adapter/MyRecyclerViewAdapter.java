package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tanand3.calculator.R;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private LayoutInflater layoutInflater;
    private String[] data;
    private ItemClick itemClick;

    public MyRecyclerViewAdapter(Context context, String[] data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.recycl_item,parent,false);
        return new MyViewHolder(view,itemClick);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.button.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public void setClickListener(ItemClick itemClick){
        this.itemClick = itemClick;
    }

    public String getdata(int Position){
        return data[Position];
    }
}
