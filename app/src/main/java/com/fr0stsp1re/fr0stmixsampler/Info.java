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

/**

 * {@link Word} represents a vocabulary word that the user wants to learn.

 * It contains a default translation and a Miwok translation for that word.

 */

public class Info {



    /** Default translation for the word */

    private String mDefaultTranslation;



    /** Miwok translation for the word */

    private String mMiwokTranslation;



    /**

     * Create a new Info object.

     *

     * @param defaultTranslation is the word in a language that the user is already familiar with

     *                           (such as English)

     * @param miwokTranslation is the word in the Miwok language

     */

    public Info(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;

    }



    /**

     * Get the default translation of the word.

     */

    public String getDefaultTranslation() {

        return mDefaultTranslation;

    }



    /**

     * Get the Miwok translation of the word.

     */

    public String getMiwokTranslation() {

        return mMiwokTranslation;

    }



}