package com.esafirm.imagepicker.features;

import android.content.Context;

import com.esafirm.imagepicker.features.cameraonly.CameraOnlyConfig;

import java.util.ArrayList;

public class ImagePickerConfigFactory {

    public static CameraOnlyConfig createCameraDefault() {
        CameraOnlyConfig config = new CameraOnlyConfig();
        config.setSavePath(ImagePickerSavePath.DEFAULT);
        config.setReturnMode(ReturnMode.ALL);
        return config;
    }

    public static ImagePickerConfig createDefault(Context context) {
        ImagePickerConfig config = new ImagePickerConfig();
        config.setMode(IpCons.MODE_MULTIPLE);
        config.setImagesLimit(IpCons.MAX_LIMIT);
        config.setShowCamera(true);
        config.setFolderMode(false);
        config.setSelectedImages(new ArrayList<>());
        config.setSavePath(ImagePickerSavePath.DEFAULT);
        config.setReturnMode(ReturnMode.NONE);
        return config;
    }
}
