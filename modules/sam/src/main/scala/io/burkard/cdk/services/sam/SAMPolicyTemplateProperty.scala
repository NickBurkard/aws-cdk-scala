package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SAMPolicyTemplateProperty {

  def apply(
    stepFunctionsExecutionPolicy: Option[software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty] = None,
    lambdaInvokePolicy: Option[software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty.Builder)
      .stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.orNull)
      .lambdaInvokePolicy(lambdaInvokePolicy.orNull)
      .build()
}
