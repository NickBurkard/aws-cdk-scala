package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationConfigProperty {

  def apply(
    onFailure: software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty
  ): software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty.Builder)
      .onFailure(onFailure)
      .build()
}
