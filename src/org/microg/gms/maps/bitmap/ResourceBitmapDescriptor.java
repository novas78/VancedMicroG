/*
 * Copyright 2013-2015 µg Project Team
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

package org.microg.gms.maps.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ResourceBitmapDescriptor extends AbstractBitmapDescriptor {
    private int resourceId;

    public ResourceBitmapDescriptor(int resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public Bitmap generateBitmap(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), resourceId);
    }
}
