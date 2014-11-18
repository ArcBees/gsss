# Mixins documentation

## How to install

Add `com/arcbees/gsss/mixin/client/mixin.gss` and your Gss file path in a `@Source` annotation.

    @Source({"com/arcbees/gsss/mixin/client/mixins.gss", "style.gss"})
    public Style style();
    
Add a `@require 'mixins';` at the beginning of your Gss file that uses the mixins. This will force the compiler to check at compile time that the source is well imported.

You can now use any mixins in your style.gss file.

## Border radius

### Params

*   @param TOP size of the top corners
*   @param BOTTOM size of the bottom corners
*   @param LEFT size of the left corners
*   @param RIGHT size of the right corners
*   @param TOP_RIGHT size of the top right corner
*   @param BOTTOM_RIGHT size of the bottom right corner
*   @param BOTTOM_LEFT size of the bottom left corner
*   @param TOP_LEFT size of the top left corner
*   @param SIZE size of all corners

### Mixins

#### borderradius(TOP_RIGHT, BOTTOM_RIGHT, BOTTOM_LEFT, TOP_LEFT)

    @mixin borderradius(5px, 0, 10px, 0);

#### rounded(SIZE)
    
    @mixin rounded(12px);

#### borderradius_t(TOP)

    @mixin borderradius_t(5px);

#### borderradius_b(BOTTOM)

    @mixin borderradius_b(5px);

#### borderradius_l(LEFT)

    @mixin borderradius_l(5px);

#### borderradius_r(RIGHT)

    @mixin borderradius_r(5px);

#### borderradius_tr(TOP_RIGHT)

    @mixin borderradius_tr(5px);

#### borderradius_tl(TOP_LEFT)

    @mixin borderradius_tl(5px);

#### borderradius_br(BOTTOM_RIGHT)

    @mixin borderradius_br(5px);

#### borderradius_bl(BOTTOM_LEFT)

    @mixin borderradius_bl(5px);

## Box Sizing

### Mixins

#### boxsizing()

    @mixin boxsizing();

## Gradient

### Params

*   @param FIRST_COLOR first color
*   @param SECOND_COLOR second color
*   @param INNER_COLOR inner color
*   @param OUTER_COLOR outer color

### Mixins

#### gradient(FIRST_COLOR, SECOND_COLOR)

    @mixin gradient(#ff22ee, #0044e1);

#### gradient_h(FIRST_COLOR, SECOND_COLOR)

    @mixin gradient_h(#ff22ee, #0044e1);

#### gradient_tlbr(FIRST_COLOR, SECOND_COLOR)

    @mixin gradient(#ff22ee, #0044e1);

#### gradient_bltr(FIRST_COLOR, SECOND_COLOR)

    @mixin gradient(#ff22ee, #0044e1);

#### gradient_circular(FIRST_COLOR, SECOND_COLOR)

    @mixin gradient(#ff22ee, #0044e1);

## Opacity

### Params

*   @param ALPHA shadow opacity (0 to 1)

### Mixins

#### opacity(ALPHA)

    @mixin alpha(0.5);

## Outline

### Params

*   @param SIZE size of the border outline
*   @param BORDER border style type
*   @param COLOR color of the outline
*   @param OFFSET offset from the element

### Mixins

#### outline(SIZE, BORDER, COLOR, OFFSET)

    @mixin outline(2px, solid, #000, 10px);

## Shadow

### Params

*   @param HORIZONTAL position of the horizontal shadow
*   @param VERTICAL position of the vertical shadow
*   @param BLUR distance of the blur
*   @param SPREAD shadow size
*   @param COLOR shadow color
*   @param ALPHA shadow opacity (0 to 1)

### Mixins

#### shadow(HORIZONTAL, VERTICAL, BLUR, ALPHA)

    @mixin shadow(1px, 1px, 5px, 0.3);

#### shadow_color(HORIZONTAL, VERTICAL, BLUR, SPREAD, COLOR)

    @mixin shadow_color(5px, 5px, 10px, #22ee22);

#### shadow_inner(HORIZONTAL, VERTICAL, BLUR, ALPHA)

    @mixin shadow_inner(0, 5px, 2px, 0.5);

#### shadow_inner_color(HORIZONTAL, VERTICAL, BLUR, SPREAD, COLOR)

    @mixin shadow_inset(0, 1px, 2px, 2px, rgba(200, 100, 50, 0.2));

#### shadow_text(HORIZONTAL, VERTICAL, BLUR, ALPHA)

    @mixin shadow_text(2px, 2px, 1px, 0.5);

#### shadow_text_color(HORIZONTAL, VERTICAL, BLUR, COLOR)

    @mixin shadow_text_color(0, 5px, 2px, #11ff66);

#### shadow_none()

    @mixin shadow_none();

## Transform

### Params

*   @param DEGREES angle of the rotation
*   @param RATIO_HORIZONTAL horizontal ratio (x) where 1 = no changes and 2 = twice the size
*   @param RATIO_VERTICAL vertical ratio (y) where 1 = no changes and 2 = twice the size
*   @param HORIZONTAL horizontal change (x) in pixels
*   @param VERTICAL vertical change (x) in pixels

### Flip

#### flip_horizontal()

    @mixin flip_horizontal();

#### flip_vertical()

    @mixin flip_vertical();

### Rotate

#### rotate(DEGREE)

    @mixin rotate(45deg);

#### rotate_180_cw()

    @mixin rotate_180_cw();

#### rotate_180_ccw()

    @mixin rotate_180_ccw();

### Scale

#### scale(RATIO_HORIZONTAL, RATIO_VERTICAL)

    @mixin scale(1.5, 1);

### Translate

#### translate(HORIZONTAL, VERTICAL)

    @mixin translate(10px, 20px);

## Transition

### Params

*   @param PROPERTY name of the CSS property affected
*   @param DURATION time of the transition effect
*   @param EFFECT speed curve of the transition effect
*   @param DELAY time before the transition effect starts

### Mixins

#### transition(PROPERTY, DURATION)

    @mixin transition(margin-left, 200);

#### transition_effect(PROPERTY, DURATION, EFFECT)

    @mixin transition(all, 500, ease);

#### transition_delay(PROPERTY, DURATION, EFFECT, DELAY)

    @mixin transition(width, 250, ease, 100);