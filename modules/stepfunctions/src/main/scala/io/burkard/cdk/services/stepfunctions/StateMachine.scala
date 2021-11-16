package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StateMachine {

  def apply(
    internalResourceId: String,
    definition: software.amazon.awscdk.services.stepfunctions.IChainable,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    tracingEnabled: Option[Boolean] = None,
    stateMachineType: Option[software.amazon.awscdk.services.stepfunctions.StateMachineType] = None,
    logs: Option[software.amazon.awscdk.services.stepfunctions.LogOptions] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    stateMachineName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.StateMachine =
    software.amazon.awscdk.services.stepfunctions.StateMachine.Builder
      .create(stackCtx, internalResourceId)
      .definition(definition)
      .role(role.orNull)
      .tracingEnabled(tracingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stateMachineType(stateMachineType.orNull)
      .logs(logs.orNull)
      .timeout(timeout.orNull)
      .stateMachineName(stateMachineName.orNull)
      .build()
}
