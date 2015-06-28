package leofx.nusmaps;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by leona_000 on 10/6/2015.
 */
public class DirectoryAdapter extends BaseExpandableListAdapter {
    private Context ctx;
    private List<Pair> parentDir;

    public DirectoryAdapter(Context c, List<Pair> parentDir) {
        ctx = c;
        this.parentDir = parentDir;
    }
    @Override
    public int getGroupCount() {
        return parentDir.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return parentDir.get(groupPosition).childList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return parentDir.get(groupPosition).groupName;
    }

    @Override
    public Object getChild(int parentPosition, int childPosition) {
        return parentDir.get(parentPosition).childList.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int parentPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String groupTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.parent_layout, parent, false);
        }
        TextView parentTextView = (TextView) convertView.findViewById(R.id.parent_text);
        parentTextView.setTypeface(null, Typeface.BOLD);
        parentTextView.setText(groupTitle);
        return convertView;
    }

    @Override
    public View getChildView(int parentPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String childTitle = (String) getChild(parentPosition,childPosition);
        if (convertView == null) {
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.child_layout, parent, false);
        }

        TextView childTextView = (TextView) convertView.findViewById(R.id.child_text);
        childTextView.setText(childTitle);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}

