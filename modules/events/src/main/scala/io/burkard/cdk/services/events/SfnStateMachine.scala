package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SfnStateMachine {

  def apply(
    machine: software.amazon.awscdk.services.stepfunctions.IStateMachine,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None,
    input: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.SfnStateMachine =
    software.amazon.awscdk.services.events.targets.SfnStateMachine.Builder
      .create(machine)
      .maxEventAge(maxEventAge.orNull)
      .role(role.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .input(input.orNull)
      .build()
}
