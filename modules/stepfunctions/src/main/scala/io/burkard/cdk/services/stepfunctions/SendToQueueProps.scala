package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SendToQueueProps {

  def apply(
    delay: Option[software.amazon.awscdk.Duration] = None,
    messageDeduplicationId: Option[String] = None,
    messageBody: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    messageGroupId: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SendToQueueProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.SendToQueueProps.Builder)
      .delay(delay.orNull)
      .messageDeduplicationId(messageDeduplicationId.orNull)
      .messageBody(messageBody.orNull)
      .messageGroupId(messageGroupId.orNull)
      .integrationPattern(integrationPattern.orNull)
      .build()
}
