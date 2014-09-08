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

package com.arcbees.gsss.grid.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.GssResource;

public interface GridResources extends ClientBundle {
    interface Grid extends GssResource {
        String row();

        String col();

        String col_m_1_4();
        String col_m_1_2();
        String col_m_3_4();
        String col_m_full();
        String col_m_hide();
        String col_m_push_1_4();
        String col_m_push_1_2();
        String col_m_push_3_4();
        String col_m_push_0();

        String col_t_1_8();
        String col_t_1_4();
        String col_t_3_8();
        String col_t_1_2();
        String col_t_5_8();
        String col_t_3_4();
        String col_t_7_8();
        String col_t_full();
        String col_t_hide();
        String col_t_push_1_8();
        String col_t_push_1_4();
        String col_t_push_3_8();
        String col_t_push_1_2();
        String col_t_push_5_8();
        String col_t_push_3_4();
        String col_t_push_7_8();
        String col_t_push_0();

        String col_1_12();
        String col_1_6();
        String col_1_4();
        String col_1_3();
        String col_5_12();
        String col_1_2();
        String col_7_12();
        String col_2_3();
        String col_3_4();
        String col_5_6();
        String col_11_12();
        String col_full();
        String col_hide();
        String col_push_1_12();
        String col_push_1_6();
        String col_push_1_4();
        String col_push_1_3();
        String col_push_5_12();
        String col_push_1_2();
        String col_push_7_12();
        String col_push_2_3();
        String col_push_3_4();
        String col_push_5_6();
        String col_push_11_12();
        String col_push_0();
    }

    @Source("grid.gss")
    Grid grid();
}
