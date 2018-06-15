/*
 * Copyright (c) 2018.  Adrian Raff AKA Fr0stsp1re
 * ************PROJECT LICENSE*************
 *
 * This project was submitted by Adrian Raff as part of the  Android Basics Nanodegree At Udacity.
 *
 * The Udacity Honor code requires your submissions must be your own work.
 * Submitting this project as yours will cause you to break the Udacity Honor Code
 * and may result in disiplinary action.
 *
 * The author of this project allows you to check the code as a reference only. You may not submit this project or any part
 * of the code as your own.
 *
 * Besides the above notice, the following license applies and this license notice
 * must be included in all works derived from this project.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.fr0stsp1re.fr0stmixsampler;


public class Info {


    // First set of info
    private String mDefaultInfo;


    // Second Set of info
    private String mSecondInfo;

    // Third set of info
    private String mThirdInfo;

    // Drawable resource ID
    private int mImageResourceId;


    // New info object starts here
    public Info(String defaultInformation, String secondInfo, String thirdInfo, int imageResourceId) {

        //Grab passed arguments
        mDefaultInfo = defaultInformation;
        mSecondInfo = secondInfo;
        mImageResourceId = imageResourceId;
        mThirdInfo = thirdInfo;

    }

    // first info set
    public String getmDefaultInfo() {

        return mDefaultInfo;

    }

    // Second info set
    public String getmSecondInfo() {

        return mSecondInfo;

    }

    // Third info set
    public String getmThirdInfo() {

        return mThirdInfo;

    }

    //Image set
    public int getImageResourceId() {

        return mImageResourceId;

    }

}