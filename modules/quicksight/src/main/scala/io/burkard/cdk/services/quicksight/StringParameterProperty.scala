package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StringParameterProperty {

  def apply(
    name: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.StringParameterProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.StringParameterProperty.Builder)
      .name(name.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
