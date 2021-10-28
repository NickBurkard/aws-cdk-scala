package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SfnStateMachineProps {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None,
    input: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.SfnStateMachineProps =
    (new software.amazon.awscdk.services.events.targets.SfnStateMachineProps.Builder)
      .maxEventAge(maxEventAge.orNull)
      .role(role.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .input(input.orNull)
      .build()
}
