package com.recepgemalmaz.pazarama_bootcamp_ders_8_2_cizim_islemleri

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import kotlin.math.roundToInt

class CustomView(contex: Context) : View(contex) {

    private var x1: Float = 0.0F
    private var y1: Float = 0.0F
    private var x2: Float = 0.0F
    private var y2: Float = 0.0F
    private var flagUp = false

    override fun onDraw(canvas: Canvas) {

        super.onDraw(canvas)
        val kalem = Paint()

        if (flagUp) {
            kalem.color = Color.BLUE
            flagUp = false
        } else {
            kalem.color = Color.GREEN
            flagUp = true
        }

        kalem.style = Paint.Style.FILL
        kalem.strokeCap = Paint.Cap.ROUND
        kalem.strokeWidth = 15F
        //canvas.drawRect(25f, 30f, 250f, 400f, kalem)
        //canvas.drawCircle(x1, y, 100f, kalem)
        canvas.drawLine(x1, y1, x2, y2, kalem)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        var r = super.onTouchEvent(event)

        if (event!!.action == MotionEvent.ACTION_DOWN) {
            x1 = event.x
            y1 = event.y

            /*
            this.invalidate(
                dx - 100,
                dy - 100,
                dx + 100,
                dy + 100
            )//onDraw() fonksiyonunu tekrar çağırır.

             */
        }

        if (event!!.action == MotionEvent.ACTION_MOVE) {
            x2 = event.x
            y2 = event.y

            var dx = x.roundToInt()
            var dy = y.roundToInt()
            flagUp = false
            //this.invalidate( x1.toInt(),y1.toInt(), x2.toInt(), y2.toInt() )//onDraw() fonksiyonunu tekrar çağırır.
            this.invalidate()//onDraw() fonksiyonunu tekrar çağırır.
        }

        if (event!!.action == MotionEvent.ACTION_UP) {
            flagUp = true
        }

            return true
    }
}


/*


 */