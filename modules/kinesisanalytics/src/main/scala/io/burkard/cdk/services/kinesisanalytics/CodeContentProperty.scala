package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeContentProperty {

  def apply(
    s3ContentLocation: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty] = None,
    textContent: Option[String] = None,
    zipFileContent: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder)
      .s3ContentLocation(s3ContentLocation.orNull)
      .textContent(textContent.orNull)
      .zipFileContent(zipFileContent.orNull)
      .build()
}
