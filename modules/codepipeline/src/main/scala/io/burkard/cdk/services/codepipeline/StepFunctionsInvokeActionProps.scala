package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepFunctionsInvokeActionProps {

  def apply(
    stateMachine: software.amazon.awscdk.services.stepfunctions.IStateMachine,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    executionNamePrefix: Option[String] = None,
    variablesNamespace: Option[String] = None,
    stateMachineInput: Option[software.amazon.awscdk.services.codepipeline.actions.StateMachineInput] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps.Builder)
      .stateMachine(stateMachine)
      .role(role.orNull)
      .executionNamePrefix(executionNamePrefix.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .stateMachineInput(stateMachineInput.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .output(output.orNull)
      .build()
}
