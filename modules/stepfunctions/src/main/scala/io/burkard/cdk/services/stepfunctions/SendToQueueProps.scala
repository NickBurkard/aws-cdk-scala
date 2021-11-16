package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SendToQueueProps {

  def apply(
    messageBody: software.amazon.awscdk.services.stepfunctions.TaskInput,
    delay: Option[software.amazon.awscdk.Duration] = None,
    messageDeduplicationId: Option[String] = None,
    messageGroupId: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SendToQueueProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.SendToQueueProps.Builder)
      .messageBody(messageBody)
      .delay(delay.orNull)
      .messageDeduplicationId(messageDeduplicationId.orNull)
      .messageGroupId(messageGroupId.orNull)
      .integrationPattern(integrationPattern.orNull)
      .build()
}
