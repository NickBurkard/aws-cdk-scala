package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpParametersProperty {

  def apply(
    pathParameterValues: Option[List[String]] = None,
    headerParameters: Option[Map[String, String]] = None,
    queryStringParameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty.Builder)
      .pathParameterValues(pathParameterValues.map(_.asJava).orNull)
      .headerParameters(headerParameters.map(_.asJava).orNull)
      .queryStringParameters(queryStringParameters.map(_.asJava).orNull)
      .build()
}
