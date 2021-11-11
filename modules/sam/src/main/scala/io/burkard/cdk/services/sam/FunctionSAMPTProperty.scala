package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionSAMPTProperty {

  def apply(
    functionName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty.Builder)
      .functionName(functionName.orNull)
      .build()
}
