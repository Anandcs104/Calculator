package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.tanand3.calculator.R;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    Button button;
    ItemClick itemClick;

    public MyViewHolder(View itemView,ItemClick itemClick) {
        super(itemView);
        button = itemView.findViewById(R.id.button1);
        button.setOnClickListener(this);
        this.itemClick = itemClick;
    }

    @Override
    public void onClick(View v) {

        itemClick.onItemClick(v,getAdapterPosition());

//        if(itemClick != null){
//
//        }
    }

}
