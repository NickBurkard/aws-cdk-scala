package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskProperty {

  def apply(
    sourceFields: List[String],
    taskType: String,
    taskProperties: Option[List[_]] = None,
    connectorOperator: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty] = None,
    destinationField: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty.Builder)
      .sourceFields(sourceFields.asJava)
      .taskType(taskType)
      .taskProperties(taskProperties.map(_.asJava).orNull)
      .connectorOperator(connectorOperator.orNull)
      .destinationField(destinationField.orNull)
      .build()
}
