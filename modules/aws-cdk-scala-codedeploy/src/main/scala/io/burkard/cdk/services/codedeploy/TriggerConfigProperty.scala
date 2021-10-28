package io.burkard.cdk.services.codedeploy

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TriggerConfigProperty {

  def apply(
    triggerTargetArn: Option[String] = None,
    triggerEvents: Option[List[String]] = None,
    triggerName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty.Builder)
      .triggerTargetArn(triggerTargetArn.orNull)
      .triggerEvents(triggerEvents.map(_.asJava).orNull)
      .triggerName(triggerName.orNull)
      .build()
}
