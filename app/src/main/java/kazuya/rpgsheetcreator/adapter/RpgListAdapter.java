package kazuya.rpgsheetcreator.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import kazuya.rpgsheetcreator.R;
import kazuya.rpgsheetcreator.model.Rpg;

/**
 * Created by Kazuya on 21/06/2015.
 */
public class RpgListAdapter extends RecyclerView.Adapter<RpgListAdapter.RpgViewHolder> {

    private final List<Rpg> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class RpgViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTvRpgName;
        public TextView mTvRpgType;
        public RpgViewHolder(CardView v) {
            super(v);
            mTvRpgName =  (TextView) v.findViewById(R.id.tv_rpg_name);
            mTvRpgType = (TextView)  v.findViewById(R.id.tv_rpg_description);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RpgListAdapter(List<Rpg> dataset) {
        mDataset = dataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RpgListAdapter.RpgViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        CardView v = (CardView)LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rpg_card_list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        return new RpgViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RpgViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
