package com.example.android.emojify;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

public class Emojifier {
    static final String LOG_TAG="";

    static void detectFaces(Context context, Bitmap bitmap){
        FaceDetector detector = new FaceDetector.Builder(context)
                .setTrackingEnabled(false)
                .setClassificationType(FaceDetector.ALL_CLASSIFICATIONS)
                .build();

        Frame frame = new Frame.Builder().setBitmap(bitmap).build();

        SparseArray<Face> faces = detector.detect(frame);

        Log.d(LOG_TAG, "detectFaces: number of faces = " + faces.size());

        if (faces.size()==0){
            Toast.makeText(context,"No faces detected", Toast.LENGTH_SHORT).show();
        }else{
            for (int i=0; i<faces.size(); i++){
                Face face = faces.valueAt(i);
                getClassifications(face);

            }
        }
        detector.release();
    }

    private static void getClassifications(Face face){

        Log.d(LOG_TAG, "getClassifications: smilingProb = " + face.getIsSmilingProbability());
        Log.d(LOG_TAG,"getClassifications: leftEyeOpenProb = " + face.getIsLeftEyeOpenProbability());
        Log.d(LOG_TAG,"getClassifications: rightEyeOpenProb = " + face.getIsRightEyeOpenProbability());

    }
}
