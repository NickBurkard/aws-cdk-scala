package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
