package com.example.android.anawahidah_1202154337_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by AnaWahidahRizky on 24/02/2018.
 */
public class MenuAdapter extends
        RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private ArrayList<String> arrayListTitle; //Digunakan untuk Title
    private ArrayList<String> arrayListDesk; //Digunakan untuk desk
    private ArrayList<Integer> gambar; //Digunakan untuk Image/Gambar

    MenuAdapter(Context context, ArrayList<String> arrayListTitle, ArrayList<String> arrayListsDesk, ArrayList<Integer> gambar){
        this.arrayListTitle = arrayListTitle;
        this.arrayListDesk = arrayListsDesk;
        this.gambar = gambar;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, desk;
        private ImageView gambar;
        private LinearLayout ItemList;

        public ViewHolder(View itemView) {
            super(itemView);

            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            title = itemView.findViewById(R.id.txtViewTitle);
            desk = itemView.findViewById(R.id.txtViewDesk);
            gambar = itemView.findViewById(R.id.imageView);
            ItemList = itemView.findViewById(R.id.item_list);
        }
    }

    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.wordlist_item, parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(final MenuAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String title = arrayListTitle.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String desk = arrayListDesk.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer image = gambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.title.setText(title);
        holder.desk.setText(desk);
        holder.gambar.setImageResource(image); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Membuat Aksi Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                switch (position){
                    case 0:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("title", arrayListTitle.get(position));
//                        intent.putExtra("desk", arrayListDesk.get(position));
                        intent.putExtra("image", gambar.get(position));
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTitle.size();
    }


}