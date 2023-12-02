package com.example.testrecyclerview

import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.RecyclerView

class FragmentAdapter(private val mList: List<ViewHolder>): RecyclerView(), Parcelable {
    constructor(parcel: Parcel) : this(TODO("mList")) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FragmentAdapter> {
        override fun createFromParcel(parcel: Parcel): FragmentAdapter {
            return FragmentAdapter(parcel)
        }

        override fun newArray(size: Int): Array<FragmentAdapter?> {
            return arrayOfNulls(size)
        }
    }


}