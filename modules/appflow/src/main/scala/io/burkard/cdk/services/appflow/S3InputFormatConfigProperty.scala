package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3InputFormatConfigProperty {

  def apply(
    s3InputFileType: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty.Builder)
      .s3InputFileType(s3InputFileType.orNull)
      .build()
}
