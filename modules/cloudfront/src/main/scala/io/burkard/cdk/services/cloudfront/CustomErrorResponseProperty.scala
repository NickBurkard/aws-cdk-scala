package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomErrorResponseProperty {

  def apply(
    responseCode: Option[Number] = None,
    errorCode: Option[Number] = None,
    errorCachingMinTtl: Option[Number] = None,
    responsePagePath: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder)
      .responseCode(responseCode.orNull)
      .errorCode(errorCode.orNull)
      .errorCachingMinTtl(errorCachingMinTtl.orNull)
      .responsePagePath(responsePagePath.orNull)
      .build()
}
