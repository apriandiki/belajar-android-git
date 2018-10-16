package com.example.amikom.myapplication.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amikom.myapplication.R;
import com.example.amikom.myapplication.room.Mahasiswa;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {
    private Context mContext;
    private List<Mahasiswa> myList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvAlamatLengkap;
        public TextView tvJurusan;
        public TextView tvNamaLengkap;
        public TextView tvNIM;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAlamatLengkap = itemView.findViewById(R.id.tvAlamatLengkap);
            tvJurusan = itemView.findViewById(R.id.tvJurusan);
            tvNIM = itemView.findViewById(R.id.tvNIM);
            tvNamaLengkap = itemView.findViewById(R.id.tvNamaLengkap);
        }
    }

    public RecycleAdapter(Context mContext, List<Mahasiswa> albumList) {
        this.mContext = mContext;
        this.myList = albumList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_mahasiswa, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        final Mahasiswa album = myList.get(i);
        myViewHolder.tvNamaLengkap.setText(album.getNamaLengkap());
        myViewHolder.tvNIM.setText(album.getNim());
        myViewHolder.tvJurusan.setText(album.getJurusan());
        myViewHolder.tvAlamatLengkap.setText(album.getAlamatLengkap());


        myViewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
//                FragmentManager fm = ((Activity)mContext).getFragmentManager();
//                UpdateDialog dialogFragment = new UpdateDialog(onclickRecycler);
//                Bundle bundle = new Bundle();
//                bundle.putInt("id",myList.get(i).getId());
//                bundle.putInt("id_list",i);
//                dialogFragment.setArguments(bundle);
//                dialogFragment.show(fm," ");
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }


}
