package io.burkard.cdk.services.appflow

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowProps {

  def apply(
    destinationFlowConfigList: List[_],
    flowName: String,
    tasks: List[_],
    sourceFlowConfig: software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty,
    triggerConfig: software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty,
    kmsArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.appflow.CfnFlowProps =
    (new software.amazon.awscdk.services.appflow.CfnFlowProps.Builder)
      .destinationFlowConfigList(destinationFlowConfigList.asJava)
      .flowName(flowName)
      .tasks(tasks.asJava)
      .sourceFlowConfig(sourceFlowConfig)
      .triggerConfig(triggerConfig)
      .kmsArn(kmsArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
