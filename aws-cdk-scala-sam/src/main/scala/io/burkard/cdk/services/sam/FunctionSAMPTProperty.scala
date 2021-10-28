package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FunctionSAMPTProperty {

  def apply(
    functionName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty.Builder)
      .functionName(functionName.orNull)
      .build()
}
