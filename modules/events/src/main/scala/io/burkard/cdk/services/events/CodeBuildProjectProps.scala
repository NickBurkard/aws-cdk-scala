package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeBuildProjectProps {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    eventRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    event: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.CodeBuildProjectProps =
    (new software.amazon.awscdk.services.events.targets.CodeBuildProjectProps.Builder)
      .maxEventAge(maxEventAge.orNull)
      .eventRole(eventRole.orNull)
      .event(event.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
