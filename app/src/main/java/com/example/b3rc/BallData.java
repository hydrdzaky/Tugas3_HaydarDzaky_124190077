package com.example.b3rc;

import java.util.ArrayList;

public class BallData {
    private static  String[] nama = new String[]{"Baseball", "Bola basket", "Biliar", "Bulu Tangkis", "Bola Sepak", "Golf", "Ping Pong", "Bola Takraw", "Bola Tenis", "Bola Voli"};

    private static int[] gambar = new int[]{R.drawable.baseball, R.drawable.basketball, R.drawable.billiard, R.drawable.bulutangkis, R.drawable.football, R.drawable.golf, R.drawable.pingpong, R.drawable.takraw, R.drawable.tennis, R.drawable.voley};

    public static ArrayList<BallModel> getListData(){
        BallModel BallModel = null;
        ArrayList<BallModel> list = new ArrayList<BallModel>();
        for ( int i = 0; i < nama.length; i++){
            BallModel = new BallModel();
            BallModel.setGambarBall(gambar[i]);
            BallModel.setNamaBall(nama[i]);
            list.add(BallModel);
        }
        return list;
    }
}
