package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TaskProperty {

  def apply(
    taskProperties: Option[List[_]] = None,
    connectorOperator: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty] = None,
    sourceFields: Option[List[String]] = None,
    destinationField: Option[String] = None,
    taskType: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty.Builder)
      .taskProperties(taskProperties.map(_.asJava).orNull)
      .connectorOperator(connectorOperator.orNull)
      .sourceFields(sourceFields.map(_.asJava).orNull)
      .destinationField(destinationField.orNull)
      .taskType(taskType.orNull)
      .build()
}
