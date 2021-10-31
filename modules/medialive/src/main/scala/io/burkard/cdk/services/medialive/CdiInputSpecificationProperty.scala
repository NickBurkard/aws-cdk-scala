package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CdiInputSpecificationProperty {

  def apply(
    resolution: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty.Builder)
      .resolution(resolution.orNull)
      .build()
}
