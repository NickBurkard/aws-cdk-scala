package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationProperty {

  def apply(
    `type`: Option[String] = None,
    destination: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty.Builder)
      .`type`(`type`.orNull)
      .destination(destination.orNull)
      .build()
}
