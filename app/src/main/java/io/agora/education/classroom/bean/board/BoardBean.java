package io.agora.education.classroom.bean.board;

import android.os.Parcel;
import android.os.Parcelable;

public class BoardBean implements Parcelable {
    public static String BOARD = "board";

    private BoardInfo info;
    private BoardState state;

    public BoardBean() {
    }

    public BoardBean(BoardInfo info, BoardState state) {
        this.info = info;
        this.state = state;
    }

    public BoardInfo getInfo() {
        return info;
    }

    public void setInfo(BoardInfo info) {
        this.info = info;
    }

    public BoardState getState() {
        return state;
    }

    public void setState(BoardState state) {
        this.state = state;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.info, flags);
        dest.writeParcelable(this.state, flags);
    }

    protected BoardBean(Parcel in) {
        this.info = in.readParcelable(BoardInfo.class.getClassLoader());
        this.state = in.readParcelable(BoardState.class.getClassLoader());
    }

    public static final Creator<BoardBean> CREATOR = new Creator<BoardBean>() {
        @Override
        public BoardBean createFromParcel(Parcel source) {
            return new BoardBean(source);
        }

        @Override
        public BoardBean[] newArray(int size) {
            return new BoardBean[size];
        }
    };
}
