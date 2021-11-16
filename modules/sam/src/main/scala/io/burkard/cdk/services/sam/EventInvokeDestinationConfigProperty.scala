package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventInvokeDestinationConfigProperty {

  def apply(
    onSuccess: software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty,
    onFailure: software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty
  ): software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty.Builder)
      .onSuccess(onSuccess)
      .onFailure(onFailure)
      .build()
}
