package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationProperty {

  def apply(
    destination: String,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty.Builder)
      .destination(destination)
      .`type`(`type`.orNull)
      .build()
}
