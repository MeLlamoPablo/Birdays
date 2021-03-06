/*
 * Copyright 2017 Evgeny Timofeev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.djonique.birdays.utils;

public interface Constants {

    // Activities
    String CONTACTS_UPLOADED = "CONTACTS_UPLOADED";
    String WRONG_CONTACTS_FORMAT = "WRONG_CONTACTS_FORMAT";
    int EDIT_ACTIVITY = 102;

    // Dialogs
    String NEW_PERSON_DIALOG_TAG = "NEW_PERSON_DIALOG_TAG";
    // String BOTTOM_SHEET_DIALOG_TAG = "BOTTOM_SHEET_DIALOG_TAG";

    // Permission requests
    int REQUEST_READ_CONTACTS = 1;
    int CONTACTS_REQUEST_PERMISSION_CODE = 2;
    int WRITE_EXTERNAL_STORAGE_PERMISSION_CODE = 3;

    // Alarm and Settings keys
    String NAME = "name";
    String NOTIFICATIONS_KEY = "notifications_key";
    String NOTIFICATION_TIME_KEY = "notification_time_key";
    String ADDITIONAL_NOTIFICATION_KEY = "additional_notification_key";
    String RINGTONE_KEY = "ringtone_key";
    String NIGHT_MODE_KEY = "night_mode_key";
    String DISPLAYED_AGE_KEY = "displayed_age_key";
    String AD_BANNER_KEY = "ad_banner_key";
    String AD_INTERSTITIAL_KEY = "ad_interstitial_key";

    // Intents
    String TIME_STAMP = "TIME_STAMP";
    String TEXT_PLAIN = "text/plain";
    String PACKAGE = "package:";
    String TYPE_EMAIL = "message/rfc822";
    String MAILTO = "mailto:";
    String TYPE_SMS = "vnd.android-dir/mms-sms";
    String ADDRESS = "address";
    String SMSTO = "smsto:";
    String TEL = "tel: ";

    // Firebase Analytics
    String NEW_PERSON_ADDED = "new_person_added";
    String FAMOUS_PERSON_CLICKED = "famous_person_clicked";
    String MAKE_CALL = "make_call";
    String SEND_MESSAGE = "send_sms";
    String SEND_EMAIL = "send_email";
    String SHARE_APP = "share_app";
    String AD_BANNER_DISABLED = "ad_banner_disabled";
    String DETAIL_ACTIVITY_TAG = "DetailActivity";
    String EDIT_ACTIVITY_TAG = "EditActivity";
    String SETTINGS_ACTIVITY_TAG = "SettingsActivity";
}