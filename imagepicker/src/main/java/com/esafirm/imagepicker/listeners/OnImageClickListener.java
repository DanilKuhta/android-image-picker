package com.esafirm.imagepicker.listeners;

import com.esafirm.imagepicker.model.Image;

public interface OnImageClickListener {
    boolean onImageClick(Image image, boolean isSelected);
}
