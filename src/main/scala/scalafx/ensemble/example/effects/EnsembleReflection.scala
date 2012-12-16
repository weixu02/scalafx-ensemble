package scalafx.ensemble.example.effects

import scalafx.ensemble.commons.EnsembleExample
import scalafx.geometry.Insets
import scalafx.scene.control.Label
import scalafx.scene.effect.Reflection
import scalafx.scene.image.Image
import scalafx.scene.image.Image.sfxImage2jfx
import scalafx.scene.image.ImageView
import scalafx.scene.layout.VBox
import scalafx.scene.text.Font

class EnsembleReflection extends EnsembleExample {
  def getContent = {
    new VBox {
      vgrow = javafx.scene.layout.Priority.ALWAYS
      hgrow = javafx.scene.layout.Priority.ALWAYS
      spacing = 10
      margin = Insets(50, 0, 0, 50)
      style = "-fx-padding: 8px"
      content = List(
        new Label {
          text = "Ensemble Reflection"
          font = new Font("Verdana", 20)
        },
        new ImageView {
          image = new Image(this.getClass.getResourceAsStream("/scalafx/ensemble/images/boat.jpg"))
          fitHeight = 150
          preserveRatio = true
          effect = new Reflection()
        })
    }
  }
}