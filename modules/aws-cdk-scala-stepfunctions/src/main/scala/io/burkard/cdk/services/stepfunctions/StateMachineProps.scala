package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StateMachineProps {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    tracingEnabled: Option[Boolean] = None,
    stateMachineType: Option[software.amazon.awscdk.services.stepfunctions.StateMachineType] = None,
    logs: Option[software.amazon.awscdk.services.stepfunctions.LogOptions] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    definition: Option[software.amazon.awscdk.services.stepfunctions.IChainable] = None,
    stateMachineName: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.StateMachineProps =
    (new software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder)
      .role(role.orNull)
      .tracingEnabled(tracingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stateMachineType(stateMachineType.orNull)
      .logs(logs.orNull)
      .timeout(timeout.orNull)
      .definition(definition.orNull)
      .stateMachineName(stateMachineName.orNull)
      .build()
}
