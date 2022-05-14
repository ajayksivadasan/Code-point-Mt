package com.aks.codepointmt.ui.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aks.codepointmt.R;
import com.aks.codepointmt.data.network.response.StudentsDTO;
import com.bumptech.glide.Glide;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.ViewHolder> {
    Context context;
    List<StudentsDTO> studentsList;

    public StudentsAdapter(Context context, List<StudentsDTO> studentsList) {
        this.context = context;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_students_item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(studentsList.get(position).getPhoto()).into(holder.ivStudent);
        holder.tvName.setText(studentsList.get(position).getName());
        holder.tvAdmissionNumber.setText("" + studentsList.get(position).getAdmissionNumber());
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public void updateAdapter(List<StudentsDTO> students) {
        this.studentsList = students;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvAdmissionNumber;
        ImageView ivStudent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvAdmissionNumber = itemView.findViewById(R.id.tvAdmissionNumber);
            ivStudent = itemView.findViewById(R.id.ivStudent);
        }
    }
}
