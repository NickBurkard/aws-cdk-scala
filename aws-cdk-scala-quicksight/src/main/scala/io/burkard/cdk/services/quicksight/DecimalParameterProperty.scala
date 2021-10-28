package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DecimalParameterProperty {

  def apply(
    name: Option[String] = None,
    values: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.quicksight.CfnAnalysis.DecimalParameterProperty =
    (new software.amazon.awscdk.services.quicksight.CfnAnalysis.DecimalParameterProperty.Builder)
      .name(name.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
