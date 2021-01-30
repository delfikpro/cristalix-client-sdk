package ru.cristalix.uiengine.element

import dev.xdark.clientapi.item.ItemStack
import ru.cristalix.uiengine.utility.Color
import ru.cristalix.uiengine.utility.V3

class ItemData(
    scale: V3,
    offset: V3,
    align: V3,
    origin: V3,
    color: Color,
    override var stack: ItemStack
) : ElementData(
    scale,
    offset,
    align,
    origin,
    color
), Item

class Item(private val item: Item) : Element(item), Item {

    override var stack: ItemStack = item.stack
        get() {
            //updates.add(something)
            return field
        }
        set(value) {
            item.stack = value
            field = value
            //updates.add(something)
        }

}