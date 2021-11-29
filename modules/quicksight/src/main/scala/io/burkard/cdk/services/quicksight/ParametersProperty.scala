package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParametersProperty {

  def apply(
    stringParameters: Option[List[_]] = None,
    decimalParameters: Option[List[_]] = None,
    dateTimeParameters: Option[List[_]] = None,
    integerParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.ParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.ParametersProperty.Builder)
      .stringParameters(stringParameters.map(_.asJava).orNull)
      .decimalParameters(decimalParameters.map(_.asJava).orNull)
      .dateTimeParameters(dateTimeParameters.map(_.asJava).orNull)
      .integerParameters(integerParameters.map(_.asJava).orNull)
      .build()
}
