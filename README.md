# Enhanced Android Face Recognition with Deep Learning - Library
## Improvement
### 1.Support for Caffe frameworks under multiple platforms
The project originally only provided libcaffe.so and libcaffe_jni.so files under the armeabi-v7a platform, and did not mention that they modified the source code for generating .so files, so there is a problem with scalability.

The Caffe framework of this project was successfully tested on Xiaomi NOTE3.
### 2.Fix some bugs
fix error : Check failed: net_->has_blob(blob_names[i]) Unknown feature blob named VGG_FACE.caffemodel

## JavaDoc
https://qualeams.github.io/Android-Face-Recognition-with-Deep-Learning-Library/

### (Recommended) Include as an Android module from source
1. git clone https://github.com/luohl364218/Android-Face-Recognition-with-Deep-Learning-Library.git
2. Import the facerecognitionlibrary in the existing Android Studio project