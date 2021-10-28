package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeConfig {

  def apply(
    image: Option[software.amazon.awscdk.services.lambda.CodeImageConfig] = None,
    s3Location: Option[software.amazon.awscdk.services.s3.Location] = None,
    inlineCode: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CodeConfig =
    (new software.amazon.awscdk.services.lambda.CodeConfig.Builder)
      .image(image.orNull)
      .s3Location(s3Location.orNull)
      .inlineCode(inlineCode.orNull)
      .build()
}
