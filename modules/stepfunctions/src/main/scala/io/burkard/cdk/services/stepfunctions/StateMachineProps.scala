package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StateMachineProps {

  def apply(
    definition: software.amazon.awscdk.services.stepfunctions.IChainable,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    tracingEnabled: Option[Boolean] = None,
    stateMachineType: Option[software.amazon.awscdk.services.stepfunctions.StateMachineType] = None,
    logs: Option[software.amazon.awscdk.services.stepfunctions.LogOptions] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    stateMachineName: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.StateMachineProps =
    (new software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder)
      .definition(definition)
      .role(role.orNull)
      .tracingEnabled(tracingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stateMachineType(stateMachineType.orNull)
      .logs(logs.orNull)
      .timeout(timeout.orNull)
      .stateMachineName(stateMachineName.orNull)
      .build()
}
