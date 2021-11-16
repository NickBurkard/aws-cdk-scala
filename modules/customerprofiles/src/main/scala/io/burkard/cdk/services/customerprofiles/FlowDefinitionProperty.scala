package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FlowDefinitionProperty {

  def apply(
    kmsArn: String,
    flowName: String,
    tasks: List[_],
    sourceFlowConfig: software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty,
    triggerConfig: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty,
    description: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty.Builder)
      .kmsArn(kmsArn)
      .flowName(flowName)
      .tasks(tasks.asJava)
      .sourceFlowConfig(sourceFlowConfig)
      .triggerConfig(triggerConfig)
      .description(description.orNull)
      .build()
}
