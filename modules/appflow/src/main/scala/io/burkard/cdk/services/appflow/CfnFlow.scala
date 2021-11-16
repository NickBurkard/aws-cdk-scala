package io.burkard.cdk.services.appflow

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlow {

  def apply(
    internalResourceId: String,
    destinationFlowConfigList: List[_],
    flowName: String,
    tasks: List[_],
    sourceFlowConfig: software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty,
    triggerConfig: software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty,
    kmsArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appflow.CfnFlow =
    software.amazon.awscdk.services.appflow.CfnFlow.Builder
      .create(stackCtx, internalResourceId)
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
