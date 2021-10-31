package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FlowDefinitionProperty {

  def apply(
    kmsArn: Option[String] = None,
    flowName: Option[String] = None,
    tasks: Option[List[_]] = None,
    sourceFlowConfig: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty] = None,
    description: Option[String] = None,
    triggerConfig: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty.Builder)
      .kmsArn(kmsArn.orNull)
      .flowName(flowName.orNull)
      .tasks(tasks.map(_.asJava).orNull)
      .sourceFlowConfig(sourceFlowConfig.orNull)
      .description(description.orNull)
      .triggerConfig(triggerConfig.orNull)
      .build()
}
