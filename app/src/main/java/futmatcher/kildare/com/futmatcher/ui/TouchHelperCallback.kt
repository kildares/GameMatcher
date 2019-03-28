package futmatcher.kildare.com.futmatcher.ui

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import futmatcher.kildare.com.futmatcher.recyclerview.MatchAdapter

class TouchHelperCallback : ItemTouchHelper.Callback() {

    var mAdapter : MatchAdapter? = null;

    fun TouchHelperCallback(adapter : MatchAdapter){
        mAdapter = adapter;
    }

    override fun getMovementFlags(recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?): Int {

    }

    override fun onMove(recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?, target: RecyclerView.ViewHolder?): Boolean {

    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder?, direction: Int) {
        if(viewHolder?.itemId?.equals()!!){
            
        }
    }
}