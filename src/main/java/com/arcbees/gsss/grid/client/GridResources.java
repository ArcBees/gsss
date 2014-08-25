package com.arcbees.gsss.grid.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.GssResource;

public interface GridResources extends ClientBundle {
    public interface Grid extends GssResource {
        String row();

        String col();

        String col_m_1_4();
        String col_m_1_2();
        String col_m_3_4();
        String col_m_full();
        String col_m_hide();

        String col_t_1_8();
        String col_t_1_4();
        String col_t_3_8();
        String col_t_1_2();
        String col_t_5_8();
        String col_t_3_4();
        String col_t_7_8();
        String col_t_full();
        String col_t_hide();
        String col_t_push_1_4();

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
        String col_push_1_3();
    }

    @Source("grid.gss")
    Grid grid();
}
