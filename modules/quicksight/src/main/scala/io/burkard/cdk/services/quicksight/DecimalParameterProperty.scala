package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DecimalParameterProperty {

  def apply(
    name: String,
    values: List[_ <: Number]
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.DecimalParameterProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.DecimalParameterProperty.Builder)
      .name(name)
      .values(values.asJava)
      .build()
}
