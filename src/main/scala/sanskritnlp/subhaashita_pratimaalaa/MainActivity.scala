package sanskritnlp.subhaashita_pratimaalaa

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import sanskritnlp.transliteration.transliterator

class MainActivity extends AppCompatActivity {
  // allows accessing `.value` on TR.resource.constants
  implicit val context: MainActivity = this

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    // type ascription is required due to SCL-10491
    val vh = TypedViewHolder.setContentView(this, TR.layout.main).asInstanceOf[TypedViewHolder.main]
    val quoteId = transliterator.transliterate("महा-सुभाषित-सङ्ग्रहे ", sourceScheme = "iast", destScheme = transliterator.scriptDevanAgarI)
    vh.text.setText(s"$quoteId, from ${TR.string.app_name.value}")
    vh.image.getDrawable match {
      case a: Animatable => a.start()
      case _ => // not animatable
    }
  }
}