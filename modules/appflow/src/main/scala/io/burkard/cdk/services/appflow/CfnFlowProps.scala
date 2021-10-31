package io.burkard.cdk.services.appflow

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowProps {

  def apply(
    destinationFlowConfigList: Option[List[_]] = None,
    kmsArn: Option[String] = None,
    flowName: Option[String] = None,
    tasks: Option[List[_]] = None,
    sourceFlowConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty] = None,
    description: Option[String] = None,
    triggerConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.appflow.CfnFlowProps =
    (new software.amazon.awscdk.services.appflow.CfnFlowProps.Builder)
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
