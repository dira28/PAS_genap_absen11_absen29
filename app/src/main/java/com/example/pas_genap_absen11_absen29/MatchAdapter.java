package com.example.pas_genap_absen11_absen29;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;
public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {

    private Context context;
    private List<Match> matchList;

    public MatchAdapter(Context context, List<Match> matchList) {
        this.context = context;
        this.matchList = matchList;
    }

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_match, parent, false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {
        Match match = matchList.get(position);
        holder.textEvent2.setText(match.getStrEvent());
        holder.textDate2.setText(match.getDateEvent());

        holder.textHomeScore.setText(match.getIntHomeScore() != null ? match.getIntHomeScore() : "-");
        holder.textAwayScore.setText(match.getIntAwayScore() != null ? match.getIntAwayScore() : "-");

        Glide.with(context)
                .load(match.getStrHomeTeamBadge())
                .into(holder.imgHomeBadge);

        Glide.with(context)
                .load(match.getStrAwayTeamBadge())
                .into(holder.imgAwayBadge);
    }

    @Override
    public int getItemCount() {
        return matchList.size();
    }

    public static class MatchViewHolder extends RecyclerView.ViewHolder {
        TextView textEvent2, textDate2, textHomeScore, textAwayScore;
        ImageView imgHomeBadge, imgAwayBadge;

        public MatchViewHolder(@NonNull View itemView) {
            super(itemView);
            textEvent2 = itemView.findViewById(R.id.textEvent2);
            textDate2 = itemView.findViewById(R.id.textDate2);
            textHomeScore = itemView.findViewById(R.id.textHomeScore);
            textAwayScore = itemView.findViewById(R.id.textAwayScore);
            imgHomeBadge = itemView.findViewById(R.id.imgHomeBadge);
            imgAwayBadge = itemView.findViewById(R.id.imgAwayBadge);
        }
    }
}
