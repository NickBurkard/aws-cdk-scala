package io.burkard.cdk.services.appflow

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFlow {

  def apply(
    internalResourceId: String,
    destinationFlowConfigList: Option[List[_]] = None,
    kmsArn: Option[String] = None,
    flowName: Option[String] = None,
    tasks: Option[List[_]] = None,
    sourceFlowConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty] = None,
    description: Option[String] = None,
    triggerConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appflow.CfnFlow =
    software.amazon.awscdk.services.appflow.CfnFlow.Builder
      .create(stackCtx, internalResourceId)
      .destinationFlowConfigList(destinationFlowConfigList.map(_.asJava).orNull)
      .kmsArn(kmsArn.orNull)
      .flowName(flowName.orNull)
      .tasks(tasks.map(_.asJava).orNull)
      .sourceFlowConfig(sourceFlowConfig.orNull)
      .description(description.orNull)
      .triggerConfig(triggerConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
