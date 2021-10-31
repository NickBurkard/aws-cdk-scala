package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IntegerParameterProperty {

  def apply(
    name: Option[String] = None,
    values: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.IntegerParameterProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.IntegerParameterProperty.Builder)
      .name(name.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
