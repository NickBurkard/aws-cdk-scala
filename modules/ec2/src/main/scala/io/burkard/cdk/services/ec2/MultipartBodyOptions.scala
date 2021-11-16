package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MultipartBodyOptions {

  def apply(
    contentType: String,
    body: Option[String] = None,
    transferEncoding: Option[String] = None
  ): software.amazon.awscdk.services.ec2.MultipartBodyOptions =
    (new software.amazon.awscdk.services.ec2.MultipartBodyOptions.Builder)
      .contentType(contentType)
      .body(body.orNull)
      .transferEncoding(transferEncoding.orNull)
      .build()
}
