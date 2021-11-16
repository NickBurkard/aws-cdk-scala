package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DateTimeParameterProperty {

  def apply(
    name: String,
    values: List[String]
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.DateTimeParameterProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.DateTimeParameterProperty.Builder)
      .name(name)
      .values(values.asJava)
      .build()
}
