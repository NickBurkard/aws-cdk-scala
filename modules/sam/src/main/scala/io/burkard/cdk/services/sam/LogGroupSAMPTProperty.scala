package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogGroupSAMPTProperty {

  def apply(
    logGroupName: String
  ): software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty.Builder)
      .logGroupName(logGroupName)
      .build()
}
