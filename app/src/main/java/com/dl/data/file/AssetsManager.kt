package com.dl.data.file

import android.content.Context
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

/**
 * description:
 * Created by dailei on 2021/1/21
 *
 */
object AssetsManager {

    fun getAssetsContent(context: Context): String? {
        val fileName = "dl.txt"
        var inputStream: InputStream? = null
        var reader: BufferedReader? = null
        try {
            inputStream = context.assets.open(fileName)
            reader = BufferedReader(InputStreamReader(inputStream))
            val stringBuffer = StringBuilder()
            var line: String?
            do {
                line = reader.readLine()
                if (line != null) {
                    stringBuffer.append(line)
                }
            } while (line != null)
            return stringBuffer.toString()
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            //关闭操作
            inputStream?.close()
            reader?.close()
        }
        return null
    }
}