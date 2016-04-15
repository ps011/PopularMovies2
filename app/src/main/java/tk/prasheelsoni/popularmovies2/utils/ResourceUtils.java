/*
 * Copyright 2015.  Emin Yahyayev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tk.prasheelsoni.popularmovies2.utils;

import android.content.res.Resources;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.util.TypedValue;

import timber.log.Timber;

public final class ResourceUtils {

    private ResourceUtils() {
        throw new AssertionError("No instances.");
    }

    public static float getFloatDimension(@NonNull Resources resources, @DimenRes int dimenRes) {
        TypedValue value = new TypedValue();
        resources.getValue(dimenRes, value, true);
        Timber.d("Value type: " + (value.type == TypedValue.TYPE_FLOAT));
        return value.getFloat();
    }
}
