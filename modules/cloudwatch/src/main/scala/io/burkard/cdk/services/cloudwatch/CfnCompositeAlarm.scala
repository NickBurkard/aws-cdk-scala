package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCompositeAlarm {

  def apply(
    internalResourceId: String,
    insufficientDataActions: Option[List[String]] = None,
    okActions: Option[List[String]] = None,
    actionsEnabled: Option[Boolean] = None,
    alarmRule: Option[String] = None,
    alarmActions: Option[List[String]] = None,
    alarmName: Option[String] = None,
    alarmDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm =
    software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm.Builder
      .create(stackCtx, internalResourceId)
      .insufficientDataActions(insufficientDataActions.map(_.asJava).orNull)
      .okActions(okActions.map(_.asJava).orNull)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmRule(alarmRule.orNull)
      .alarmActions(alarmActions.map(_.asJava).orNull)
      .alarmName(alarmName.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
