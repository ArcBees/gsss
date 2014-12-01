/*
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.gsss.animation.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface AnimationResources extends ClientBundle {
    interface Animation extends CssResource {
        String animation();

        String infinite();

        String spin();

        String spinCCW();

        String bounceIn();

        String bounceOut();

        String zoomIn();

        String zoomOut();

        String fadeIn();

        String fadeOut();

        String pulse();

        String slideInUp();

        String slideInDown();

        String slideInDownPulse();

        String slideInUpPulse();

        String slideInDownBounce();

        String slideInUpBounce();

        String slideOutUpBounce();

        String slideOutDownBounce();
    }

    @Source({"animationsettings.gss", "animations.gss"})
    Animation animation();
}
