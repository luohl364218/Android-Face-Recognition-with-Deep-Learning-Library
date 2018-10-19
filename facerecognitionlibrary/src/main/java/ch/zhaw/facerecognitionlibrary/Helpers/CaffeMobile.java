/* Copyright (c) 2015, Shiro Bai
All rights reserved.
==============================================================================*/

package ch.zhaw.facerecognitionlibrary.Helpers;

import java.nio.charset.StandardCharsets;

/**
 * Created by shiro on 3/26/15.
 */
public class CaffeMobile {
    public  native void setNumThreads(int numThreads);

    public native void enableLog(boolean enabled);  // currently nonfunctional

    public native int loadModel(String modelPath, String weightsPath);  // required

    private native void setMeanWithMeanFile(String meanFile);

    private native void setMeanWithMeanValues(float[] meanValues);

    public native void setScale(float scale);

    public native float[] getConfidenceScore(String imgPath);

    public native int[] predictImage(String imgPath, int k);

    /*
    * adjust this method's parameters to its origin form,
    * if we don't fix this, we can't get the JNI-LIBS for other platforms (arm64-v8a、armeabi、x86、x86_64)
    * look at this https://github.com/sh1r0/caffe-android-demo/tree/master/app/src/main/java/com/sh1r0/caffe_android_lib
    * */
    public native float[][] extractFeatures(byte[] data, int width, int height, String blobNames);

    public void setMean(float[] meanValues) {
        setMeanWithMeanValues(meanValues);
    }

    public void setMean(String meanFile) {
        setMeanWithMeanFile(meanFile);
    }

    public int[] predictImage(String imgPath) {
        return predictImage(imgPath, 1);
    }

    public float[][] getRepresentationLayer(String imgPath, String layer){
        return extractFeatures(stringToBytes(imgPath), 0, 0, layer);
    }

    private static byte[] stringToBytes(String s) {
        return s.getBytes(StandardCharsets.US_ASCII);
    }
}
