package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StepFunctionsInvokeActionProps {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    executionNamePrefix: Option[String] = None,
    variablesNamespace: Option[String] = None,
    stateMachineInput: Option[software.amazon.awscdk.services.codepipeline.actions.StateMachineInput] = None,
    stateMachine: Option[software.amazon.awscdk.services.stepfunctions.IStateMachine] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps.Builder)
      .role(role.orNull)
      .executionNamePrefix(executionNamePrefix.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .stateMachineInput(stateMachineInput.orNull)
      .stateMachine(stateMachine.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .output(output.orNull)
      .build()
}
