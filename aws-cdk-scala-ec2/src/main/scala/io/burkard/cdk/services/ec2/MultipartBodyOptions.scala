package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MultipartBodyOptions {

  def apply(
    body: Option[String] = None,
    contentType: Option[String] = None,
    transferEncoding: Option[String] = None
  ): software.amazon.awscdk.services.ec2.MultipartBodyOptions =
    (new software.amazon.awscdk.services.ec2.MultipartBodyOptions.Builder)
      .body(body.orNull)
      .contentType(contentType.orNull)
      .transferEncoding(transferEncoding.orNull)
      .build()
}
