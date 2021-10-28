package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCompositeAlarmProps {

  def apply(
    insufficientDataActions: Option[List[String]] = None,
    okActions: Option[List[String]] = None,
    actionsEnabled: Option[Boolean] = None,
    alarmRule: Option[String] = None,
    alarmActions: Option[List[String]] = None,
    alarmName: Option[String] = None,
    alarmDescription: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps.Builder)
      .insufficientDataActions(insufficientDataActions.map(_.asJava).orNull)
      .okActions(okActions.map(_.asJava).orNull)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmRule(alarmRule.orNull)
      .alarmActions(alarmActions.map(_.asJava).orNull)
      .alarmName(alarmName.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
