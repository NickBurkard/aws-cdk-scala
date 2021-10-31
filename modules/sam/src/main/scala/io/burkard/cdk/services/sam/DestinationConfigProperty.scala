package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationConfigProperty {

  def apply(
    onFailure: Option[software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty.Builder)
      .onFailure(onFailure.orNull)
      .build()
}
