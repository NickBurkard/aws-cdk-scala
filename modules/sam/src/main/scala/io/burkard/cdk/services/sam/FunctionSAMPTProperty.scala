package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionSAMPTProperty {

  def apply(
    functionName: String
  ): software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty.Builder)
      .functionName(functionName)
      .build()
}
