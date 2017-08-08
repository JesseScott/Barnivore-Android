package com.barnivore.barnivore.models

import java.util.*

/**
 *
 * Created by jessescott on 2017-08-08.
 *
 */


data class Liquor(val name: String, val type: Int, val vegan: Boolean, val created: Date, val modified: Date, val notes: String )