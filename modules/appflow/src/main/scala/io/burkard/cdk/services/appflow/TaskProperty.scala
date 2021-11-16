package io.burkard.cdk.services.appflow

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskProperty {

  def apply(
    sourceFields: List[String],
    taskType: String,
    taskProperties: Option[List[_]] = None,
    connectorOperator: Option[software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty] = None,
    destinationField: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty.Builder)
      .sourceFields(sourceFields.asJava)
      .taskType(taskType)
      .taskProperties(taskProperties.map(_.asJava).orNull)
      .connectorOperator(connectorOperator.orNull)
      .destinationField(destinationField.orNull)
      .build()
}
