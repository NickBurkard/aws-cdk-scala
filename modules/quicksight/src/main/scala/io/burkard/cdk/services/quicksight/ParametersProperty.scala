package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParametersProperty {

  def apply(
    stringParameters: Option[List[_]] = None,
    decimalParameters: Option[List[_]] = None,
    dateTimeParameters: Option[List[_]] = None,
    integerParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnAnalysis.ParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnAnalysis.ParametersProperty.Builder)
      .stringParameters(stringParameters.map(_.asJava).orNull)
      .decimalParameters(decimalParameters.map(_.asJava).orNull)
      .dateTimeParameters(dateTimeParameters.map(_.asJava).orNull)
      .integerParameters(integerParameters.map(_.asJava).orNull)
      .build()
}
