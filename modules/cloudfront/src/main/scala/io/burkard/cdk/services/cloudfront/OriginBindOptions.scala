package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginBindOptions {

  def apply(
    originId: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.OriginBindOptions =
    (new software.amazon.awscdk.services.cloudfront.OriginBindOptions.Builder)
      .originId(originId.orNull)
      .build()
}
