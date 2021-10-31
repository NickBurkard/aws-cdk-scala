package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ErrorResponse {

  def apply(
    responseHttpStatus: Option[Number] = None,
    httpStatus: Option[Number] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    responsePagePath: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.ErrorResponse =
    (new software.amazon.awscdk.services.cloudfront.ErrorResponse.Builder)
      .responseHttpStatus(responseHttpStatus.orNull)
      .httpStatus(httpStatus.orNull)
      .ttl(ttl.orNull)
      .responsePagePath(responsePagePath.orNull)
      .build()
}
