package com.example.notes.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import android.text.format.DateFormat.format
import kotlinx.parcelize.Parcelize
import java.util.*

@Entity(tableName = "note")
@Parcelize
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val title: String,
    val text: String,
    @ColumnInfo(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),
    @ColumnInfo(name = "modified_at")
    val modifiedAt:LocalDateTime = LocalDateTime.now()
): Parcelable {

    val createdDateFormatted : String
        get() = createdAt.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))

    val modifiedDateFormatted : String
        get() = modifiedAt.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))

}