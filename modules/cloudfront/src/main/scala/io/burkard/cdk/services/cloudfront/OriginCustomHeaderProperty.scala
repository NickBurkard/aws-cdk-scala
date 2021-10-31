package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginCustomHeaderProperty {

  def apply(
    headerName: Option[String] = None,
    headerValue: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder)
      .headerName(headerName.orNull)
      .headerValue(headerValue.orNull)
      .build()
}
