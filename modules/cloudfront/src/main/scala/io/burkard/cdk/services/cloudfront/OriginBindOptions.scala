package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginBindOptions {

  def apply(
    originId: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.OriginBindOptions =
    (new software.amazon.awscdk.services.cloudfront.OriginBindOptions.Builder)
      .originId(originId.orNull)
      .build()
}
