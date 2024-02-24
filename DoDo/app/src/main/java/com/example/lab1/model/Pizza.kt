package com.example.lab1.model

import android.os.Parcelable
import java.io.Serializable
import java.util.UUID

data class Pizza(
 override val id: String = UUID.randomUUID().toString(),
  override val name: String,
 override val shortdescription: String,
 override  val price: Int,
 override val imageRes: Int
):Serializable, ParentPizza(id, name, shortdescription, price, imageRes)