package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublishToTopic {

  def apply(
    topic: software.amazon.awscdk.services.sns.ITopic,
    subject: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    message: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    messagePerSubscriptionType: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.PublishToTopic =
    software.amazon.awscdk.services.stepfunctions.tasks.PublishToTopic.Builder
      .create(topic)
      .subject(subject.orNull)
      .integrationPattern(integrationPattern.orNull)
      .message(message.orNull)
      .messagePerSubscriptionType(messagePerSubscriptionType.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
