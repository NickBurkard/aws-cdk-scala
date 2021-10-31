package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    operation: Option[String] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty =
    (new software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty.Builder)
      .operation(operation.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
