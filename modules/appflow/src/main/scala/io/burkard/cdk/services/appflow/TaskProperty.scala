package io.burkard.cdk.services.appflow

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskProperty {

  def apply(
    taskProperties: Option[List[_]] = None,
    connectorOperator: Option[software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty] = None,
    sourceFields: Option[List[String]] = None,
    destinationField: Option[String] = None,
    taskType: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty.Builder)
      .taskProperties(taskProperties.map(_.asJava).orNull)
      .connectorOperator(connectorOperator.orNull)
      .sourceFields(sourceFields.map(_.asJava).orNull)
      .destinationField(destinationField.orNull)
      .taskType(taskType.orNull)
      .build()
}
