package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualHostedStyleUrlOptions {

  def apply(
    regional: Option[Boolean] = None
  ): software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions =
    (new software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions.Builder)
      .regional(regional.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
