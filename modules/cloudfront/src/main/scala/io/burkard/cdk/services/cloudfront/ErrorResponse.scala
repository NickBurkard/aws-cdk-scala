package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ErrorResponse {

  def apply(
    httpStatus: Number,
    responseHttpStatus: Option[Number] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    responsePagePath: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.ErrorResponse =
    (new software.amazon.awscdk.services.cloudfront.ErrorResponse.Builder)
      .httpStatus(httpStatus)
      .responseHttpStatus(responseHttpStatus.orNull)
      .ttl(ttl.orNull)
      .responsePagePath(responsePagePath.orNull)
      .build()
}
