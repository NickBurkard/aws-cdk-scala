package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublishToTopicProps {

  def apply(
    message: software.amazon.awscdk.services.stepfunctions.TaskInput,
    subject: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    messagePerSubscriptionType: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.PublishToTopicProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.PublishToTopicProps.Builder)
      .message(message)
      .subject(subject.orNull)
      .integrationPattern(integrationPattern.orNull)
      .messagePerSubscriptionType(messagePerSubscriptionType.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
