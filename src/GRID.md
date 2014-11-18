# Grid documentation

## How to install

Add the grid settings `com/arcbees/gsss/grid/client/gridsettings.gss` and the grid `com/arcbees/gsss/grid/client/grid.gss` in a `@Source` annotation.

    @Source({"com/arcbees/gsss/grid/client/gridsettings.gss", "com/arcbees/gsss/grid/client/grid.gss"})
    GridResources.Grid grid();
    
You can now use the grid in your project.

## The default structure

The grid is working on a 12 columns system. Group of columns are wrapped inside a row.

Start by adding a `row` element. Inside of it, add the desired columns using `col` for each one and specify the size of it (refer to the *Columns size* section for more info).

    <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder" xmlns:g="urn:import:com.google.gwt.user.client.ui">
    
        <ui:with field="resources" type="path.to.your.resources.ResourcesFile"/>
        
        <g:HTMLPanel>
        
            <div class="{resources.grid.row}">
                <div class="{resources.grid.col} {resources.grid.col_1_2}">
            </div>
            
        </g:HTMLPanel>
    </ui:UiBinder>

## Grid breakpoints

The grid is supporting 3 sizes of viewport :

*   Desktop _(default : for screens width of 980px and higher)_
*   Tablet _(default : for screens width ranging between 650px to 979px)_
*   Mobile _(default : for screens width up to 649px)_

## Columns size

Start adjusting for desktop, and then fine tune for tablet and mobile if required, as style applied to larger resolutions will cascade through lower resolutions.

### Default

Default style, will also be applied to Tablet and Mobile if not overwritten

    .col_1, .col_1_12:      1 / 12
    .col_2, .col_1_6:       1 / 6
    .col_3, .col_1_4:       1 / 4
    .col_4, .col_1_3:       1 / 3
    .col_5, .col_5_12:      5 / 12
    .col_6, .col_1_2:       1 / 2
    .col_7, .col_7_12:      7 / 12
    .col_8, .col_2_3:       2 / 3
    .col_9, .col_3_4:       3 / 4
    .col_10, .col_5_6:      5 / 6
    .col_11, .col_11_12:    11 / 12
    .col_12, .col_full:     Full
    .col_hide:              Hidden
    
### Tablet

Tablet style, will also be applied to Mobile if not overwritten

    .col_t_1, .col_t_1_12:      1 / 12
    .col_t_2, .col_t_1_6:       1 / 6
    .col_t_3, .col_t_1_4:       1 / 4
    .col_t_4, .col_t_1_3:       1 / 3
    .col_t_5, .col_t_5_12:      5 / 12
    .col_t_6, .col_t_1_2:       1 / 2
    .col_t_7, .col_t_7_12:      7 / 12
    .col_t_8, .col_t_2_3:       2 / 3
    .col_t_9, .col_t_3_4:       3 / 4
    .col_t_10, .col_t_5_6:      5 / 6
    .col_t_11, .col_t_11_12:    11 / 12
    .col_t_12, .col_t_full:     Full
    .col_t_hide:                Hidden
    
### Mobile

Mobile style

    .col_m_1, .col_m_1_12:      1 / 12
    .col_m_2, .col_m_1_6:       1 / 6
    .col_m_3, .col_m_1_4:       1 / 4
    .col_m_4, .col_m_1_3:       1 / 3
    .col_m_5, .col_m_5_12:      5 / 12
    .col_m_6, .col_m_1_2:       1 / 2
    .col_m_7, .col_m_7_12:      7 / 12
    .col_m_8, .col_m_2_3:       2 / 3
    .col_m_9, .col_m_3_4:       3 / 4
    .col_m_10, .col_m_5_6:      5 / 6
    .col_m_11, .col_m_11_12:    11 / 12
    .col_m_12, .col_m_full:     Full
    .col_m_hide:                Hidden

## Push

You can push a column using the push class. It will do the same as creating an empty column of the specified size on the left of the current column.

    .col_push_1, .col_push_1_12:    1 / 12 push
    .col_push_2, .col_push_1_6:     1 / 6 push
    ...
    .col_push_11, .col_push_1_11:   11 / 12 push
    
Same as sizes, you can target the push to Tablet and Mobile size :

    .col_t_push_1, .col_t_push_1_12:     1 / 12 push for Tablet and lower
    .col_m_push_1, .col_m_push_1_12:     1 / 12 push for Mobile only
    
You can also overwrite a push with push_0 :

    .col_m_push_0:      No push for Mobile only
    
## Grid Settings

In order to change the Grid settings, you will need to duplicate the file `gridsettings.gss` file into you own resources directory and link to it instead of the default file.

    @Source({"your/path/to/the/file/gridsettings.gss", "com/arcbees/gsss/grid/client/grid.gss"})
    GridResources.Grid grid();
    
### Min and Max sizes of viewports

Min and Max define the minimum and maximum size of the different viewports

**Note:** In the current version of GSS, it is impossible to use a variable inside the `@media()` and, therefore, these variables are useless for now. We will update the code once it is possible to do so.
    
### Padding

Padding is added inside of columns.

### Gutter

Gutter is added outside of columns.
