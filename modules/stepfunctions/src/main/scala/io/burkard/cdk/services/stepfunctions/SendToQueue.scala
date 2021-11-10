package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SendToQueue {

  def apply(
    queue: software.amazon.awscdk.services.sqs.IQueue,
    delay: Option[software.amazon.awscdk.Duration] = None,
    messageDeduplicationId: Option[String] = None,
    messageBody: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    messageGroupId: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SendToQueue =
    software.amazon.awscdk.services.stepfunctions.tasks.SendToQueue.Builder
      .create(queue)
      .delay(delay.orNull)
      .messageDeduplicationId(messageDeduplicationId.orNull)
      .messageBody(messageBody.orNull)
      .messageGroupId(messageGroupId.orNull)
      .integrationPattern(integrationPattern.orNull)
      .build()
}
